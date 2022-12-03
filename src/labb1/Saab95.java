package labb1;

import java.awt.*;

//CLass for saab95
public class Saab95 extends Car {

    // Turbo specific to the saab 95
    public boolean turboOn;

    public Saab95(Color color, double x, double y, double dirX, double dirY) {
        super(2, color, 125, "Saab95", x, y, dirX, dirY);
        turboOn = false;
    }// Constructor

    public void setTurboOn() {
        turboOn = true;
    }// set TurboOn()

    public void setTurboOff() {
        turboOn = false;
    }// setTurboOff()

    @Override
    public double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }// speedFactor()

}// Class
