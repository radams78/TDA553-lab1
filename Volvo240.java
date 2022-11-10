import java.awt.*;
import java.util.ArrayList;


public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    
    
    public Volvo240(){

        super(4, 100, 0, Color.black, "Volvo240", 0, 0, "right");
        
    }
    
    @Override
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    @Override
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    @Override
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    @Override
    public void brake(double amount){
        decrementSpeed(amount);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

}

