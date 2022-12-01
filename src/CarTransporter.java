package src;

import java.awt.Color;

public class CarTransporter extends Truck {
    private DiscretePlatform platform;

    public CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean platformIsUp) {
        super(nrDoors, enginePower, color, modelName);
        this.platform = new DiscretePlatform();
    }

    protected double speedFactor() {
        return 1;
    }

    public void raisePlatform(){
        platform.raisePlatform(getCurrentSpeed());
    }

    public void lowerPlatform(){
        platform.lowerPlatform(getCurrentSpeed());
    }

    public boolean canGas(){
        return platform.canGas();
    }

    public boolean isPlatformUp() {
        return platform.isPlatformUp();
    }
}
