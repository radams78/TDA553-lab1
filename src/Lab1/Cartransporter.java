package Lab1;

public class Cartransporter implements ITrailer {
    private Boolean extendedRamp;

    public Cartransporter(Boolean extendedRamp) {
        this.extendedRamp = extendedRamp;
    }

    public Boolean getExtendedRamp() {
        return extendedRamp;
    }

    public void lowerRamp(double percentage) {
        this.extendedRamp = true;
    }

    public void raiseRamp(double percentage) {
        this.extendedRamp = false;
    }

    public Boolean allowDriving() {
        return !extendedRamp;
    }

    public double getCurrAngle() {
        return 0;
    }

    public double getMaxAngle() {
        return 0;
    }

    public double getMinAngle() {
        return 0;
    }
}
