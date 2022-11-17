import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    
    public Volvo240(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        stopEngine();
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        setCurrentSpeed(currentSpeed);
    }

    public void decrementSpeed(double amount){
        double currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(currentSpeed);
    }

}
