package com.tda553.VehicleTypes.Trucks;
import java.awt.Color;
import com.tda553.Interfaces.ILoadable;
import com.tda553.Models.TransportVehicle;
import com.tda553.Models.Vehicle;
import com.tda553.Models.Position;

public class CarTransport extends TransportVehicle implements ILoadable
{
    public CarTransport()
    {
        this.platformAngle = 0;
        this.platformMaxAngle = 1;
        nrDoors = 2;
        color = Color.black;
        enginePower = 200;
        modelName = "CarTransport";
        vehicleWeight = 4000;
        stopEngine();
    }
        
    /**
     * @param vehicle
     *  Loads a vehicle onto the platform.
     */
    public void loadVehicle(Vehicle vehicle)
    {
        if (!this.isPlatformActive())
        {   
            throw new IllegalStateException("Cannot load vehicle while moving");
        }
        if (this.getPlatformAngle() != 0)
        {
            throw new IllegalStateException("Platform must be down to load vehicles!");
        }
        Position vehiclePosition = vehicle.getPosition();
        Position thisPosition = this.getPosition();
        // Close enough to the platform
        // TODO: Violates Law of Demeter, fix?
        if (Math.abs(vehiclePosition.getX() - thisPosition.getX()) > 2 || Math.abs(vehiclePosition.getY() - thisPosition.getY()) > 2)
        {
            throw new IllegalStateException("Vehicle is not close enough to the platform");
        }
        loadedVehicles.add(vehicle);
    }

    /**
     * @param vehicle
     *  Unloads a vehicle from the platform. The vehicle must be placed close to the transport vehicle.
     */
    public Vehicle unloadVehicle(Vehicle vehicle)
    {
        if (this.getPlatformAngle() != 0)
        {
            throw new IllegalStateException("Platform must be down to load vehicles!");
        }
        Vehicle car = loadedVehicles.get(loadedVehicles.indexOf(vehicle));
        loadedVehicles.remove(vehicle);
        car.setPosition(this.pos.getX() + 1, this.pos.getY() + 1);
        return car;
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
