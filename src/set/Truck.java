package set;
import java.awt.*;

abstract class Truck extends Car{

    private double platformAngle;

    protected Truck(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed){
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.platformAngle = 0;
        
    }

    private double getPlatformAngle(){
        return platformAngle;
    }
}

