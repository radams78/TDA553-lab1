package Lab1;

public class Flatbed {
    private double currAngle = 0d;
    private double maxAngle = 70d;
    private double minAngle = 0d;

    public Flatbed(double maxAngle, double minAngle) {
        this.maxAngle = maxAngle;
        this.minAngle = minAngle;
    }

    public double getcurrAngle() {
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

    public void increaseAngle(double amount) {
        setCurrAngle(getcurrAngle() + amount);
    }

    public void decreaseAngle(double amount) {
        setCurrAngle(getcurrAngle() - amount);
    }

    public double getMaxAngle() {
        return maxAngle;
    }

    public double getminAngle() {
        return minAngle;
    }
}
