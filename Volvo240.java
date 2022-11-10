import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;
    
    public Volvo240(){
        super("Volvo240", Color.black, 100, 4);
    }

    public void startEngine(){
	    this.setCurrentSpeed(0.1);
    }

    public void stopEngine(){
	    this.setCurrentSpeed(0);
    }
    
    @Override
    public double speedFactor(){
        return this.getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    this.setCurrentSpeed((Math.min(getCurrentSpeed() + speedFactor() * amount, this.getEnginePower())));
    }
    
    public void decrementSpeed(double amount){
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
