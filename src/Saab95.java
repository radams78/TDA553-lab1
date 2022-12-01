package src;
import java.awt.*;

public class Saab95 extends Vehicle{

    public boolean turboOn;
    
    public Saab95() {
        super(2, 125, Color.red, "Saab95", 0, 0, true);
    }


    public void setTurboOn(){       // SAAB-sub-class
	    turboOn = true;
    }

    public void setTurboOff(){      // SAAB- sub
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    @Override
    public void incrementSpeed(double amount) {
        if(getCurrentSpeed() < getEnginePower()) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
            }
        else { 
            setCurrentSpeed(getEnginePower());
        }
    }

    @Override
    public void decrementSpeed(double amount) {
        if(getCurrentSpeed() >= 0){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }
        else{
            setCurrentSpeed(0);
        }
    }


}
