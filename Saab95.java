import java.awt.*;

public class Saab95 extends Car{

    public boolean turboOn;
    
    public Saab95() {
        super(2, 125, 0, Color.red, "Saab95", 0, 0);
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
    
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
    
    public void turnLeft() {

    }
    
    public void turnRight() {

    }
}
