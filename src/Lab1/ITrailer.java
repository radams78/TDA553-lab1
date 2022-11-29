package Lab1;

public interface ITrailer {
    public abstract Boolean allowDriving();

    public abstract void raiseRamp(double amount);

    public abstract void lowerRamp(double amount);

    public abstract double getCurrAngle();

    public abstract double getMaxAngle();

    public abstract double getMinAngle();
}
