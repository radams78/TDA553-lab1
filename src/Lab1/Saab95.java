package Lab1;

import java.awt.*;

public class Saab95 extends Car {
    private boolean turboOn;

    public Saab95(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName,
            boolean turboOn) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.turboOn = turboOn;
        stopEngine();
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
