package com.tda553.VehicleTypes.Trucks;
import java.awt.Color;
import com.tda553.VehicleLoadable;
import com.tda553.Models.ILoadable;
import com.tda553.Models.TransportVehicle;
import com.tda553.Models.Vehicle;

public class CarTransport extends TransportVehicle implements ILoadable
{
    private VehicleLoadable vehicleLoadable;
    
    public CarTransport()
    {
        this.vehicleLoadable = new VehicleLoadable(5);
        setPlatformAngle(0);
        setPlatformMaxAngle(1);
        setNrDoors(2);
        setColor(Color.black);
        setEnginePower(200);
        setModelName("CarTransport");
        setVehicleWeight(4000);
        stopEngine();
    }
        
    @Override
    public double speedFactor() {
        return getEnginePower() * 0.05;
    }

    /**
     * @param vehicle
     *  Loads a vehicle onto the platform. 
     */
    public void loadVehicle(Vehicle vehicle) throws IllegalStateException
    {
        this.lowerPlatform(getPlatformMaxAngle());
        vehicleLoadable.loadVehicle(vehicle, getPosition());
    }

    /**
     * @param vehicle
     *  Unloads a vehicle from the platform. The vehicle must be placed close to the transport vehicle.
     */
    public Vehicle unloadVehicle(Vehicle vehicle) throws IllegalStateException
    {
        this.lowerPlatform(getPlatformMaxAngle());
        return vehicleLoadable.unloadVehicle(vehicle, getPosition());
    }

}
