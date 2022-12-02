package src;

public class DiscretePlatform extends Platform {
    private boolean platformIsUp;

    public DiscretePlatform() {
        this.platformIsUp = true;
    }

    public void raisePlatform(double currentSpeed) {
        if (isStationary(currentSpeed)) {
            platformIsUp = true;
        }
    }

    public void lowerPlatform(double currentSpeed) {
        if (isStationary(currentSpeed)) {
            platformIsUp = false;
        }
    }

    @Override
    public boolean canGas() {
        return platformIsUp;
    }

    public boolean isPlatformUp() {
        return platformIsUp;
    }
}
