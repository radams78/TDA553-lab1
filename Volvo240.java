import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    
    public Volvo240(){

        super(4, 100, 0, Color.black, "Volvo240", 0, 0);
        
    }
    
    @Override
    public double speedFactor(){
        return this.getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void incrementSpeed(double amount){

	    this.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,this.getEnginePower()));
    }

    @Override
    public void decrementSpeed(double amount){
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));;
    }
}

