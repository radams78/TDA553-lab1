package src;
import java.awt.*;
import java.lang.Math;

public abstract class Car {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected Color color; // Color of the car
    protected double currentSpeed; // The current speed of the car
    protected String modelName; // The car model name
    public double xPosition = 0, yPosition = 0;
    public double facingDirection = 0;

    public Car(int nrDoors, double enginePower, Color color, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        stopEngine();
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    
    protected abstract double speedFactor();

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    // Temporär abstract tills vi vet om den ska vara abstract eller inte
    public abstract void gas(double amount);

    // Temporär abstract tills vi vet om den ska vara abstract eller inte
    public abstract void brake(double amount);

    public void move(){
        updateXPosition();
        updateYPosition();
    }

    protected void updateXPosition(){
        xPosition += currentSpeed*getXComposant();
    }

    protected void updateYPosition(){
        yPosition += currentSpeed*getYComposant();
    }

    protected double getXComposant(){
        return Math.cos(facingDirection);
    }

    protected double getYComposant(){
        return Math.sin(facingDirection);
    }

    public void turnLeft(){
        facingDirection += Math.PI/60;
        facingDirection = facingDirection %(2*Math.PI);
    }

    public void turnRight(){
        facingDirection += -Math.PI/60;
        facingDirection = facingDirection %(2*Math.PI);
    }
}
