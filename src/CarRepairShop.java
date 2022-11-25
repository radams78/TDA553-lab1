package src;

import java.util.ArrayList;

public class CarRepairShop implements ICanLoadCar {

    private ArrayList<Vehicle> carsInRepairShop;
    private int maximumCapacity;

    // Constructor CarRepairShop
    public void CarRepairShop(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
    }

    // Call to load a car in CarRepairShop
    public void loadCar(Vehicle car){
        if(carsInRepairShop.size() < maximumCapacity){
            carsInRepairShop.add(car);
        }
    }
    // Call 
    public void unloadCar(Vehicle car){

    }

}
