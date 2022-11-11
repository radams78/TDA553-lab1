// This module contains the abstract superclass for all cars

// --- Imports --- //

import java.awt.*;


// ---- Class ---- //

public abstract class Car implements Movable {

    private int    nrDoors;      // Number of doors on the car
    private double enginePower;  // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color  color;        // Color of the car
    private String modelName;    // The car model name
    private double x;
    private double y;
    private double direction;

    public Car(int nrDoors, Color color, int enginePower, String modelName){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.stopEngine();
        

    }
    
    // --- Methods --- //
    
    public void turnRight(){
        direction -= 20;
    }

    public void turnLeft(){
        direction += 20;
    }
    // Methods to get values
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
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getDirection(){
        return direction;
    }

    // Methods to set values

    public void move(){
        double xSpeed = Math.cos(direction) * currentSpeed;
        double ySpeed = Math.sin(direction) * currentSpeed;
        x += xSpeed;
        y += ySpeed;
    }

    protected void setColor(Color clr){
	    color = clr;
    }

    protected void setCurrentSpeed(double speed){
        currentSpeed = speed;
    }

    protected void setEnginePower(int power){
        enginePower = power;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void gas(double amount){
        incrementSpeed(amount);
    }

    public void brake(double amount){
        decrementSpeed(amount);
    }
    
    // --- Abstract Methods --- //

    protected abstract double speedFactor();
    
    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);



    
}

    