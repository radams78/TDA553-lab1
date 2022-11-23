package Lab1;

import java.awt.*;

public class Scania extends Car {
    private double platformAngle = 0d;
    public double maxAngle = 70d;
    public double lowestAngle = 0d;

    public Scania(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName,
            double platformAngle) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.platformAngle = platformAngle;
        stopEngine();

    }

    public double getPlatformAngle() {
        return platformAngle;
    }

    public void setPlatformAngle(double currentAngle){
        if(currentAngle > maxAngle){
            this.platformAngle = maxAngle;

        } else if(currentAngle < lowestAngle){
            this.platformAngle = lowestAngle;

        } else{
            this.platformAngle = currentAngle;
    }
}


    public void raisePlatform(double amount){
        setPlatformAngle(getPlatformAngle() + amount);
    }

    public void lowerPlatform(double amount) {
        setPlatformAngle(getPlatformAngle() - amount);
        
    }

    @Override
    public double speedFactor() {
        if (platformAngle < 0) {
            return 0;
        } else {
            return getEnginePower() * 0.01;
        }

    }
}
