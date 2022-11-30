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

    public double checkDistanceToCar(Car car) {
        return Math.sqrt(Math.pow(car.getPosX() - this.x, 2) + Math.pow(car.getPosY() - this.y, 2));
    }

    public void loadCar(Car car) {
        if (carsInShop.size() < capacity) {
            if (checkDistanceToCar(car) <= radius) {
                carsInShop.add(car);
            } else {
                throw new IllegalArgumentException("Car is too far away from the shop");
            }
        } else {
            throw new IllegalArgumentException("Shop is full");
        }
    }

    public void unloadCar(Car car) {
        carsInShop.remove(car);
    }
}
