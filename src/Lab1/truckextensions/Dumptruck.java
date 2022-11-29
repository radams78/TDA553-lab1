package Lab1.truckextensions;

import Lab1.interfaces.ITrailer;

public class Dumptruck implements ITrailer {
    private double currAngle = 0d;
    private double maxAngle = 70d;
    private double minAngle = 0d;

    public Dumptruck(double maxAngle, double minAngle) {
        this.maxAngle = maxAngle;
        this.minAngle = minAngle;
    }

    public double getCurrAngle() {
        return currAngle;
    }

    public void setCurrAngle(double currentAngle) {
        if (currentAngle > maxAngle) {
            this.currAngle = maxAngle;

        } else if (currentAngle < minAngle) {
            this.currAngle = minAngle;

        } else {
            this.currAngle = currentAngle;
        }
        // TODO Add check if vehicle is moving in truck
    }

    public void raiseRamp(double amount) {
        setCurrAngle(getCurrAngle() + amount);
    }

    public void lowerRamp(double amount) {
        setCurrAngle(getCurrAngle() - amount);
    }

    public Boolean allowDriving() {
        return currAngle == 0d;
    }

    public double getMaxAngle() {
        return maxAngle;
    }

    public double getMinAngle() {
        return minAngle;
    }
}
