package src;

import java.awt.Color;

public abstract class Truck extends Car {

    public Truck(int nrDoors, double enginePower, Color color, String modelName, int positionX, int positionY) {
        super(nrDoors, enginePower, color, modelName, positionX, positionY);
    }

    @Override
    public void gas(double amount){
        if (amount<0 || amount>1){
            throw new IllegalArgumentException("amount outside of range [0,1]");
        } else if (canGas()) {
            super.gas(amount);
        }
    }

    protected boolean canGas() {
        return true;
    }
}
