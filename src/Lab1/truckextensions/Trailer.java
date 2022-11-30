package Lab1.truckextensions;

public interface Trailer {
    public Boolean allowDriving();

    public void raiseRamp(double amount);

    public void lowerRamp(double amount);

    public double getCurrAngle();

    public double getMaxAngle();

    public double getMinAngle();
}
