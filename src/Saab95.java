package src;
import java.awt.*;

public class Saab95 extends Car{
    
    private static boolean turboOn = false;
    private Turbo turbo;

    public Saab95(int positionX, int positionY){
        super(2, 125, Color.red, "Saab95", positionX, positionY);
        this.turbo = new Turbo(turboOn);
    }

    @Override
    public double speedFactor(){
        return turbo.speedFactor(this.getEnginePower());
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

    public boolean canGas(){
        return true;
    }
}
