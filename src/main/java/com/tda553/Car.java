package com.tda553;

import java.awt.*;

public abstract class Car implements Movable
{

    protected int x, y;
    protected int direction = 1;

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    private int[][] directionTable =
    {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}};


    public int getNrDoors()
    {
        return nrDoors;
    }

    public double getEnginePower()
    {
        return enginePower;
    }

    public double getCurrentSpeed()
    {
        return currentSpeed;
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
        x += directionTable[direction][0] * currentSpeed;
        y += directionTable[direction][1] * currentSpeed;
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


    public int[] getPosition()
    {
        int[] position =
        {x, y};
        return position;
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
