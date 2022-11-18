package set;
// Module to hold the subclass Volvo24
// - Note that this subclass inherits from the superclass Car

// --- Imports --- //

import java.awt.*;
import java.nio.channels.Pipe;


// ---- Class ---- //

public class Volvo240 extends Car{
    
    public final static double trimFactor = 1.25;
    
    // Constructor for the class volvo240
    public Volvo240(int nrDoors, Color color, int enginePower, String modelName) {
        super(nrDoors, color, enginePower, modelName);
    }


    // --- Methods --- //
    
    // updates vehicles speedfactor depending on trimfactor
    @Override
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
        
    }
    
    // Increments the speed of the vehicle depending on the speedfactor
    
    
}
