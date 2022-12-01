package Lab1.truckextensions;

import java.util.Set;

import Lab1.vehicles.ICanLoad;
import Lab1.vehicles.ILoadable;

public class Transportbed implements Trailer, ICanLoad {
    private Set<ILoadable> loadedObjects;
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

    public void load(ILoadable loadable) {
        if (loadedObjects.size() < this.capacity) {
            loadedObjects.add(loadable);
        } else {
            throw new IllegalStateException("Car transporter is full");
        }
    }

    public void unload(ILoadable loadable) {
        if (loadedObjects.contains(loadable)) {
            loadedObjects.remove(loadable);
        } else {
            throw new IllegalStateException("Car is not loaded");
        }
    }

    public void unloadAllObjects() {
        loadedObjects.clear();
    }

    public Set<ILoadable> getLoad() {
        return loadedObjects;
    }

    public double getPosX() {
        // TODO
        return 0;
    }

    public double getPosY() {
        // TODO
        return 0;
    }
}
