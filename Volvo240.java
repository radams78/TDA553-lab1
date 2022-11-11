import java.awt.*;

public class Volvo240 extends Car {

    public final static double trimFactor = 1.25;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
   // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    
    public Volvo240(int nrDoors, double enginePower, Color color, String modelName, double x, double y){
        super(nrDoors, enginePower, color, modelName, x, y);
        stopEngine();
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount){
	    double speed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        setCurrentSpeed(speed);
    }

    public void decrementSpeed(double amount){
        double speed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(speed);
    }
}
