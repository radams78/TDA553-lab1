package src;

import java.util.*;

public class Loadable {
    
    private final int CAPACITY;
    private final int MAXDISTANCE;
    private List<Car> carsLoaded;

    public Loadable(int capacity, int maxDistanceBetweenStation) {
        CAPACITY = capacity;
        MAXDISTANCE = maxDistanceBetweenStation;
        carsLoaded = new ArrayList<Car>();
    }

    public List<Car> getCarsLoaded() {
        return carsLoaded;
    }

    public int getAmount() {
        return carsLoaded.size();
    }

    public boolean containsCar(Car car) {
        return carsLoaded.contains(car);
    }

    public void addCar(Car car) {
        carsLoaded.add(car);
    }

    public void removeCar(Car car) {
        carsLoaded.remove(car);
    }

    public void removeCar() {
        carsLoaded.remove(carsLoaded.size()-1);
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public int getMaxDistance() {
        return MAXDISTANCE;
    }
}
