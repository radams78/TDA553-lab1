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
        super();
        this.maximumCapacity = maximumCapacity;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * Call method to load a car into the repairshop
     * Will not add car if maximumCapacity is reached.
    */
    public void loadCar(Vehicle car){
        if((carsInRepairShop.size() < maximumCapacity) && (car.getIsLoadableBoolean())){
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

	
	public void loadableVehiclesInCloseVicinity() {
		// TODO Auto-generated method stub
		
	}


}
