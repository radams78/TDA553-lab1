package Lab1.truckextensions;

public class Transportbed extends Trailer {
    private Boolean extendedRamp;

    public Transportbed() {
        this.extendedRamp = false;
    }

    public Boolean getExtendedRamp() {
        return extendedRamp;
    }

    public void lowerRamp(double amount) {
        this.extendedRamp = true;
    }

    public void raiseRamp(double amount) {
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
