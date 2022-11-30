package src;
import java.awt.*;

abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double posx, posy;
    private Direction direction;

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.direction = Direction.RIGHT;
        this.posx = 0;
        this.posy = 0;
        stopEngine();
    }

    // This comment should not go on the master
    // This comment should go on the Sne branch

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    public void move() {

        switch(direction) {
            case UP: posy += currentSpeed; break;
            case LEFT: posx -= currentSpeed; break;
            case DOWN: posy -= currentSpeed; break;
            case RIGHT: posx += currentSpeed; break;
        }
    }

    public void turnLeft() {
        int index = (direction.ordinal() + 3) % 4;
        direction = Direction.values()[index];
    }

    public void turnRight() {
        int index = (direction.ordinal() + 1) % 4;
        direction = Direction.values()[index];
    }

    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);
    public abstract void decrementSpeed(double amount);

    public void gas(double amount) {
        if (amount < 0 || amount > 1) {throw new IllegalArgumentException("Gas only accepts values between [0, 1]");}
        incrementSpeed(amount);
    }

    public void brake(double amount) {
        if (amount < 0 || amount > 1) {throw new IllegalArgumentException("Brake only accepts values between [0, 1]");}
        decrementSpeed(amount);
    }

    public void startEngine(){
	    currentSpeed = 0.1;
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

    public double getX() {
        return posx;
    }

    public double getY() {
        return posy;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setCurrentSpeed(double speed) {
        if (0 <= speed && speed <= enginePower) {
            currentSpeed = speed;
        }
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}