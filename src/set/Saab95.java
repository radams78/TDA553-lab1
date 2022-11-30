// Module to hold the subclass Saab95
// - Note that this subclass inherits from the superclass Car


// --- Packages --- //

package set;


// --- Imports --- //

import java.awt.*;
import set.Turbo;


// ---- Class ---- //

public class Saab95 extends Car {
    
    private Turbo turbo;
    
    // Constructor for the class saab95
    public Saab95(int nrDoors, Color color, int enginePower, String modelName){
        super(nrDoors, color, enginePower, modelName);   
        turbo = new Turbo();
    }

    // --- Methods --- //

    // Updates vehicle's speedfactor depending on if turbo is on or off
    @Override
    public double speedFactor(){
        double turboFactor = 1;
        if(turbo.getTurbo()) turboFactor = 1.3;
        return getEnginePower() * 0.01 * turboFactor;
    }
    

    // Methods to set turbo values
    public void setTurboOn(){
	    turbo.setTurboOn();
    }
    
    public void setTurboOff(){
	    turbo.setTurboOff();
    }
    
}
