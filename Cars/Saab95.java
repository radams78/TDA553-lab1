import java.awt.*;

public class Saab95 extends MotorisedVehicle {

    private boolean turboOn;
    
    public Saab95(){
        super("Saab95", Color.red, new Engine(125.0), 2);
	    this.turboOn = false;
        this.engine = new TurboEngine(125.0);
    }
    
    public void setTurboOn(){
	    this.engine.turnOnTurbo();
    }

    public void setTurboOff(){
	    this.engine.turnOffTurbo();
    }

    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return (this.getEnginePower() * 0.01 * turbo);
    }
}
