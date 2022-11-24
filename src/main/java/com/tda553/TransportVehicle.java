package com.tda553;

import com.tda553.Vehicle;

public abstract class TransportVehicle extends Vehicle
{
    protected boolean platformActive; // True if the platform is active.
    protected int platformAngle; // Platform angle in degrees.
    
    public int getPlatformAngle()
    {
        return platformAngle;
    }

    public abstract void raisePlatform(int angle);

    public abstract void lowerPlatform(int angle);

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
