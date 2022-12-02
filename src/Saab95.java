import java.awt.*;

public class Saab95 extends Car{
    private boolean turboOn;

    public Saab95(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        turboOn = false;
    }

    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
<<<<<<< HEAD:src/Saab95.java

=======
>>>>>>> Develop:src/vehicle/Saab95.java
    
    public boolean getTurboOn(){
        return turboOn;
    }

}
