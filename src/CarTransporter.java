package src;

import java.awt.Color;

public class CarTransporter extends Car {

    private boolean platformIsUp;
    private CarWithPlatform platform;

    public CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean platformIsUp) {
        super(nrDoors, enginePower, color, modelName);
        this.platformIsUp = platformIsUp;
    }

    protected double speedFactor() {
        return platform.speedFactor();
    }

    @Override
    protected void raisePlatform() {
        if (isStationary()) {
        platformIsUp = true;
        }
    }

    @Override
    protected void lowerPlatform() {
        if (isStationary()) {
        platformIsUp = false;
        }
    }

    public boolean canGas() {
        return platformIsUp;
    }

    

    public boolean isPlatformUp() {
        return platformIsUp;
    }
}
