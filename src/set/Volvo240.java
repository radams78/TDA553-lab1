// Module to hold the subclass Volvo24
// - Note that this subclass inherits from the superclass Car

// --- Packages --- //

package set;


// --- Imports --- //

import java.awt.*;
import java.nio.channels.Pipe;


// ---- Class ---- //

public class Volvo240 extends Car{
    
    public final static double trimFactor = 1.25;
    
    
    // --- Constructor --- //

    public Volvo240(int nrDoors, Color color, int enginePower, String modelName) {
        super(nrDoors, color, enginePower, modelName);
    }


    // --- Methods --- //
    
    // Updates vehicles speedfactor depending on trimfactor
    @Override
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
 
}
