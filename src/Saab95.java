package src;
import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;
    
    public Saab95(){
        super(2, 125, 0 ,Color.red, "Saab95", 0, 0, direction.NORTH);
        turboOn = false;
        setTurboOn();
        speedFactor();
        setTurboOff();
    }


    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }
}
