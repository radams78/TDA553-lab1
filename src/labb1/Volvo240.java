package labb1;

import java.awt.*;

//Class for volvos
public class Volvo240 extends Car {

    public final static double trimFactor = 1.25; // The amount of trim made to the car

    public Volvo240(Color color, double x, double y, double dirX, double dirY) {
        super(4, color, 100, "Volvo240", x, y, dirX, dirY);
    }// Constructor

    @Override
    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }
}// Class
