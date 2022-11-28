package labb1;

public class Dumper extends Trailer{
    private int platformAngle;
    private final int MIN_EXTENSION_ANGLE;
    private final int MAX_EXTENSOIN_ANGLE;

    public Dumper(int maxLoad, int MIN_EXTENSION_ANGLE, int MAX_EXTENSOIN_ANGLE){
    super(maxLoad);
    this.MIN_EXTENSION_ANGLE = MIN_EXTENSION_ANGLE;
    this.MAX_EXTENSOIN_ANGLE = MAX_EXTENSOIN_ANGLE;
    }

    //Specific method for raising the platsform of the truck
    //Increases platsform angle if its not at the max angle
    //@Override
    public void extendPlatform(double currentSpeedX, double currentSpeedY, int angle){
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
