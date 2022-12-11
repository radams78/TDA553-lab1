package com.tda553.Models;

import java.awt.Color;

import com.tda553.Interfaces.IVehicle;
import com.tda553.Interfaces.ITransportable;

public abstract class Vehicle extends Entity implements IVehicle, ITransportable
{
    private int direction = 1;
    private int nrDoors; // Number of doors on the vehicle
    private int vehicleWeight;
    private double enginePower; // Engine power of the vehicle
    private double currentSpeed; // The current speed of the vehicle
    private boolean beingTransported = false;
    private Color color; // Color of the vehicle
    private String modelName; // The vehicle model name

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

    public void setNrDoors(int nr)
    {
        nrDoors = nr;
    }

    public String getModelName()
    {
        return modelName;
    }

    public void setModelName(String name)
    {
        modelName = name;
    }

    public double getEnginePower()
    {
        return enginePower;
    }

    public void setEnginePower(int power)
    {
        enginePower = power;
    }

    public boolean isBeingTransported()
    {
        return beingTransported;
    }

    public void setBeingTransported(boolean bt)
    {
        beingTransported = bt;
    }

    public int getVehicleWeight()
    {
        return vehicleWeight;
    }

    public void setVehicleWeight(int weight)
    {
        vehicleWeight = weight;
    }
    
    public double getCurrentSpeed()
    {
		return currentSpeed;
    }
    
    public void setCurrentSpeed(int speed)
    {
		currentSpeed = speed;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color clr)
    {
        color = clr;
    }

    public void startEngine()
    {
        currentSpeed = 0.1;
    }

    public void stopEngine()
    {
        currentSpeed = 0;
    }

    public void gas(double amount)
    {
        checkAcceleration(amount);
        incrementSpeed(amount);
    }

    public void brake(double amount)
    {
        checkAcceleration(amount);
        decrementSpeed(amount);
    }

    private void checkAcceleration(double amount)
    {
        if (amount < 0 || amount > 1)
        {
            throw new IllegalArgumentException("Amount must be between 0 and 1");
        }
    }

    public void move()
    {
        setPosition((int)Math.round(getPosition()[0] + directionTable[direction][0] * currentSpeed), (int)Math.round(getPosition()[1] + directionTable[direction][1] * currentSpeed));
    }

    public void turnLeft()
    {
        int temp_direction = (direction - 1) % 4;
        if (temp_direction < 0)
        {
            temp_direction = 3;
        }
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

    private void incrementSpeed(double amount)
    {
        currentSpeed = checkNewSpeed(getCurrentSpeed() + speedFactor() * amount, true);
    }

    private void decrementSpeed(double amount)
    {
        currentSpeed = checkNewSpeed(getCurrentSpeed() - speedFactor() * amount, false);
    }
}