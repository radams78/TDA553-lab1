// This module contains the abstract superclass for all cars

// --- Imports --- //

import java.awt.*;


// ---- Class ---- //

public abstract class Car {

    private int nrDoors;         // Number of doors on the car
    private double enginePower;  // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color;         // Color of the car
    private String modelName;    // The car model name

    public Car(int nrDoors, Color color, int enginePower, String modelName){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.stopEngine();

    }
    
    // --- Methods --- //

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

    // Methods to set values
    public void setColor(Color clr){
	    color = clr;
    }

    public void setCurrentSpeed(double speed){
        currentSpeed = speed;
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

    public abstract double speedFactor();
    
    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);



    
}

    