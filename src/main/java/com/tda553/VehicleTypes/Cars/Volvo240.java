package com.tda553.VehicleTypes.Cars;
import java.awt.Color;

import com.tda553.Models.Vehicle;

public class Volvo240 extends Vehicle
{
    private final static double trimFactor = 1.25;

    public Volvo240()
    {
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        setVehicleWeight(1500);
        stopEngine();
    }

    public double speedFactor()
    {
        return getEnginePower() * 0.01 * trimFactor;
    }
}
