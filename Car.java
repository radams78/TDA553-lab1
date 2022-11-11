import java.awt.*;

public abstract class Car implements Movable{

    private int nrDoors;
    private double enginePower;
    private Color color;
    private String modelName;
    private double currentSpeed;
    private double x;
    private double y;
    private boolean turnLeft, turnRight;

    public Car(int nrDoors, double enginePower, Color color, String modelName, double x, double y) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
       // this.currentSpeed = 0;
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

    public void setCurrentSpeed(double amount) {
        currentSpeed = amount;
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
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    public void move() {
        if(turnLeft){
        double leftMovement =  -getCurrentSpeed();
        setY(leftMovement);
        } 
        
        else if(turnRight){
            double rightMovement = getCurrentSpeed();
            setY(rightMovement);
        }
        else {
            setX(getCurrentSpeed());
            setY(getCurrentSpeed());
        }
    }

    public void turnLeft() {
        turnLeft = true;
        turnRight = false;
    }

    public void turnRight() {
        turnRight = true;
        turnLeft = false;
    }
}
