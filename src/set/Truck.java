// Module to hold the abstract class Truck
// - Note that this inherits from the superclass vehicles

// --- Packages --- //

package set;


// --- Imports --- //

import java.awt.*;

// ---- Class ---- //

public abstract class Truck extends Vehicles{


    // --- Constructor --- //

    public Truck(int nrDoors, Color color, int enginePower, String modelName){
        super(nrDoors, color, enginePower, modelName);
    }
    
}
