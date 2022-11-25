package src;

import java.awt.Color;

public class CarTransporter extends CarWithPlatform {

    private boolean platformIsUp;


    public CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean platformIsUp) {
        super(nrDoors, enginePower, color, modelName);
        this.platformIsUp = platformIsUp;
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

    @Override
    protected double speedFactor() {
        return 1;
    }

    public boolean isPlatformUp() {
        return platformIsUp;
    }
}
