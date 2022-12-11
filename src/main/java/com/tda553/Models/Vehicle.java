package com.tda553.Models;

import java.awt.Color;

import com.tda553.Interfaces.IVehicle;
import com.tda553.Interfaces.ITransportable;

public abstract class Vehicle extends Entity implements IVehicle, ITransportable
{
    protected int direction = 1;

    protected int nrDoors; // Number of doors on the vehicle
    protected double enginePower; // Engine power of the vehicle
    protected double currentSpeed; // The current speed of the vehicle
    protected Color color; // Color of the vehicle
    protected String modelName; // The vehicle model name
    protected boolean beingTransported = false;
    protected int vehicleWeight;

    private int[][] directionTable =
    {
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0}
    };

    public int getNrDoors()
    {
        return nrDoors;
    }

    public String getModelName()
    {
        return modelName;
    }

    public double getEnginePower()
    {
        return enginePower;
    }

    public boolean isBeingTransported(){
        return beingTransported;
    }

    public void setBeingTransported(boolean bt){
        beingTransported = bt;
    }

    public int getVehicleWeight(){
        return vehicleWeight;
    }
    
    public double getCurrentSpeed()
    {
		return currentSpeed;
    }

    public Color getColor()
    {
        return color;
    }

    public boolean checkEngineRunning()  throws IllegalStateException
    {
        if (currentSpeed == 0)
        {
            throw new IllegalStateException("Engine is not running");
        }
        return true;
    }

    public void setColor(Color clr)
    {
        color = clr;
    }
    
    /*
     * Start the engine
     * Throws an IllegalStateException if the engine is already running
     */
    public void startEngine() throws IllegalStateException
    {
        if (currentSpeed > 0)
        {
            throw new IllegalStateException("Engine is already running");
        }
        currentSpeed = 0.1;
    }
    /*
     * Stop the engine
     * Throws an IllegalStateException if the engine is already stopped or if the vehicle is moving
     */
    public void stopEngine() throws IllegalStateException
    {
        if (currentSpeed > 0)
        {
            throw new IllegalStateException("Cannot stop engine while moving");
        }
        currentSpeed = 0;
    }

    /*
     * Accelerate the vehicle by a certain amount
     * @param amount The amount to accelerate by ( 0 - 1)
     * @throws IllegalArgumentException if amount is not between 0 and 1
     */
    public void gas(double amount) throws IllegalArgumentException, IllegalStateException
    {
        checkAmout(amount);
        checkEngineRunning();
        currentSpeed = checkNewSpeed(getCurrentSpeed() + speedFactor() * amount, true);
    }
    
    /*
     * Brake the vehicle by a certain amount
     * @param amount The amount to brake by ( 0 - 1)
     * @throws IllegalArgumentException if amount is not between 0 and 1
     */
    public void brake(double amount) throws IllegalArgumentException
    {
        checkAmout(amount);
        currentSpeed = getCurrentSpeed() * (1 - amount);
    }

    private void checkAmout(double amount) throws IllegalArgumentException
    {
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException("Amount must be between 0 and 1");
        }
    }
  
    /*
     * Move the vehicle
    */
    public void move()
    {
        setPosition((int)Math.round(pos.getX() + directionTable[direction][0] * currentSpeed), (int)Math.round(pos.getY() + directionTable[direction][1] * currentSpeed));
    }

    public void turnLeft()
    {
        int temp_direction = (direction - 1) % 4;
        if (temp_direction < 0)
            temp_direction = 3;

        direction = temp_direction;
    }

    public void turnRight()
    {
        direction = (direction + 1) % 4;
    }

    public abstract double speedFactor();

    private double checkNewSpeed(double newSpeed, boolean isAccelerating)
    {
        if (newSpeed < 0 || newSpeed > enginePower)
        {
            return currentSpeed;
        }
        if (isAccelerating && newSpeed < currentSpeed || !isAccelerating && newSpeed > currentSpeed)
        {
            return currentSpeed;
        }
        return newSpeed;
    }

}