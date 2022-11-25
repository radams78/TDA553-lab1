package src;

import java.awt.Color;

public abstract class CarWithPlatform extends Car {

    public CarWithPlatform(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    protected abstract void raisePlatform();

    protected abstract void lowerPlatform();

    protected Boolean isStationary() {
        return this.getCurrentSpeed() == 0;
    }

    protected abstract boolean canGas();

    @Override
    public void gas(double amount) {
        if(canGas()) {
            super.gas(amount);
        } else if (amount<0 || amount>1){
            throw new IllegalArgumentException("amount outside of range [0,1]");
        }
    }
}
