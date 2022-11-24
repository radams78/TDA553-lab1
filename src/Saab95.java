package src;
import java.awt.*;

public class Saab95 extends CarWithTurbo{
    
    private static boolean turboOn = false;

    public Saab95(){
        super(2, 125, Color.red, "Saab95", turboOn);
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    

    public boolean isTurboOn() {
        return turboOn;
    }
}
