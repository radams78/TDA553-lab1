package src;

import java.util.ArrayList;

public class CarRepairShop implements ICanLoadCar {

    private ArrayList<Vehicle> carsInRepairShop;
    private int maximumCapacity;

    /**
     * Constructor CarRepairShop.
     * maximumCapacity will be set to recived argument.
     */
    public void CarRepairShop(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
    }

    /**
     * Call method to load a car into the repairshop
     * Will not add car if maximumCapacity is reached.
    */
    public void loadCar(Vehicle car){
        if(carsInRepairShop.size() < maximumCapacity){
            carsInRepairShop.add(car);
        }
    }
    /**
     * Call this method to unload a car from the repairshop.
     * (first-in-last-out)
     */
    public void unloadCar(Vehicle car){

    }

}
