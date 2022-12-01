
import java.awt.*;

public class Saab95 extends Car{

    private TurboMode turbo;
    
    public Saab95(){
        super(2, 125, 0, Color.red, "Saab95",0,0);
        turbo = new TurboMode();
    }


    public void setTurboOn(){
	    turbo.setTurboOn();
    }

    public void setTurboOff(){
        turbo.setTurboOff();
    }
    
    @Override
    public double speedFactor(){
    
        if(turbo.isTurboOn()){ turbo.setTurbo(1.3);
        }
        return this.getEnginePower() * 0.01 * turbo.getTurbo();
    }
    
}
