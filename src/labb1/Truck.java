package labb1;

import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle {


    public Truck(Color color, int enginePower, String modelName, double x, double y, double dirX, double dirY,
             int maxLoad) {
        super(2, color, enginePower, modelName, x, y, dirX, dirY);
    }

 

    @Override
    // Overrides the evehicle gas method to do a check for if the platform is
    // extended
    public void gas(double amount) {
        if (this.getTrailer().getPlatformExtended()) {
            throw new IllegalArgumentException("Can not move while platform is extended");
        } else {
            super.gas(amount);
        }

    }// gas()

    public void extendPlatform() {
        if (this.getCurrentSpeedX() > 0 && this.getCurrentSpeedY() > 0) {
            throw new IllegalArgumentException("Cant open platform while driving");
        } else {
            this.getTrailer().extendPlatform();
        }

    }

    public abstract Trailer getTrailer();

    public void retractPlatform() {
        this.getTrailer().retractPlatform();
    }

    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
