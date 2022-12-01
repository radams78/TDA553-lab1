package Lab1;

import java.util.Set;
import Lab1.vehicles.ICanLoad;
import Lab1.vehicles.ILoadable;

public class CarRepairShop implements ICanLoad {
    private Set<ILoadable> loadedObjects;
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

    private double distanceToObject(ILoadable loadable) {
        return Math.sqrt(Math.pow(loadable.getPosX() - this.x, 2) + Math.pow(loadable.getPosY() - this.y, 2));
    }

    public void load(ILoadable loadable) {
        loadable.load(this);
    }

    // TODO We might want to move this to the loadable object
    public void loadCar(ILoadable loadable) {
        if (loadedObjects.size() < capacity) {
            if (distanceToObject(loadable) <= radius) {
                if (!loadedObjects.add(loadable)) {
                    throw new IllegalArgumentException("Car already in shop");
                } else {
                    load(loadable);
                }
            } else {
                throw new IllegalArgumentException("Car is too far away from the shop");
            }
        } else {
            throw new IllegalArgumentException("Shop is full");
        }
    }

    public void unload(ILoadable loadable) {
        loadedObjects.remove(loadable);
    }

    public double getPosX() {
        return x;
    }

    public double getPosY() {
        return y;
    }
}
