package Model;
public class TurboMode {
    
    private Boolean turboOn;
    private double turbo;

    public TurboMode(){
        turboOn = false;
        this.turbo = 1;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public double getTurbo() {
        return turbo;
    }

    public Boolean getTurboOn() {
        return turboOn;
    }

    public void setTurbo(double turbo) {
        this.turbo = turbo;
    }

    public void setTurboOff(){
	    turboOn = false;
    }

    public Boolean isTurboOn() {
        return turboOn;
    }

    
}
