package set;

import java.awt.*;

public class Scania extends Truck{
    
private double speedFactor = 1.25; 
private double platformAngle;



    public Scania(){
        super(2, 100, "Scania", Color.black, 0);
        this.platformAngle = 0;
        stopEngine();

    }

    public double getPlatformAngle() {
        return platformAngle;
    }

    public void raisePlatform(double amount){
        if (platformAngle <= 70 && getCurrentSpeed() == 0){
            this.platformAngle = platformAngle + amount;
        }else{
            throw new IllegalArgumentException("Can not raise the platform any further");
        }
    }


    public void lowerPlatform(double amount){
        if ((platformAngle - amount) >= 0 && getCurrentSpeed() == 0){
            this.platformAngle = platformAngle - amount;
        }else{
            throw new IllegalArgumentException("Can not lower the platform any further");
        }
    }

    double calculateSpeedIncrease(double amount){
        return getCurrentSpeed() + speedFactor * amount;
    }

    double calculateSpeedDecrease(double amount){
        return getCurrentSpeed() - speedFactor * amount;
    }
    
}
