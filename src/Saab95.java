package src;
import java.awt.*;

public class Saab95 extends Car{
    
    private static boolean turboOn = false;
    private CarWithTurbo turbo;

    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        this.turbo = new CarWithTurbo(turboOn);
    }

    public double speedFactor(){
        return turbo.speedFactor(enginePower);
    }

    public void setTurboOn(){
	    turbo.setTurboOn();
    }

    public void setTurboOff(){
	    turbo.setTurboOff();
    }
    
    public boolean isTurboOn() {
        return turbo.isTurboOn();
    }
}
