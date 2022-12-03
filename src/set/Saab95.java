package set;

import java.awt.*;

public class Saab95 extends TurboCar{

    public Saab95() {
        super(2, 125, "Saab95", Color.red, 0, false);
        stopEngine();
    }

        protected double speedFactor() {
        double turbo = 1;
        if (getTurboOn() == true)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    double calculateSpeed(double amount) {
        return speedFactor() * amount;
    }
}