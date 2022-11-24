package set;

import java.awt.*;

public class Scania extends Cars{
    
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

    public void incrementSpeed(double amount){
        
        if ((getCurrentSpeed() + speedFactor * amount) <= getEnginePower() && amount >= 0 && platformAngle == 0) {
            setCurrentSpeed((getCurrentSpeed() + speedFactor * amount));
        }else{
            throw new IllegalArgumentException("Can not increase the speed any further due to enginepower or the platform is not lowered to it's starting point.");
        }
    }


    public void decrementSpeed(double amount){
        if ((getCurrentSpeed() + speedFactor * amount) >= 0 && amount >= 0 && platformAngle == 0) {
        setCurrentSpeed(getCurrentSpeed() - speedFactor * amount);
        }else{
            throw new IllegalArgumentException("Can not decrease the speed any less than 0 or the platform is not at 0 degrees");
        }
    }


    public void gas(double amount){
        if (amount >= 0 && amount <= 1){
            incrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("The gas method only accepts values in the interval [0, 1]");
        }
    } 
    

    public void brake(double amount){
        if (amount >= 0 && amount <= 1){
            decrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("The brake method only accepts values in the interval [0, 1]");
        }
    }

}
