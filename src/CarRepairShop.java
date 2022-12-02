package src;

import java.util.ArrayList;

public class CarRepairShop extends CanLoadCar {

    private ArrayList<Vehicle> carsInRepairShop;
    private int maximumCapacity;

    /**
     * Constructor CarRepairShop.
     * maximumCapacity will be set to recived argument.
     */
    public CarRepairShop(int maximumCapacity, int xCoordinate, int yCoordinate){
        super(xCoordinate, yCoordinate);
        this.maximumCapacity = maximumCapacity;
    }

    /**
     * Call method to load a car into the repairshop
     * Will not add car if maximumCapacity is reached or car is too far away.
    */
    public void loadCar(Vehicle car){
        if((carsInRepairShop.size() < maximumCapacity) && (this.loadableVehicleInCloseVicinity(car))){
            carsInRepairShop.add(car);
        }
    }
    /**
     * Call this method to unload a car from the repairshop.
     * (first-in-last-out)
     */
	
    
    public void unloadCar(){
		if (carsInRepairShop.isEmpty() == false) {
            carsInRepairShop.get(carsInRepairShop.size()-1).updateCoordinateForUnloadedVehicle(unloadXCoordinate(), unloadYCoordinate());
            carsInRepairShop.remove(carsInRepairShop.size()-1);
        }
	}

	
	public void loadableVehicleInCloseVicinity() {
		// TODO Auto-generated method stub
		
	}


}
