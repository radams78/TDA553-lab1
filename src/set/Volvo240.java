package set;

import java.awt.*;

public class Volvo240 extends Cars{

    public final static double trimFactor = 1.25;
    
    public Volvo240(){
        super(4, 100, "Volvo240", Color.black, 0);
        stopEngine();
    }
    
    private double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
        if (Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()) < getEnginePower()) {
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
        }else{
            throw new IllegalArgumentException("Can not increase the speed any further due to enginepower");
        }

	    
    }

    public void decrementSpeed(double amount){

        if (Math.max(getCurrentSpeed() - speedFactor() * amount,0) > 0) {
            setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
        }else{
                throw new IllegalArgumentException("Can not decrease the speed any less than 0");
            }

    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount > 0 && amount < 1){
            incrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("The gas method only accepts values in the interval [0, 1]");
        }
    } 
    

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount > 0 && amount < 1){
            decrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("The brake method only accepts values in the interval [0, 1]");
        }
    }
}
