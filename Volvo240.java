import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    
    public Volvo240(){
        super(4, Color.black, 100, "Volvo240", "Car", 0, 0, 0);
        stopVehicle();
    }
    
    public static double getTrimfactor() {
        return trimFactor;
    }

    public double speedFactor(){
        return getEnginePower() * 0.01 * getTrimfactor();
    }

    public void incrementSpeed(double amount){
	    setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }


    
}
