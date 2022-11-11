import java.awt.*;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power
    private double currentSpeed; // Current speed
    private Color color; // Color of the car
    private String modelName; // Name of the model
    private double posX;
    private double posY;
    protected Direction currentDirection;

    protected enum Direction {
        LEFT,
        UP,
        RIGHT,
        DOWN
    }

    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.posX = 0;
        this.posY = 0;
        this.currentDirection = Direction.UP;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public abstract void gas(double amount);

    public abstract void brake(double amount);

    protected void incrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    protected void decrementSpeed(double amount) {
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }

    public abstract double speedFactor();

    @Override
    public void move() {
        // TODO Add movement
    }

    @Override
    public void turnLeft() {
        // TODO Add turning left
    }

    @Override
    public void turnRight() {
        // TODO Add turning right
    }

    public int getNrDoors() {
        return nrDoors;
    }

    // Protected
    // protected void setNrDoors(int nrDoors) {
    // this.nrDoors = nrDoors;
    // }

    public double getEnginePower() {
        return enginePower;
    }

    // Protected?
    // public void setEnginePower(double enginePower) {
    // this.enginePower = enginePower;
    // }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    // Protected?
    protected void setCurrentSpeed(double currentSpeed) {
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

    // public void setModelName(String modelName) {
    // this.modelName = modelName;
    // }

}
