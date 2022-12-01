
import java.awt.*;

public class Saab95 extends Car{

    private boolean turboOn;
    
    public Saab95(){
        super(2, 125, 0, Color.red, "Saab95",0,0);
        turboOn = false;
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
        return this.getEnginePower() * 0.01 * turbo;
    }

    @Override
    public void incrementSpeed(double amount){
        this.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, this.getEnginePower()));
    }

    @Override
    public void decrementSpeed(double amount){
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));;
    }


    public boolean isTurboOn() {
        return turboOn;
    }

}
