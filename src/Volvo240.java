package src;
import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
   /*public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name */
    
    public Volvo240(){
        super(4, 100, 0 ,Color.black, "Volvo240", 0, 0, direction.NORTH);
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }
}
