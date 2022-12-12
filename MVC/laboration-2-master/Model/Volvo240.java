package Model;
import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    
    public Volvo240(){
        super(4, 250, Color.black, "Volvo240", "pics/Volvo240.jpg");
    }
    
    @Override
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount){
        double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
	    if (newSpeed > getCurrentSpeed()) {setCurrentSpeed(newSpeed);}
    }

    @Override
    public void decrementSpeed(double amount){
        double newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
        if (newSpeed < getCurrentSpeed()) {setCurrentSpeed(newSpeed);}
    }

}