package set;
// Module to hold the subclass Saab95
// - Note that this subclass inherits from the superclass Car

// --- Imports --- //

import java.awt.*;


// ---- Class ---- //

public class Saab95 extends Car {
    
    private boolean turboOn;
    
    // Constructor for the class saab95
    public Saab95(int nrDoors, Color color, int enginePower, String modelName){
        super(nrDoors, color, enginePower, modelName);   
        turboOn = false;
    }

    // --- Methods --- //

    // Updates vehicle's speedfactor depending on if turbo is on or off
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
    

    // Methods to set turbo values
    public void setTurboOn(){
	    turboOn = true;
    }
    
    public void setTurboOff(){
	    turboOn = false;
    }
    
}
