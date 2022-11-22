import java.awt.*;
import static java.lang.Math.round;

abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private Point position;
    private Direction direction;

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.direction = Direction.RIGHT;
        stopEngine();
    }

    public int getNrDoors() {
        return nrDoors;
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

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCurrentSpeed(double speed) {
        currentSpeed = speed;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void move() {
        int speed = (int)round(currentSpeed);

        switch(direction) {
            case UP: position.translate(0, speed);
            case LEFT: position.translate(-speed, 0);
            case DOWN: position.translate(0, -speed);
            case RIGHT: position.translate(speed, 0);
        }
    }

    public void turnLeft() {
        switch(direction) {
            case UP: direction = Direction.LEFT; break;
            case LEFT: direction = Direction.DOWN; break;
            case DOWN: direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.UP; break;
        }
    }

    public void turnRight() {
        switch(direction) {
            case UP: direction = Direction.RIGHT; break;
            case RIGHT: direction = Direction.DOWN; break;
            case DOWN: direction = Direction.LEFT; break;
            case LEFT: direction = Direction.UP; break;
        }
    }

    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);
    public abstract void decrementSpeed(double amount);

    public void gas(double amount) {
        incrementSpeed(amount);
    }

    public void brake(double amount) {
        decrementSpeed(amount);
    }

}