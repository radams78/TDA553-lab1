package src;

public class ContinuousPlatform extends Platform {
    private double platformAngle;

    public ContinuousPlatform() {
        this.platformAngle = 0;
    }

    public void raisePlatform(double currentSpeed) {
        if (platformAngle < 70 && isStationary(currentSpeed)) {
            this.platformAngle += 1;
        }
    }

    public void lowerPlatform(double currentSpeed) {
        if (platformAngle > 0 && isStationary(currentSpeed)){
            this.platformAngle -= 1;
        }
    }

    public boolean canGas() {
        return platformAngle == 0;
    }

    public double getPlatformAngle() {
        return platformAngle;
    }
}
