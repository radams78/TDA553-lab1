package com.tda553.Models;



public abstract class TransportVehicle extends Vehicle
{
    private boolean platformActive; // True if the platform is active.
    private int platformAngle = 0; // Platform angle in degrees.
    private int platformMaxAngle; // Platform maximum angle in degrees.


    // Getters and setters
    public int getPlatformAngle()
    {
        return platformAngle;
    }

    public boolean isPlatformActive()
    {
        return platformActive;
    }

    public void setMaxPlatformAngle(int angle)
    {
        platformMaxAngle = angle;
    }
    public int getMaxPlatformAngle()
    {
        return platformMaxAngle;
    }

    public void setPlatformActive(boolean active)
    {
        platformActive = active;
    }

    public void setPlatformAngle(int angle)
    {
        platformAngle = angle;
    }
    
    /**
     * @param angle
     * Sets the platform angle to the specified value.
     * The angle of the platform cannot be lower than 0 or higher than 70.
     */
    public void raisePlatform(int angle) throws IllegalStateException
    {
        if (platformAngle == platformMaxAngle)
        {
            return; // Platform is already raised
        }
        if (!this.isPlatformActive()) 
        {
            throw new IllegalStateException("Cannot raise platform while moving");
        }
        
        if (platformAngle + angle >= platformMaxAngle) {
            throw new IllegalArgumentException("The platform's angle cannot be raised higher!");
        }
        
        platformAngle += angle;        
    }

    /**
     * @param angle
     * Sets the platform angle to the specified value.
     * The angle of the platform can not be lower than 0 degress.
     */ 
    public void lowerPlatform(int angle) throws IllegalStateException
    {
        if (isPlatformLowered())
        {
            return; // Platform is already lowered
        }
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

    // Check if allready platform lowered
    private boolean isPlatformLowered()
    {
        return platformAngle == 0;
    }


    @Override
    public void startEngine()
    {
        if (this.getPlatformAngle() != 0)
        {
            throw new IllegalStateException("Cannot start engine while platform is raised!");
        };
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
