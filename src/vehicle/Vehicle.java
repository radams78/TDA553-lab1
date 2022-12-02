package vehicle;
import java.awt.*;

//import Movable;

public abstract class Vehicle implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private double direction;
    private double x;
    private double y;
    private double dx;
    private double dy;

    public Vehicle(int nrDoors, double enginePower, double currentSpeed, Color color) {
        this.nrDoors = Math.max(nrDoors, 0);;
        this.enginePower = Math.max(enginePower, 0);
        this.currentSpeed = Math.max(currentSpeed, 0);
        this.color = color;
        this.direction = 0;
        this.x = 0;
        this.y = 0;
        this.dx = 0;
        this.dy = 0;
        
        stopEngine();
    }

    public int getNrDoors() {
        return nrDoors;
    }

    private void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = Math.max(currentSpeed, 0);
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

    public void setColor(Color color) {
            this.color = color;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    abstract double speedFactor();

    private void incrementSpeed(double amount){
	    double currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
        setCurrentSpeed(currentSpeed);
    }

    private void decrementSpeed(double amount){
        double currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(currentSpeed);
    }

    private void calculateDx() {
        this.dx = this.getCurrentSpeed() * Math.cos(Math.toRadians(direction));
    }

    private void calculateDy() {
        this.dy = this.getCurrentSpeed() * Math.sin(Math.toRadians(direction));
    }

    @Override
    public void move() {
        this.calculateDx();
        this.calculateDy();
        this.x += this.dx;
        this.y += this.dy;
    }

    @Override
    public void turnRight() {
        this.direction -= 1;
        this.direction %= 360;
    }

    @Override
    public void turnLeft() {
        this.direction += 1;
        this.direction %= 360;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDx() {
        return dx;
    }
    
    public double getDy() {
        return dy;
    }

    public double getDirection() {
        return direction;
    }

    public void gas(double gas){
        if((0 <= gas) && (gas <= 1) && (this.currentSpeed <= this.enginePower)) { 
            incrementSpeed(gas);
        }
    }
    public void brake(double brake){
        if((0 <= brake) && (brake <= 1) && (this.currentSpeed >= 0)){ 
            decrementSpeed(brake);
        }
    }   
}
