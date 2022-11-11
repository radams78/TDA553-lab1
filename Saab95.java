import java.awt.*;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Saab95 extends Car{
    private Boolean turboOn;

    public Saab95(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        turboOn = false;
        stopEngine();
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
        double currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        setCurrentSpeed(currentSpeed);
    }

    public void decrementSpeed(double amount){
        double currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        setCurrentSpeed(currentSpeed);
    }
    
}
