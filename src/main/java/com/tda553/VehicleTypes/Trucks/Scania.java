package com.tda553.VehicleTypes.Trucks;

import java.awt.Color;

import com.tda553.Models.TransportVehicle;

public class Scania extends TransportVehicle
{

    public Scania()
    {
        this.setMaxPlatformAngle(70);
        nrDoors = 2;
        color = Color.black;
        enginePower = 200;
        modelName = "Scania";
        vehicleWeight = 4000;
        stopEngine();
    }


    @Override
    public double speedFactor() {
        return enginePower * 0.05;
    }

}
