public class TipPlatform extends MotorisedVehicle {

    // ------------------------------------- Variables
    // ----------------------------------------//
    private int platformAngle = 0;
    private double currentspeed = 0; // TODO maybe get rid of this

    private final int MAXPLATFORMANGLE = 70;

    // ------------------------------------- Constructor
    // ----------------------------------------//

    public TipPlatform() {
        super.
    }

    // ------------------------------------- Getters
    // ----------------------------------------//

    public int getPlatformAngle() {
        return this.platformAngle;
    }

    public double getCurrentSpeed() {

    }

    // ------------------------------------- Misc platformAngle
    // ----------------------------------------//

    @Override
    public void lowerPlatform(int degrees) {
        if (degrees < 0) { // Only want positive integers, otherwise it will be -(-degrees) = + so it
                           // increases instead of decreasing!
            System.out.println("Error! Can only input a positive integer");
        } else if (this.getPlatformAngle() - degrees >= 0) { // Checking if we can lower n without ending up below 0
            this.platformAngle -= degrees; // If it is possible to lower n, do it!
        } else { // Otherwise, throw error message
            System.out.println("You can not lower that much! You can not lower more than" + this.getPlatformAngle());
        }
    }

    public void raisePlatform(int n) {
        if (this.getCurrentSpeed() > 0) { // The platform must not be raised if the truck is in motion TODO need to
                                          // overlook how we implement this
            System.out.println("Error! Stop the veichle before moving the platform!");
        } else if (n < 0) {
            System.out.println("Error! Can only input a positive integer");
        } else if (this.getPlatformAngle() + n >= 0) { // Check if we can raise n without ending up above 70
            this.platformAngle += n; // If it can raise n, do it!
        } else { // Otherwise, throw error message
            System.out.println(
                    "You cannot raise the platform more than " + (MAXPLATFORMANGLE - this.getPlatformAngle()) + "°");
        }
    }

}
