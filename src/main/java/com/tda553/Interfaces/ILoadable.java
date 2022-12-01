package com.tda553.Interfaces;

import com.tda553.Models.Vehicle;

public interface ILoadable
{
    public void loadVehicle(Vehicle v);

    public Vehicle unloadVehicle(Vehicle v);
}
