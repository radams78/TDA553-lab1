package set;
// Module to hold the subclass Volvo24
// - Note that this subclass inherits from the superclass Car

// --- Imports --- //

import java.awt.*;
import java.nio.channels.Pipe;
import set.Trim;

// ---- Class ---- //

public class Volvo240 extends Car{
    
    
    private Trim trimCar;
    // Constructor for the class volvo240
    public Volvo240(int nrDoors, Color color, int enginePower, String modelName) {
        super(nrDoors, color, enginePower, modelName);
        trimCar = new Trim(1.25);
    }


    // --- Methods --- //
    
    // updates vehicles speedfactor depending on trimfactor
    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimCar.getTrimFactor();
    }
    
    
    // Increments the speed of the vehicle depending on the speedfactor
    
    
}
