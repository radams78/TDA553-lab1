package src;

import java.util.ArrayList;

public class CarRepairShop implements ICanLoadCar {

    private ArrayList<Car> carsInRepairShop;
    private int maximumCapacity;

    public void CarRepairShop(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
    }

    public void loadCar(Car car){
        if(carsInRepairShop.size() < maximumCapacity){
            carsInRepairShop.add(car);
        }
    }

    public void unloadCar(Car car){

    }

}
