package Lab1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import Lab1.truckextensions.Transportbed;

public class CarTransporter extends Truck {

    private List<Car> cars = new ArrayList<>();

    /**
     * @param nrDoors
     * @param enginePower
     * @param currentSpeed
     * @param color
     * @param modelName
     * @param nrWheels
     */
    public CarTransporter(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName,
            int nrWheels) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, nrWheels);
        this.trailer = new Transportbed();
    }

    public double speedFactor() {
        if (!trailer.allowDriving()) {
            return 0;
        } else {
            return getEnginePower() * 0.01;
        }
    }

    public void loadCar(Car car) {
        if (cars.size() < 4) {
            cars.add(car);
            car.setCurrentSpeed(0);
            car.stopEngine();
        } else {
            throw new IllegalStateException("Car transporter is full");
        }
    }

    public void unloadCar() {
        if (cars.size() > 0) {
            cars.remove(cars.size() - 1);
        } else {
            throw new IllegalStateException("Car transporter is empty");
        }
    }

    public void unloadCar(String name) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getModelName().equals(name)) {
                cars.remove(i);
                return;
            }
        }
        throw new IllegalStateException("Car transporter does not contain a car with the name " + name);
    }

    public void unloadAllCars() {
        cars.clear();
    }

    public List<Car> getCars() {
        return cars;
    }

}
