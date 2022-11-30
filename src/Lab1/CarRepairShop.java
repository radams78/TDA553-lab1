package Lab1;

import java.util.Set;
import Lab1.vehicles.Car;

public class CarRepairShop implements Location {
    private Set<Car> carsInShop;
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

    private double distanceToCar(Car car) {
        return Math.sqrt(Math.pow(car.getPosX() - this.x, 2) + Math.pow(car.getPosY() - this.y, 2));
    }

    public void moveCarHere(Car car) {
        car.moveToLocation(this);
    }

    public void loadCar(Car car) {
        if (carsInShop.size() < capacity) {
            if (distanceToCar(car) <= radius) {
                if (!carsInShop.add(car)) {
                    throw new IllegalArgumentException("Car already in shop");
                } else {
                    moveCarHere(car);
                }
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

    public double getPosX() {
        return x;
    }

    public double getPosY() {
        return y;
    }
}
