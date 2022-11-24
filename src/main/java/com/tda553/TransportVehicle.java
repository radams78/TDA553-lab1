package com.tda553;

import com.tda553.Vehicle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TransportVehicle extends Vehicle
{
    protected boolean platformActive; // True if the platform is active.
    protected int platformAngle = 0; // Platform angle in degrees.
    protected int platformMaxAngle; // Platform maximum angle in degrees.
    protected int maxCars = 0; // Maximum number of cars that can be transported.

    protected List<Vehicle> loadedVehicles = new ArrayList<>();
    
    public int getPlatformAngle()
    {
        return platformAngle;
    }
    
    /**
     * @param angle
     * Sets the platform angle to the specified value.
     * The angle of the platform cannot be lower than 0 or higher than 70.
     */
    public void raisePlatform(int angle)
    {
        if (!platformActive) 
        {
            throw new IllegalStateException("Cannot raise platform while moving");
        }
        
        if (platformAngle + angle <= platformMaxAngle) {
            platformAngle += angle;
        }
        throw new IllegalArgumentException("The platform's angle cannot be raised higher!");
    }

    /**
     * @param angle
     * Sets the platform angle to the specified value.
     * The angle of the platform can not be lower than 0 degress.
     */ 
    public void lowerPlatform(int angle)
    {
        if (!platformActive) 
        {
            throw new IllegalStateException("Cannot raise platform while moving");
        }

        if (platformAngle - angle >= 0)
        {
            platformAngle -= angle;
        }
        throw new IllegalArgumentException("The platform cannot be lowered any further!");
    }
    /**
     * @param veh
     *  Loads a vehicle onto the platform.
     */
    public void loadVehicle(Vehicle veh)
    {
        if (platformAngle == 0) return;
        loadedVehicles.add(veh);
    }

    /**
     * @param veh
     *  Unloads a vehicle from the platform.
     */
    public Vehicle unloadVehicle(Vehicle veh)
    {
        if (platformAngle == 0) return null;
        Vehicle v = loadedVehicles.get(loadedVehicles.indexOf(veh));
        loadedVehicles.remove(veh);
        return v;
    }

    @Override
    public void startEngine()
    {
        if (platformAngle != 0) return;
        platformActive = false;
        currentSpeed = 0.1;
    }

    @Override
    public void stopEngine()
    {
        currentSpeed = 0;
        platformActive = true;
    }
}
