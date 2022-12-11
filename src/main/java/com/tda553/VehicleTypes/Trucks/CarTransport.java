package com.tda553.VehicleTypes.Trucks;
import java.awt.Color;
import com.tda553.VehicleLoadable;
import com.tda553.Interfaces.ILoadable;
import com.tda553.Models.TransportVehicle;
import com.tda553.Models.Vehicle;

public class CarTransport extends TransportVehicle implements ILoadable
{
    private VehicleLoadable vehicleLoadable;
    
    public CarTransport()
    {
        this.vehicleLoadable = new VehicleLoadable(5);
        this.platformAngle = 0;
        this.platformMaxAngle = 1;
        nrDoors = 2;
        color = Color.black;
        enginePower = 200;
        modelName = "CarTransport";
        vehicleWeight = 4000;
        stopEngine();
    }
        
    @Override
    public double speedFactor() {
        return enginePower * 0.05;
    }

    /**
     * @param vehicle
     *  Loads a vehicle onto the platform. 
     */
    public void loadVehicle(Vehicle vehicle) throws IllegalStateException
    {
        this.lowerPlatform(this.platformMaxAngle);
        vehicleLoadable.loadVehicle(vehicle, this.pos);
    }

    /**
     * @param vehicle
     *  Unloads a vehicle from the platform. The vehicle must be placed close to the transport vehicle.
     */
    public Vehicle unloadVehicle(Vehicle vehicle) throws IllegalStateException
    {
        this.lowerPlatform(this.platformMaxAngle);
        return vehicleLoadable.unloadVehicle(vehicle, this.pos);
    }

}
