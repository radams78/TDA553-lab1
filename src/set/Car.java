// This module contains the abstract class for cars
// - Note that it inherits from the abstract superclass Vehicles

// -- Packages -- //

package set;


// --- Imports --- //

import java.awt.*;


// ---- Class ---- //

public abstract class Car extends Vehicles{

    // --- Constructor --- //

    public Car(int nrDoors, Color color, int enginePower, String modelName) {
        super(nrDoors, color, enginePower, modelName);
    }

}