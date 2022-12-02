package labb1;

public abstract class Trailer {
    private int maxLoad;
    private boolean platformExtended;
    private int platformAngle;

    public Trailer(int maxLoad) {
        this.maxLoad = maxLoad;

    }

    // Returns true if the platsform is extended
    public Boolean getPlatformExtended() {
        return platformExtended;
    }

    // Set platromExtended
    public void setPlatformExtended() {
        this.platformExtended = true;
    }

    public void setPlatformRetracted() {
        this.platformExtended = false;
    }

    // Returns max load
    public int getMaxLoad() {
        return maxLoad;
    }

    public abstract void extendPlatform();

    public abstract void retractPlatform();

}
