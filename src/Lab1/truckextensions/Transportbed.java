package Lab1.truckextensions;

import java.util.ArrayList;
import java.util.List;

import Lab1.vehicles.Car;

public class Transportbed implements Trailer {
    private List<Car> loadedCars = new ArrayList<>();
    private Boolean extendedRamp;

    public Transportbed() {
        this.extendedRamp = false;
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
        if (loadedCars.size() < 4) {
            loadedCars.add(car);
            car.stopEngine();
        } else {
            throw new IllegalStateException("Car transporter is full");
        }
    }

    public void unloadCar() {
        if (loadedCars.size() > 0) {
            loadedCars.remove(loadedCars.size() - 1);
        } else {
            throw new IllegalStateException("Car transporter is empty");
        }
    }

    public void unloadCar(String name) {
        for (int i = 0; i < loadedCars.size(); i++) {
            if (loadedCars.get(i).getModelName().equals(name)) {
                loadedCars.remove(i);
                return;
            }
        }
        throw new IllegalStateException("Car transporter does not contain a car with the name " + name);
    }

    public void unloadAllCars() {
        loadedCars.clear();
    }

    public List<Car> getCars() {
        return loadedCars;
    }

}
