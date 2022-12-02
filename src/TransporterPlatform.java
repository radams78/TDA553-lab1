package src;

import java.util.ArrayList;

public class TransporterPlatform extends CanLoadCar implements IPlatform {
    public boolean rampDown;
    public int platformCapacity;
    public ArrayList<Vehicle> carsOnPlatform = new ArrayList<>();   // Array with all the cars currently on the platform.

    /*  Constructor TransporterPlatform.
        Expects platformCapacity argument. */
    public TransporterPlatform(int platformCapacity){
        super(0, 0);
        this.rampDown = true;
        this.platformCapacity = platformCapacity;
    }

    /*  Method to see if the platform is fully loaded. */
    public boolean isSpaceLeftOnPlatform(){
        if (platformCapacity == carsOnPlatform.size()){
            return false;
        }
        else return true;
    }

    /*  Call this method to raise the platform. */
    public void raisePlatform(){
        this.rampDown = false;
        }

    /*  Call this method to lower the platform */
    public void lowerPlatform(){
        this.rampDown = true;
    }
    
    /*  This method is called by CarTransporter to load a car onto the platform. */
    
    public void loadCar(Vehicle car){
        if (this.rampDown && isSpaceLeftOnPlatform() && (this.loadableVehicleInCloseVicinity(car))){
            carsOnPlatform.add(car);
        }
    }

    /*  This method is called by CarTransporter to unload a car. (first-in-last-out) */
    
    
    public void unloadCar(){
        if (this.rampDown == true && carsOnPlatform.isEmpty() == false){
            carsOnPlatform.get(carsOnPlatform.size()-1).updateCoordinateForUnloadedVehicle(unloadXCoordinate(), unloadYCoordinate());
            carsOnPlatform.remove(carsOnPlatform.size()-1);
        }
    }


}
