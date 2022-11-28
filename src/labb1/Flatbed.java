package labb1;


public class Flatbed extends Trailer{
    private final int MAX_NUMBER_OF_CARS;
    private int loadedCars;
    private int proximityToTransporter; //distans in whole meters from the transporter to the car that will be transported
    
    public Flatbed(int maxLoad, int MAX_NUMBER_OF_CARS){
    super(maxLoad);
    this.MAX_NUMBER_OF_CARS = MAX_NUMBER_OF_CARS;
    this.loadedCars = 0;
    this.proximityToTransporter = 0;
    }

    //Specific method for raising the platsform of the truck
    //Increases platsform angle if its not at the max angle
    //@Override
    public void extendPlatform(double currentSpeedX, double currentSpeedY){
        if (currentSpeedX != 0 || currentSpeedY != 0){
            throw new IllegalArgumentException("The truck is moving");
        }
        else{
            this.platformAngle += angle;
            super.setPlatformExtended(true);
            if (this.platformAngle >= MAX_EXTENSOIN_ANGLE){
                this.platformAngle = MAX_EXTENSOIN_ANGLE;
                }
        }
    }
    
    //Specific method for lowering platsform
    //Decreases thje platsform angle if itn not at the min angle of zero
    public void retractPlatform(int angle){
        this.platformAngle -= angle;
        if (this.platformAngle <= MIN_EXTENSION_ANGLE){
            this.platformAngle = MIN_EXTENSION_ANGLE;
            super.setPlatformExtended(false);
            }
    }
}
