import java.awt.*;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power
    private double currentSpeed; // Current speed
    private Color color; // Color of the car
    private String modelName; // Name of the model

    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    protected void incrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    protected void decrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

    public abstract double speedFactor();

    public void move() {
        // TODO Add movement
    }

    public void turnLeft() {
        // TODO Add turning left
    }

    public void turnRight() {
        // TODO Add turning right
    }

    public int getNrDoors() {
        return nrDoors;
    }

    // Protected
    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    // Protected?
    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    // Protected?
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    // Protected?
    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

}
