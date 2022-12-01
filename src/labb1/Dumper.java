package labb1;

public class Dumper extends Trailer {
    private int platformAngle;
    private final int MIN_EXTENSION_ANGLE;
    private final int MAX_EXTENSOIN_ANGLE;
    private Double platformSpeed;

    public Dumper(int maxLoad, int MIN_EXTENSION_ANGLE, int MAX_EXTENSOIN_ANGLE, double platformSpeed) {
        super(maxLoad);
        this.MIN_EXTENSION_ANGLE = MIN_EXTENSION_ANGLE;
        this.MAX_EXTENSOIN_ANGLE = MAX_EXTENSOIN_ANGLE;
        this.platformSpeed = 1.0;
    }


    // Specific method for raising the platsform of the truck
    // Increases platsform angle if its not at the max angle
    @Override
    public void extendPlatform() {
        platformAngle+=platformSpeed;
        if (this.platformAngle >= MAX_EXTENSOIN_ANGLE) {
            this.platformAngle = MAX_EXTENSOIN_ANGLE;
        }

        super.setPlatformExtended();

    }

    // Specific method for lowering platsform
    // Decreases thje platsform angle if itn not at the min angle of zero
    @Override
    public void retractPlatform() {
        platformAngle-=platformSpeed;
        if (this.platformAngle <= MIN_EXTENSION_ANGLE) {
            this.platformAngle = MIN_EXTENSION_ANGLE;
        }

        super.setPlatformRetracted();

    }


    public int getPlatformAngle() {
        return platformAngle;
    }
}
