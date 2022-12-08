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
        Position vehiclePosition = vehicle.getPosition();
        Position thisPosition = this.getPosition();
        // Close enough to the shop
        // TODO: Violates Law of Demeter, fix?
        if (Math.abs(vehiclePosition.getX() - thisPosition.getX()) > 2 || Math.abs(vehiclePosition.getY() - thisPosition.getY()) > 2)
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
        car.setPosition(this.pos.getX() + 1, this.pos.getY() + 1);
        return car;
    }
}
