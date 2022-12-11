// Module to hold the abstract superclass vehicle
// - Note that this class has the highest abstraction

// -- Packages -- //

package set.MVC.Model;


// --- Imports --- //

import java.awt.*;


// ---- Class ---- //

public abstract class Vehicles implements Movable {
    private final int    nrDoors;      // Number of doors on the vehicle
    private double       enginePower;  // Engine power of the vehicle
    private double       currentSpeed; // The current speed of the vehicle
    private Color        color;        // Color of the vehicle
    private final String modelName;    // The vehicle model name
    private double       xPosition;
    private double       yPosition;
    private double       direction;
    private boolean      engineOn;


    // --- Constructor --- // 

    public Vehicles(int nrDoors, Color color, int enginePower, String modelName){
        validateArguments(nrDoors, enginePower);     
        this.color = color;
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.stopEngine();
    }
    
    // --- Methods --- //

    // Methods to get values

    public double getXPosition() {
        return xPosition;
    }
    
    public double getYPosition(){
        return yPosition;
    }

    public double getDirection(){
        return direction;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public int getNrDoors(){
        return nrDoors;
    }


    public Color getColor(){
        return color;
    }
    

    // Methods to set values

    // Method to set x and y values for a vehicle
    public void setCoordinates(double xPosition, double yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    // Method to set the current speed of a vehicle, only allows positive values
    // - Otherwise, we throw an exception
    private void setCurrentSpeed(double speed){
        if (speed < 0 || speed > enginePower) {

            throw new IllegalArgumentException();
            
        }
        currentSpeed = speed;
    }

    private void setColor(Color clr){
	    color = clr;
    }

    private void setEnginePower(int power){
        enginePower = power;
    }


    // Methods with miscellaneous function

    // Method to start a vehicle
    
    public void startEngine(){
        engineOn = true;
    }

    public void stopEngine(){
        engineOn = false;
    }
    
    // Method to increase the speed of a vehicle
    // - Only accepts values between 0-1
    

    public void gas(double amount){
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException();
        } 
        if (engineOn){ 
        incrementSpeed(amount);
        }   
    }
    
    // Method to decrease the speed of a vehicle
    // - Only accepts values between 0-1, otherwise we throw an exception

    public void brake(double amount){
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException();
        } 
        decrementSpeed(amount);
    }

    // Method that calculates speed increase based on vehicle attributes
    private void incrementSpeed(double amount){
        double newSpeed;
        double enginePower = getEnginePower();
	    newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
        setCurrentSpeed(newSpeed);
        
    }

    // Method that calculates speed decrease based on vehicle attributes
    private void decrementSpeed(double amount){
        double  newSpeed;
        newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        setCurrentSpeed(newSpeed);
    }

    // Method that moves vehicle based on its direction attribute and current speed
    public void move(){
        double xSpeed = Math.cos(direction) * currentSpeed;
        double ySpeed = Math.sin(direction) * currentSpeed;
        xPosition += xSpeed;
        yPosition += ySpeed;
    }

    // Method to change the direction of a vehicle clockwise
    public void turnRight(){
        direction += 20;
    }

    // Method to change the direction of a vehicle anti-clockwise
    public void turnLeft(){
        direction -= 20;
    }

    // Method to check that initialized values for nrDoors and enginePower are valid
    // - Otherwise we throw an exception
    private void validateArguments(int nrDoors, int enginePower){
        if (nrDoors < 0 || enginePower < 0){
            throw new IllegalArgumentException();
        }
    }

    
    // --- Abstract Methods --- //

    protected abstract double speedFactor();
    
    
}
/* 
████████████████████████████████████████
████████████████████████████████████████
██████▀░░░░░░░░▀████████▀▀░░░░░░░▀██████
████▀░░░░░░░░░░░░▀████▀░░░░░░░░░░░░▀████
██▀░░░░░░░░░░░░░░░░▀▀░░░░░░░░░░░░░░░░▀██
██░░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░██
██░░░░░░░░░░░░░░░░░░█░█░░░░░░░░░░░░░░░██
██░░░░░░░░░░░░░░░░░▄▀░█░░░░░░░░░░░░░░░██
██░░░░░░░░░░████▄▄▄▀░░▀▀▀▀▄░░░░░░░░░░░██
██▄░░░░░░░░░████░░░░░░░░░░█░░░░░░░░░░▄██
████▄░░░░░░░████░░░░░░░░░░█░░░░░░░░▄████
██████▄░░░░░████▄▄▄░░░░░░░█░░░░░░▄██████
████████▄░░░▀▀▀▀░░░▀▀▀▀▀▀▀░░░░░▄████████
██████████▄░░░░░░░░░░░░░░░░░░▄██████████
████████████▄░░░░░░░░░░░░░░▄████████████
██████████████▄░░░░░░░░░░▄██████████████
████████████████▄░░░░░░▄████████████████
██████████████████▄▄▄▄██████████████████
████████████████████████████████████████
████████████████████████████████████████
*/