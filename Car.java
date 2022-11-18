

import java.awt.*;



public abstract class Car implements Movable {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double x;
    protected double y;
    protected boolean turnLeft, turnRight;

    public Car(int doors, double power, double speed, Color caColor, String name, double x, double y, boolean left,
            boolean right) {
        this.nrDoors = doors;
        this.enginePower = power;
        this.currentSpeed = speed;
        this.color = caColor;
        this.modelName = name;
        this.x = x;
        this.y = y;
        this.turnLeft = left;
        this.turnRight = right;
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

    public void setCurrentSpeed(double ammount) {
        this.currentSpeed = ammount;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color clr) {
        this.color = clr;
    }

    public void startEngine() {
        this.currentSpeed = 0.1;
    }

    public void stopEngine() {
        this.currentSpeed = 0;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double ammount) {
        this.x += ammount;
    }

    public void setY(double ammount) {
        this.y += ammount;
    }

    public void turnLeft() {
        this.turnRight = false;
        this.turnLeft = true;
    }

    public void turnRight() {
        this.turnLeft = false;
        this.turnRight = false;
    }

    public void move() {
        if (this.turnLeft == true) {
            setX(-getCurrentSpeed());
            setY(getCurrentSpeed());

        } else if (this.turnRight == true) {
            setX(getCurrentSpeed());
            setY(getCurrentSpeed());
        } else {
            setY(getCurrentSpeed());
        }
    }

    public void gas(double amount) {
        try {
            if (amount <= 0 || amount >= 1) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible ammount");
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
            System.out.println("impossible ammount");

        }
    }


    abstract double speedFactor();

    abstract void incrementSpeed(double amount);

    abstract void decrementSpeed(double amount);

    // TODO fix this method according to lab pm

}
