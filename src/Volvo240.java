package src;
import java.awt.*;

public class Volvo240 extends Car {

    public final static double trimFactor = 1.25;
    
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
