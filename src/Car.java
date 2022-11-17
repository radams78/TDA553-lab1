
import java.awt.*;
import javax.management.loading.PrivateClassLoader;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private double direction;
    private double x;
    private double y;
    private double dx;
    private double dy;
    // private String modelName; // The car model name

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.direction = 0;
        this.x = 0;
        this.y = 0;
        this.dx = 0;
        this.dy = 0;
        // this.modelName = modelName;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setnrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    abstract void incrementSpeed(double amount9);

    abstract void decrementSpeed(double amount);

    public void setDx(double dx) {
        this.dx = this.getCurrentSpeed() * Math.cos(direction);
        }

    public void setDy(double dy) {
        this.dy = this.getCurrentSpeed() * Math.sin(direction);
    }

    @Override
    public void move() {
        this.x += this.dx;
        this.y += this.dy;
    }

    @Override
    public void turnRight() {
        this.direction -= 1 % 360;

    }

    @Override
    public void turnLeft() {
        this.direction += 1 % 360;
    }

}
