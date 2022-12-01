package src;

import java.util.ArrayList;

public class CarRepairShop extends ICanLoadCar {

    private ArrayList<Vehicle> carsInRepairShop;
    private int maximumCapacity;
    private int xCoordinate;
    private int yCoordinate;

    /**
     * Constructor CarRepairShop.
     * maximumCapacity will be set to recived argument.
     */
    public CarRepairShop(int maximumCapacity, int xCoordinate, int yCoordinate){
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
	
    @Override
	public void unloadCar(this.xCoordinate, this.yCoordinate) {
		if (carsInRepairShop.isEmpty() == false) {
            carsInRepairShop.get(carsInRepairShop.size()-1).updateCoordinateForUnloadedVehicle(this.xCoordinate, this.yCoordinate);
            carsInRepairShop.remove(carsInRepairShop.size()-1);
        }
	}

	@Override
	public void loadableVehiclesInCloseVicinity(ArrayList<Vehicle> listOfVehicle) {
		// TODO Auto-generated method stub
		
	}

    public int getY(){
        return this.yCoordinate;
    }

}
