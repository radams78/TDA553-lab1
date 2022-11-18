package src;

import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors;
    private double enginePower;
    private Color color;
    private String modelName;
    private double currentSpeed;
    private double x;
    private double y;
    public boolean turnLeft, turnRight;

    public Car(int nrDoors, double enginePower, Color color, String modelName, double x, double y) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
    }

    public int getNrDoors() {
        return this.nrDoors;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(double speed) {
        currentSpeed = speed;
        if (currentSpeed > enginePower) {
            currentSpeed = enginePower;
        }
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public double getX() {
        return x;
    }

    public void setX(double amount) {
        x += amount;
    }

    public double getY() {
        return y;
    }

    public void setY(double amount) {
        y += amount;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public abstract double speedFactor();

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        try {
            if (amount <= 0 || amount >= 1) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible amount");
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        try {
            if (amount <= 0 || amount >= 1) {
                throw new Exception();
            } else {
                decrementSpeed(amount);

            }
        } catch (Exception e) {
            System.out.println("impossible amount");

        }
    }

    public void move() {
        if (turnLeft) {
            double leftMovement = -getCurrentSpeed();
            setX(leftMovement);
            setY(getCurrentSpeed());
        }

        else if (turnRight) {
            double rightMovement = getCurrentSpeed();
            setX(rightMovement);
            setY(getCurrentSpeed());
        } else {
            setY(getCurrentSpeed());
        }
    }

    public void turnLeftMethod() {
        turnLeft = true;
        turnRight = false;
    }

    public void turnRightMethod() {
        turnRight = true;
        turnLeft = false;
    }
}
