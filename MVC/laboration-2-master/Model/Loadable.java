package Model;

import java.util.*;

public class Loadable<T extends Car> {
    
    private final int CAPACITY;
    private final int MAXDISTANCE;
    private List<T> carsLoaded;

    public Loadable(int capacity, int maxDistanceBetweenStation) {
        CAPACITY = capacity;
        MAXDISTANCE = maxDistanceBetweenStation;
    }

    public List<T> getCarsLoaded() {
        return carsLoaded;
    }

    public int getAmount() {
        return carsLoaded.size();
    }

    public boolean containsCar(T car) {
        return carsLoaded.contains(car);
    }

    public void loadCar(T car) {
        carsLoaded.add(car);
    }

    public void unloadCar(Car car) {
        carsLoaded.remove(car);
    }

    public void unloadCar() {
        carsLoaded.remove(carsLoaded.size()-1);
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public int getMaxDistance() {
        return MAXDISTANCE;
    }
}
