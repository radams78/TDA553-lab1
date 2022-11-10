import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;
    
    public Saab95(){
        super("Saab95", Color.red, 125, 2);
	    this.turboOn = false;
    }
    

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return (this.getEnginePower() * 0.01 * turbo);
    }

    public void incrementSpeed(double amount){
        this.setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    public void decrementSpeed(double amount){
        this.setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
