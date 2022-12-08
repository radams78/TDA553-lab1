// Module to hold the class AngleRamp
// - Note that objects of this class often are delegated as attributes

// --- Packages --- //

package set.MVC.Model;

// --- Imports --- //


// --- Class --- //

 public class AngleRamp {
    private int rampAngle;
    private static final int angleSpeed = 15;
    private int maxAngle;
    
    // --- Constructor --- //

    public AngleRamp(int maxAngle){
        rampAngle = 0;
        this.maxAngle = maxAngle;
    }


    // ----- Methods ----- //

    // Method to set the angle of the ramp
    public int getAngle(){
        return rampAngle;
    }

    // Method to raise the ramp's angle based on angleSpeed 
    public void raiseRamp(){
        rampAngle +=  angleSpeed;
        if (rampAngle > maxAngle){
            rampAngle = maxAngle;
        }
    }

    // Method to lower the ramp's angle based on angleSpeed
    public void lowerRamp(){
        rampAngle -= angleSpeed;
        if (rampAngle < 0){
            rampAngle = 0;
        }
    }
}
