import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;

    
    public Volvo240 (){
        super()
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }
    
    
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }


}

https://prod.liveshare.vsengsaas.visualstudio.com/join?5DC6DD470EFBFCB72AE0DEB741C7DFBB6683
