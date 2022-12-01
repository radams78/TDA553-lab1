
import java.awt.*;

public class Saab95 extends Car implements TurboType{

    private TurboMode turbo;
    
    public Saab95(){
        super(2, 125, 0, Color.red, "Saab95",0,0);
        turbo = new TurboMode();
    }

    @Override
    public void setTurboOn(){
	    turbo.setTurboOn();
    }

    @Override
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
