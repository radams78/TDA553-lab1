package src;
import java.awt.*;

public class Saab95 extends Vehicle{

    public boolean turboOn;
    
    public Saab95(double xCoordinate, double yCoordinate) {
        super(2, 125, Color.red, "Saab95", xCoordinate, yCoordinate, true);
    }


    public void setTurboOn(){       // SAAB-sub-class
	    turboOn = true;
    }

    public void setTurboOff(){      // SAAB- sub
	    turboOn = false;
    }
    
    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }


}
