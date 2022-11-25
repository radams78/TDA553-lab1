package src;

import java.awt.Color;

public class CarWithTrim extends Car {
    protected double trimFactor;

    public CarWithTrim(int nrDoors, double enginePower, Color color, String modelName, double trimFactor) {
        super(nrDoors, enginePower, color, modelName);
        this.trimFactor = trimFactor;
    }

    @Override
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }   
}