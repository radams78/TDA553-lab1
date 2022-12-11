package com.tda553.Models;

import java.util.ArrayList;
import java.util.List;

public abstract class TransportVehicle extends Vehicle
{
    private boolean platformActive; // Is the platform active?

    private int platformAngle = 0; // Platform angle in degrees.
    private int platformMaxAngle; // Platform maximum angle in degrees.
    private int maxCars = 0; // Maximum number of cars that can be transported.

    private List<Vehicle> loadedVehicles = new ArrayList<>();

    public int getPlatformAngle()
    {
        return platformAngle;
    }

    public void setPlatformAngle(int angle)
    {
        platformAngle = angle;
    }

    public int getPlatformMaxAngle()
    {
        return platformMaxAngle;
    }

    public void setPlatformMaxAngle(int angle)
    {
        platformMaxAngle = angle;
    }

    public int getMaxCars()
    {
        return maxCars;
    }

    public void setMaxCars(int cars)
    {
        maxCars = cars;
    }

    public List<Vehicle> getLoadedVehicles()
    {
        return loadedVehicles;
    }

    public void addLoadedVehicle(Vehicle vehicle)
    {
        loadedVehicles.add(vehicle);
    }

    public void setLoadedVehicles(List<Vehicle> vehicles)
    {
        loadedVehicles = vehicles;
    }

    public Boolean getPlatformActive()
    {
        return platformActive;
    }

    public void setPlatformActive(Boolean active)
    {
        platformActive = active;
    }

    /**
     * @param angle
     * Sets the platform angle to the specified value.
     * The angle of the platform cannot be lower than 0 or higher than 70.
     */
    public void raisePlatform(int angle)
    {
        if (!getPlatformActive()) 
        {
            throw new IllegalStateException("Cannot raise platform while moving");
        }
        
        if (getPlatformAngle() + angle >= getPlatformMaxAngle()) {
            throw new IllegalArgumentException("The platform's angle cannot be raised higher!");
        }
        
        setPlatformAngle(getPlatformAngle() + angle);        
    }

    /**
     * @param angle
     * Sets the platform angle to the specified value.
     * The angle of the platform can not be lower than 0 degress.
     */ 
    public void lowerPlatform(int angle)
    {
        if (!getPlatformActive()) 
        {
            throw new IllegalStateException("Cannot raise platform while moving");
        }

        if (getPlatformAngle() - angle >= 0)
        {
            setPlatformAngle(getPlatformAngle() - angle);
        }
        throw new IllegalArgumentException("The platform cannot be lowered any further!");
    }

    @Override
    public void startEngine()
    {
        if (getPlatformAngle() != 0)
        {
            throw new IllegalStateException("Cannot start engine while platform is raised!");
        };
        setPlatformActive(false);
        setCurrentSpeed(1);
    }

    @Override
    public void stopEngine()
    {
        setCurrentSpeed(0);
        setPlatformActive(true);
    }
}
