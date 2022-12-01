package src;

import java.awt.Color;

public abstract class CarWithPlatform{

    public CarWithPlatform(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    protected abstract void raisePlatform();

    protected abstract void lowerPlatform();

    protected Boolean isStationary() {
        return this.getCurrentSpeed() == 0;
    }

    protected abstract boolean canGas();

    

    protected double speedFactor() {
        return 1;
    }
}
