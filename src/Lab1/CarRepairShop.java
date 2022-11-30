package Lab1;

import java.util.Set;
import Lab1.vehicles.Car;

public class CarRepairShop {
    Set<Car> carsInShop;
    private double x;
    private double y;
    private double radius;
    private int capacity;

    public CarRepairShop(double x, double y, double radius, int capacity) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.capacity = capacity;
    }

    public void loadCar(Car car) {
        carsInShop.add(car);
    }

    public void unloadCar(Car car) {
        carsInShop.remove(car);
    }
}
