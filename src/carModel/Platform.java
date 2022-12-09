package src.carModel;

public abstract class Platform {
    public abstract void raisePlatform(double currentSpeed);

    public abstract void lowerPlatform(double currentSpeed);

    public boolean isStationary(double currentSpeed) {
        return currentSpeed == 0;
    }

    public abstract boolean canGas();
}
