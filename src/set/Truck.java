package set;

import java.awt.*;

abstract class Truck extends Car {

    private double platformAngle;
    private double platformAngleMax;

    protected Truck(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed,
            double platformAngleMax) {
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.platformAngleMax = platformAngleMax;
        this.platformAngle = 0;

    }

    public double getPlatformAngle() {
        return platformAngle;
    }

    public void raisePlatform(double amount) {
        if (platformAngle <= platformAngleMax && getCurrentSpeed() == 0) {
            this.platformAngle = platformAngle + amount;
        } else {
            throw new IllegalArgumentException("Can not raise the platform any further");
        }
    }

    public void lowerPlatform(double amount) {
        if ((platformAngle - amount) >= 0 && getCurrentSpeed() == 0) {
            this.platformAngle = platformAngle - amount;
        } else {
            throw new IllegalArgumentException("Can not lower the platform any further");
        }
    }

    @Override
    public void gas(double amount) {
        if (getPlatformAngle() == 0) {
            super.gas(amount);
        } else {
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }
    }

    @Override
    public void brake(double amount) {
        if (getPlatformAngle() == 0) {
            super.brake(amount);
        } else {
            throw new IllegalArgumentException("Car platform must be at starting position.");
        }
    }
}
