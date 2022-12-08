package com.tda553.Models;

import java.util.ArrayList;
import java.util.List;

import com.tda553.Interfaces.ILoadable;
import com.tda553.Models.Entity;
import com.tda553.Models.Vehicle;

public class RepairShop extends Entity implements ILoadable
{
    protected List<Vehicle> loadedVehicles = new ArrayList<>();

    public RepairShop(int x, int y)
    {
        this.setPosition(x, y);
    }

    /**
     * @param vehicle
     *  Loads a vehicle into the repair shop.
     */
    public void loadVehicle(Vehicle vehicle)
    {
        int[] vehiclePosition = vehicle.getPosition();
        int[] thisPosition = this.getPosition();
        // Check distance to shop
        if (Math.abs(vehiclePosition[0] - thisPosition[0]) > 2 || Math.abs(vehiclePosition[1] - thisPosition[1]) > 2)
        {
            throw new IllegalStateException("Vehicle is not close enough to the repair shop!");
        }
        loadedVehicles.add(vehicle);
    }

    /**
     * @param vehicle
     *  Unloads a vehicle from the repair shop. The vehicle is then placed close to the building's position.
     */
    public Vehicle unloadVehicle(Vehicle vehicle)
    {
        Vehicle car = loadedVehicles.get(loadedVehicles.indexOf(vehicle));
        loadedVehicles.remove(vehicle);
        int[] transportPos = this.getPosition();
        car.setPosition(transportPos[0] + 1, transportPos[1] + 1);
        return car;
    }
}
