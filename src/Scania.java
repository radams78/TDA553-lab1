package src;
import java.awt.*;

public class Scania extends Car {
    private double platformAngle;

    public Scania() {
        super(2, 100, Color.yellow, "Scania dump truck");
        this.platformAngle = 0;
    }

    protected double speedFactor() {
        return 1;
    }

    public void raisePlatform() {
        if (platformAngle < 70 && isStationary()) {
        this.platformAngle += 1;
        }
    }

    @Override
    public void lowerPlatform() {
        if (platformAngle > 0 && isStationary()){
        this.platformAngle -= 1;
        }
    }

    public boolean canGas() {
        return platformAngle == 0;
    }

    public double getPlatformAngle() {
        return platformAngle;
    }


}
