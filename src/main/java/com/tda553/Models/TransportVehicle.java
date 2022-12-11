package com.tda553.Models;



public abstract class TransportVehicle extends Vehicle
{
    protected boolean platformActive; // True if the platform is active.
    protected int platformAngle = 0; // Platform angle in degrees.
    protected int platformMaxAngle; // Platform maximum angle in degrees.

    public int getPlatformAngle()
    {
        return platformAngle;
    }

    public boolean isPlatformActive()
    {
        return platformActive;
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

    // Check if allready platform raised
    private boolean isPlatformRaised()
    {
        return platformAngle == platformMaxAngle;
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
