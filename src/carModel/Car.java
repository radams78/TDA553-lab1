package src.carModel;

import java.awt.*;
import java.lang.Math;

public abstract class Car implements Movable {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private Color color; // Color of the car
    private double currentSpeed; // The current speed of the car
    private String modelName; // The car model name
    private double facingDirection = 0;
    private Position position;
    private boolean isLoaded = false;

    public Car(int nrDoors, double enginePower, Color color, String modelName, int positionX, int positionY) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.position = new Position(positionX, positionY);
        stopEngine();
    }
    public String getModelName() {
        return modelName;
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

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    protected double speedFactor() {
        return 1;
    }

    private void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void gas(double amount) {
        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException("amount outside of range [0,1]");
        } else {
            incrementSpeed(amount);
        }
    }

    public void brake(double amount) {
        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException("amount outside of range [0,1]");
        } else {
            decrementSpeed(amount);
        }
    }

    public void setIsLoaded(boolean loadedStatus) {
        isLoaded = loadedStatus;
    }

    public void move() {
        if (!isLoaded) {
            updateXPosition();
            updateYPosition();
        }
    }

    private void updateXPosition() {
        position.setXPosition(position.getXPosition() + currentSpeed * getXComposant());
    }

    private void updateYPosition() {
        position.setYPosition(position.getYPosition() + currentSpeed * getYComposant());
    }

    protected double getXComposant() {
        return Math.cos(facingDirection);
    }

    protected double getYComposant() {
        return Math.sin(facingDirection);
    }

    public double getFacingDirection() {
        return facingDirection;
    }

    public double getXPosition() {
        return position.getXPosition();
    }
    //Defensive copying
    public Position getPosition() {
        return new Position(position);
    }

    public double getYPosition() {
        return position.getYPosition();
    }

    public void turnLeft() {
        facingDirection += Math.PI / 60;
        facingDirection = facingDirection % (2 * Math.PI);
    }

    public void turnRight() {
        facingDirection -= Math.PI / 60;
        facingDirection = facingDirection % (2 * Math.PI);
    }
}
