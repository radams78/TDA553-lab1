package com.tda553.Vehicles;

import com.tda553.TransportVehicle;
import java.awt.Color;

public class CarTransport extends TransportVehicle
{
    private int platformAngle = 0; // Degrees
    private int platformMaxAngle = 1; // 2 states: 0 = down, 1 = up

    public CarTransport()
    {
        nrDoors = 2;
        color = Color.black;
        enginePower = 200;
        modelName = "CarTransport";
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
