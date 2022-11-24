package Lab1;

import java.awt.*;

public class Scania extends Car {
    private double platformAngle = 0d;
    private double maxAngle = 70d;
    private double lowestAngle = 0d;

    public Scania(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName,
            double platformAngle) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.platformAngle = platformAngle;
        stopEngine();

    }

    public double getPlatformAngle() {
        return platformAngle;
    }

    public void setPlatformAngle(double currentAngle) {
        if (getCurrentSpeed() == 0) {
            if (currentAngle > maxAngle) {
                this.platformAngle = maxAngle;

            } else if (currentAngle < lowestAngle) {
                this.platformAngle = lowestAngle;

            } else {
                this.platformAngle = currentAngle;
            }
        } else {
            throw new IllegalArgumentException("Cant set platform at that angle if car is moving");
        }

    }

    public void raisePlatform(double amount) {
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
