package Model;
import java.awt.*;

public abstract class Truck extends Vehicle {
    public Truck(int nrDoors, double enginePower, Color color, String modelName, String pictureFile){
        super(nrDoors, enginePower, color, modelName, pictureFile);
    }

    public void incrementSpeed(double amount){
        double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
	    if (newSpeed > getCurrentSpeed()) {setCurrentSpeed(newSpeed);}
    }

    public void decrementSpeed(double amount){
        double newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
        if (newSpeed < getCurrentSpeed()) {setCurrentSpeed(newSpeed);}
    }

    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
