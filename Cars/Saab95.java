import java.awt.*;

public class Saab95 extends MotorisedVehicle<TurboEngine, Body> {

    private boolean turboOn;
    
    public Saab95(){
        super(new Body("Saab95", Color.gray, 2), new TurboEngine(125.0));
    }
    
    public void setTurboOn(){
	    this.getEngine().turnOnTurbo();
    }

    public void setTurboOff(){
	    this.getEngine().turnOffTurbo();
    }

    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return (this.getEnginePower() * 0.01 * turbo);
    }
}
