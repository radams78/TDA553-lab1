// This module contains the abstract superclass for all cars

// --- Packages --- //

package set;


// --- Imports --- //

import java.awt.*;

import javax.sound.midi.Track;
import javax.sound.sampled.BooleanControl;


// ---- Class ---- //

public abstract class Car implements Movable {

    private int    nrDoors;      // Number of doors on the car
    private double enginePower;  // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color  color;        // Color of the car
    private String modelName;    // The car model name
    private double xPosition;
    private double yPosition;
    private double direction;
    private boolean engineOn;

    public Car(int nrDoors, Color color, int enginePower, String modelName){
        validateArguments(nrDoors, enginePower);     
        this.color = color;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.stopEngine();

    }
    
    // --- Methods --- //
    
    private void validateArguments(int nrDoors, int enginePower){
        if (nrDoors < 0 || enginePower < 0){
            throw new IllegalArgumentException();
        }
    }
    
    public void turnRight(){
        direction += 20;
    }

    public void turnLeft(){
        direction -= 20;
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
    public double getXPosition(){
        return xPosition;
    }
    
    public double getYPosition(){
        return yPosition;
    }
    
    public double getDirection(){
        return direction;
    }

    // Methods to set values

    public void move(){
        double xSpeed = Math.cos(direction) * currentSpeed;
        double ySpeed = Math.sin(direction) * currentSpeed;
        xPosition += xSpeed;
        yPosition += ySpeed;
    }
    
    private void incrementSpeed(double amount){
        double newSpeed;
        double enginePower = getEnginePower();
	    newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        setCurrentSpeed(newSpeed);
        
    }

    // Decrements the speed of the vehicle depending on the speedfactor
    private void decrementSpeed(double amount){
        double  newSpeed;
        newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(newSpeed);
    }

    private void setColor(Color clr){
	    color = clr;
    }

    private void setCurrentSpeed(double speed){
        if (speed < 0 || speed > enginePower) {

            throw new IllegalArgumentException();
            
        }
        currentSpeed = speed;
    }

    protected void setEnginePower(int power){
        enginePower = power;
    }

    public void startEngine(){
	    engineOn = true;
    }

    public void stopEngine(){
	    
        engineOn = false;
    }

    public void gas(double amount){
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException();
        } 
        if (engineOn){ 
        incrementSpeed(amount);
        }   
    }

    public void brake(double amount){
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException();
        } 
        decrementSpeed(amount);
    }
    
    // --- Abstract Methods --- //

    public abstract double speedFactor();
}

    