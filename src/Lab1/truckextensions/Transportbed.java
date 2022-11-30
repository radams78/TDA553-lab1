package Lab1.truckextensions;

import java.util.Set;

import Lab1.vehicles.Car;

public class Transportbed implements Trailer {
    private Set<Car> loadedCars;
    private Boolean extendedRamp;
    private int capacity;

    public Transportbed(int capacity) {
        this.extendedRamp = false;
        this.capacity = capacity;
    }

    public Boolean getExtendedRamp() {
        return extendedRamp;
    }

    public void lowerRamp(double amount) {
        this.extendedRamp = true;
    }

    public void raiseRamp(double amount) {
        this.extendedRamp = false;
    }

    public Boolean allowDriving() {
        return !extendedRamp;
    }

    public double getCurrAngle() {
        return 0;
    }

    public double getMaxAngle() {
        return 0;
    }

    public double getMinAngle() {
        return 0;
    }

    public void loadCar(Car car) {
        if (loadedCars.size() < this.capacity) {
            loadedCars.add(car);
            car.stopEngine();
        } else {
            throw new IllegalStateException("Car transporter is full");
        }
    }

    public void unloadCar(Car car) {
        if (loadedCars.contains(car)) {
            loadedCars.remove(car);
        } else {
            throw new IllegalStateException("Car is not loaded");
        }
    }

    public void unloadAllCars() {
        loadedCars.clear();
    }

    public Set<Car> getCars() {
        return loadedCars;
    }
}
