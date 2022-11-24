// Module to hold the class AngleRamp
// - Note that objects of this class often are delegated as attributes

// --- Packages --- //

package set;


// --- Class --- //

public class AngleRamp {
    private int rampAngle;
    private static final int angleSpeed = 15;
    
    // --- Constructor --- //

    public AngleRamp(){
        rampAngle = 0;
    }


    // ----- Methods ----- //

    // Method to set the angle of the ramp
    public int getAngle(){
        return rampAngle;
    }

    // Method to raise the ramp's angle based on angleSpeed 
    public void raiseRamp(){
        rampAngle +=  angleSpeed;
        if (rampAngle > 70){
            rampAngle = 70;
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
