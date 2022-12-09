package src.carModel;

public class Turbo{

    protected boolean turboOn;

    public Turbo(boolean turboOn){
        this.turboOn = turboOn;
    }

    public double speedFactor(double enginePower){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
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
