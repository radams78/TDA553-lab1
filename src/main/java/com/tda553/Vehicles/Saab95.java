package com.tda553.Vehicles;

import java.awt.Color;
import com.tda553.Vehicle;

public class Saab95 extends Vehicle
{

    public boolean turboOn;

    public Saab95()
    {
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
        turboOn = false;
        modelName = "Saab95";
        vehicleWeight = 1500;
        stopEngine();
    }

    public void setTurboOn()
    {
        turboOn = true;
    }

    public void setTurboOff()
    {
        turboOn = false;
    }

    public double speedFactor()
    {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

}
