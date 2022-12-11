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
        this.setPlatformAngle(0);
        this.setMaxPlatformAngle(1);
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
        this.lowerPlatform(this.getMaxPlatformAngle());
        vehicleLoadable.loadVehicle(vehicle, this.pos);
    }

    /**
     * @param vehicle
     *  Unloads a vehicle from the platform. The vehicle must be placed close to the transport vehicle.
     */
    public Vehicle unloadVehicle(Vehicle vehicle) throws IllegalStateException
    {
        this.lowerPlatform(this.getMaxPlatformAngle());
        return vehicleLoadable.unloadVehicle(vehicle, this.pos);
    }


    /*
     * Moves the vehicle and all loaded vehicles.
     */
    @Override
    public void move()
    {   
        // New position
        int new_pos_x = (int)Math.round(pos.getX() + directionTable[direction][0] * currentSpeed);
        int new_pos_y = (int)Math.round(pos.getY() + directionTable[direction][1] * currentSpeed);

        setPosition(new_pos_x, new_pos_y);
        for (Vehicle vehicle : vehicleLoadable.getLoadedVehicles())
        {
            vehicle.setPosition(new_pos_x, new_pos_y);
        }

    }
    

}
