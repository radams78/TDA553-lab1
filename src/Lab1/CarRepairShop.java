package Lab1;

import java.util.Set;
import Lab1.vehicles.Car;

public class CarRepairShop {
    Set<Car> carsInShop;
    private double x;
    private double y;
    int capacity;

    public CarRepairShop(int x, int y, int capacity) {
        this.x = x;
        this.y = y;
        this.capacity = capacity;
    }

    public void loadCar(Car car) {
        carsInShop.add(car);
    }

    public void unloadCar(Car car) {
        carsInShop.remove(car);
    }
}
