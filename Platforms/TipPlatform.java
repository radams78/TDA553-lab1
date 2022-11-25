public class TipPlatform {

    // ------------------------------------- Variables
    // ----------------------------------------//
    private int platformAngle = 0;

    private final int MAXPLATFORMANGLE = 70;
    private final int MINPLATFORMANGLE = 0;

    // ------------------------------------- Constructor
    // ----------------------------------------//

    public TipPlatform() {
        
    }

    // ------------------------------------- Getters
    // ----------------------------------------//

    public int getPlatformAngle() {
        return this.platformAngle;
    }


    // ------------------------------------- Misc platformAngle
    // ----------------------------------------//

    
    public void lowerPlatform(int degrees) {
        if (degrees < 0) {                              // Only want positive integers, otherwise it will be -(-degrees) = + so it
                                                        // increases instead of decreasing!
            throw new ArithmeticException("Error! Can only input a positive integer");
            
        } else if (this.getPlatformAngle() - degrees >= MINPLATFORMANGLE) { // Checking if we can lower n without ending up below 0
            this.platformAngle -= degrees;                                  // If it is possible to lower n, do it!
        } else {                                                            // Otherwise, throw error message
            throw new ArithmeticException("You can not lower that much! You can not lower more than" /*+ this.getPlatformAngle()*/);
        }
    }

    public void raisePlatform(int degrees) {
         if (degrees < 0) {
            System.out.println("Error! Can only input a positive integer");
        } else if (this.getPlatformAngle() + degrees <= MAXPLATFORMANGLE) { // Check if we can raise n without ending up above 70
            this.platformAngle += degrees;                                  // If it can raise n, do it!
        } else {                                                            // Otherwise, throw error message
            System.out.println(
                    "You cannot raise the platform more than " + (MAXPLATFORMANGLE - this.getPlatformAngle()) + "°");
        }
    }

    public boolean isPlatformDown() {
        boolean platformDown = true;

        if (this.platformAngle != 0) {
            platformDown = false;
        }
        return platformDown;
    }

}
