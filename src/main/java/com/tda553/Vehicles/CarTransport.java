package com.tda553.Vehicles;

import com.tda553.TransportVehicle;
import java.awt.Color;

public class CarTransport extends TransportVehicle
{
    private int platformAngle = 0; // Degrees

    public CarTransport()
    {
        nrDoors = 2;
        color = Color.black;
        enginePower = 200;
        modelName = "CarTransport";
        stopEngine();
    }
    
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
        
        if (platformAngle + angle <= 70) {
            platformAngle += angle;
        }
        throw new IllegalArgumentException("The platform's angle cannot be higher than 70 degrees.");
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
        throw new IllegalArgumentException("The platform's angle cannot be lower than 0 degrees.");
    }

    @Override
    public double speedFactor() {
        return enginePower * 0.05;
    }

}
