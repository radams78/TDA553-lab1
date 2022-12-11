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
        setPlatformAngle(0);
        setPlatformMaxAngle(1);
        setNrDoors(2);
        setColor(Color.black);
        setEnginePower(200);
        setModelName("CarTransport");
        setVehicleWeight(4000);
        stopEngine();
    }
        
    /**
     * @param vehicle
     *  Loads a vehicle onto the platform.
     */
    public void loadVehicle(Vehicle vehicle)
    {
        if (!this.getPlatformActive())
        {   
            throw new IllegalStateException("Cannot load vehicle while moving");
        }
        if (this.getPlatformAngle() != 0)
        {
            throw new IllegalStateException("Platform must be down to load vehicles!");
        }
        int[] vehiclePosition = vehicle.getPosition();
        int[] thisPosition = this.getPosition();
        // Close enough to the platform
        if (Math.abs(vehiclePosition[0] - thisPosition[0]) > 2 || Math.abs(vehiclePosition[1] - thisPosition[1]) > 2)
        {
            throw new IllegalStateException("Vehicle is not close enough to the platform");
        }
        addLoadedVehicle(vehicle);
    }

    /**
     * @param vehicle
     *  Unloads a vehicle from the platform. The vehicle must be placed close to the transport vehicle.
     */
    public Vehicle unloadVehicle(Vehicle vehicle)
    {
        if (getPlatformAngle() != 0)
        {
            throw new IllegalStateException("Platform must be down to load vehicles!");
        }
        Vehicle car = getLoadedVehicles().get(getLoadedVehicles().indexOf(vehicle));
        getLoadedVehicles().remove(vehicle);
        car.setPosition(pos.getX() + 1, pos.getY() + 1);
        return car;
    }

    @Override
    public double speedFactor() {
        return getEnginePower() * 0.05;
    }

}
