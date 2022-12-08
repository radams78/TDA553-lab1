// Module to hold the class LiftRamp
// - Note that objects of this class often are delegated as attributes

// --- Packages --- //

package set.MVC.Model;


// ---- Class ---- //

 public class LiftRamp {
 
    private boolean rampPositionDown;

    // --- Constructor --- //

    public LiftRamp(){
        rampPositionDown = false;
    }

    // ----- Methods ----- //

    // Method to get the position of the ramp
    public boolean getRampPositionDown(){
        return rampPositionDown;
    }

    // Method to raise the position of the ramp
    public void raiseRamp(){
        rampPositionDown = false;
    }

    // Method to lower the position of the ramp
    public void lowerRamp(){
        rampPositionDown = true;
    }

    
}
