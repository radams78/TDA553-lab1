package src;

import java.awt.*;

public class CarTransporter extends Truck {

    private Loadable loadedCars;
    private Ramp ramp = new Ramp();

    public CarTransporter() {
        super(2, 700, Color.gray, "Car Transporter");
        loadedCars = new Loadable(7, 5);
    }

    public void lowerRamp() {
        if (getCurrentSpeed() != 0) {throw new IllegalCallerException("Unable to lower ramp while Transporter is moving");}
        ramp.lowerRamp();
    }

    public void raiseRamp() {
        ramp.raiseRamp();
    }

    public void loadCar(Car car) {
        if (loadedCars.containsCar(car)) {throw new IllegalArgumentException("Car already loaded");}
        if (ramp.getState() != State.DOWN) {throw new IllegalCallerException("Ramp must be down to load cars");}
        if (loadedCars.getAmount() >= loadedCars.getCapacity()) {throw new IllegalCallerException("Unable to load more cars!");}
        if (calculateDistance(car.getX(), car.getY()) > loadedCars.getMaxDistance()) {throw new IllegalCallerException("Car too far from transporter!");}
        loadedCars.addCar(car);
    }

    public void unloadCar(Car car) {
        if (!loadedCars.containsCar(car)) {throw new IllegalArgumentException("Car not in loaded");}
        if (ramp.getState() != State.DOWN) {throw new IllegalCallerException("Ramp must be down to unload cars");}
        loadedCars.removeCar(car);
        car.setX(car.getX()+loadedCars.getMaxDistance());
        car.setY(car.getY()+loadedCars.getMaxDistance());
    }

    @Override
    public void gas(double amount) {
        if (ramp.getState() == State.DOWN) {throw new IllegalCallerException("Unable to move while ramp is down");}
        super.gas(amount);

    }

    public Ramp getRamp() {
        return ramp;
    }

    public Loadable getLoadedCars() {
        return loadedCars;
    }
}
