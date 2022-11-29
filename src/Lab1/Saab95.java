package Lab1;

import java.awt.*;

import Lab1.interfaces.ITurboable;

public class Saab95 extends Car implements ITurboable {
    private Boolean turboOn;

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

    public Boolean getTurboOn() {
        return turboOn;
    }

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }
}
