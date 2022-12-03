package set;
import java.awt.*;

abstract class Truck extends Car{

    private double platformAngle;

    protected Truck(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed){
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.platformAngle = 0;
        
    }

    protected double getPlatformAngle(){
        return platformAngle;
    }

    @Override // OBS! Not done!
    public void gas(double amount){
        if (getPlatformAngle() == 0){
            gas(amount);
        }else{
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }
    }
}

