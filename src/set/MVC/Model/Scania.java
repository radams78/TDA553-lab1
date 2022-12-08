// Module to hold the subclass Scania
// - Note that this class inherits from its superclass Truck

// --- Packages --- //

package set.MVC.Model;


import java.awt.*;

import set.MVC.Model.AngleRamp;


// ---- Class ---- //

 public class Scania extends Truck{

    private AngleRamp ramp;

    // --- Constructor --- //

    public Scania(int nrDoors, Color color, int enginePower, String modelName, int maxAngle){
        super(nrDoors, color, enginePower, modelName);
        this.ramp = new AngleRamp(maxAngle);
    }

    // ---- Methods ---- //

    

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

    public int getRampPosition() {
        return ramp.getAngle();
    }

    @Override
    public void gas(double amount) {
        if (ramp.getAngle() == 0) super.gas(amount);
    }
}