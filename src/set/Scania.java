// Module to hold the subclass Scania
// - Note that this class inherits from its superclass Truck

// --- Packages --- //

package set;


// --- Imports --- //

import set.AngleRamp;
import java.awt.*;


// ---- Class ---- //

public class Scania extends Truck{

    private AngleRamp ramp;

    // --- Constructor --- //

    public Scania(int nrDoors, Color color, int enginePower, String modelName){
        super(nrDoors, color, enginePower, modelName);
        this.ramp = new AngleRamp();
    }

    // ---- Methods ---- //

    @Override
    protected double speedFactor() {
        return getEnginePower() * 0.01;
    }        

    // Method to raise Scania object's ramp
    // - Note that this is only allowed while current speed is 0
    public void raiseRamp(){
        if (this.getCurrentSpeed() == 0){
            ramp.raiseRamp();
        }
    }

    // Method to lower Scania object's ramp
    // - Note that this is only allowed while current speed is 0
    public void lowerRamp(){
        if (this.getCurrentSpeed() == 0){
            ramp.lowerRamp();
        }
    }

    @Override
    public void gas(double amount) {
        if (ramp.getAngle() == 0) super.gas(amount);
        
    }
}