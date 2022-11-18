package set;
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
        validate_arguments(nrDoors, enginePower);     
        this.color = color;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.stopEngine();
        

    }
    
    // --- Methods --- //
    public void validate_arguments(int nrDoors, int enginePower){
        if (nrDoors < 0 || enginePower < 0){
            throw new IllegalArgumentException();
        }
    }
    
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
    
    protected void incrementSpeed(double amount){
        double newSpeed;
        double enginePower = getEnginePower();
	    newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        setCurrentSpeed(newSpeed);
        
    }

    // Decrements the speed of the vehicle depending on the speedfactor
    protected void decrementSpeed(double amount){
        double  newSpeed;
        newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(newSpeed);
    }

    protected void setColor(Color clr){
	    color = clr;
    }

    protected void setCurrentSpeed(double speed){
        if (speed < 0 || speed > enginePower) {

            throw new IllegalArgumentException();
            
        }
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
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException();
        } 
        incrementSpeed(amount);
    }

    public void brake(double amount){
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException();
        } 
        decrementSpeed(amount);
    }
    
    // --- Abstract Methods --- //

    protected abstract double speedFactor();
    
    



    
}

    