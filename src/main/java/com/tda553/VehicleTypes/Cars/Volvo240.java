package com.tda553.VehicleTypes.Cars;
import java.awt.Color;

import com.tda553.Models.Vehicle;

public class Volvo240 extends Vehicle
{
    private final static double trimFactor = 1.25;

    public Volvo240()
    {
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        vehicleWeight = 1500;
        stopEngine();
    }

    public double speedFactor()
    {
        return enginePower * 0.01 * trimFactor;
    }

}
