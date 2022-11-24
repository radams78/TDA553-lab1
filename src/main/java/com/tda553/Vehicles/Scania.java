package com.tda553.Vehicles;

import com.tda553.TransportVehicle;
import java.awt.Color;

public class Scania extends TransportVehicle
{
    private int platformMaxAngle = 70; // Degrees

    public Scania()
    {
        nrDoors = 2;
        color = Color.black;
        enginePower = 200;
        modelName = "Scania";
        vehicleWeight = 4000;
        stopEngine();
    }
    
    public int getPlatformAngle()
    {
        return platformAngle;
    }

    @Override
    public double speedFactor() {
        return enginePower * 0.05;
    }

}
