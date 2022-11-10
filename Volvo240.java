// Module to hold the subclass Volvo24
// - Note that this subclass inherits from the superclass Car

// --- Imports --- //

import java.awt.*;


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
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
        
    }
    
    // Increments the speed of the vehicle depending on the speedfactor
    @Override
    public void incrementSpeed(double amount){
        double currentSpeed = getCurrentSpeed();
        double enginePower = getEnginePower();
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        
    }

    // Decrements the speed of the vehicle depending on the speedfactor
    @Override
    public void decrementSpeed(double amount){
        double currentSpeed = getCurrentSpeed();
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }
    
}
