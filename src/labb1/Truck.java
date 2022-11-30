package labb1;

import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle {
    private Trailer trailer;
    private Dumper dumper;
    private Flatbed flatbed;

    public Truck(Color color, int enginePower, String modelName, double x, double y, double dirX, double dirY,
            Dumper trailer, int maxLoad, int minExtensionAngle, int maxExtensionAngle) {
        super(2, color, enginePower, modelName, x, y, dirX, dirY);

        this.trailer = trailer;
    }

    public Truck(Color color, int enginePower, String modelName, double x, double y, double dirX, double dirY,
            Flatbed trailer, int maxLoad, int MAX_NUMBER_OF_CARS) {
        super(2, color, enginePower, modelName, x, y, dirX, dirY);

        this.trailer = trailer;
    }

    @Override
    // Overrides the evehicle gas method to do a check for if the platform is
    // extended
    public void gas(double amount) {
        if (trailer.getPlatformExtended()) {
            throw new IllegalArgumentException("Can not move while platform is extended");
        } else {
            super.gas(amount);
        }

    }// gas()

    public void extendPlatform() {
        if (this.getCurrentSpeedX() > 0 && this.getCurrentSpeedY() > 0) {
            throw new IllegalArgumentException("Cant open platform while driving");
        } else {
            trailer.extendPlatform();
        }

    }

    public void retractPlatform() {
        trailer.retractPlatform();
    }

    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
