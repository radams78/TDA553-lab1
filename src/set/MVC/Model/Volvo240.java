// Module to hold the subclass Volvo24
// - Note that this subclass inherits from the superclass Car

// --- Packages --- //

package set.MVC.Model;


// --- Imports --- //

import java.awt.*;
import java.nio.channels.Pipe;

import set.MVC.Model.Trim;


// ---- Class ---- //

 public class Volvo240 extends Car {
    
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

}
