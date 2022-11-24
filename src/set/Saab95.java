// Module to hold the subclass Saab95
// - Note that this subclass inherits from the superclass Car

// --- Packages --- //

package set;


// --- Imports --- //

import java.awt.*;


// ---- Class ---- //

public class Saab95 extends Car {
    
    boolean turboOn;
    
    // --- Constructor --- //

    public Saab95(int nrDoors, Color color, int enginePower, String modelName){
        super(nrDoors, color, enginePower, modelName);   
        turboOn = false;
    }


    // --- Methods --- //

    // Updates vehicle's speedfactor depending on if turbo is on or off
    @Override
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    // Method to set turbo to true
    protected void setTurboOn(){
	    turboOn = true;
    }
    
    // Method to set turbo to false
    protected void setTurboOff(){
	    turboOn = false;
    }
    
}
