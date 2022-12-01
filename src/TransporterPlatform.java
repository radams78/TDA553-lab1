package src;

import java.util.ArrayList;

public class TransporterPlatform extends ICanLoadCar implements IPlatform {
    
    public boolean rampDown;
    public int platformCapacity;
    public ArrayList<Vehicle> carsOnPlatform;   // Array with all the cars currently on the platform.

    /*  Constructor TransporterPlatform.
        Expects platformCapacity argument. */
    public TransporterPlatform(int platformCapacity){
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
    public void raise(){
        this.rampDown = false;
        }

    /*  Call this method to lower the platform */
    public void lower(){
        this.rampDown = true;
    }
    
    /*  This method is called by CarTransporter to load a car onto the platform. */
    @Override
    public void loadCar(Vehicle car){
        if (this.rampDown == true && isSpaceLeftOnPlatform() == true){
            carsOnPlatform.add(car);
        }
    }

    /*  This method is called by CarTransporter to unload a car. (first-in-last-out) */
    @Override
    public void unloadCar(int newXCoordinate, int newYCoordinate){
        if (this.rampDown == true && carsOnPlatform.isEmpty() == false){
            carsOnPlatform.get(carsOnPlatform.size()-1).updateCoordinateForUnloadedVehicle(newXCoordinate, newYCoordinate);
            carsOnPlatform.remove(carsOnPlatform.size()-1);
        }
    }

	@Override
	public void loadableVehiclesInCloseVicinity(ArrayList<Vehicle> listOfVehicle) {
		// TODO Auto-generated method stub
        
        // for(l : listOfVehicle){
        //    if(l.intersects(this.loadableAre)){
        //      loadCar()
        //  }
        // }
		
	}




}
