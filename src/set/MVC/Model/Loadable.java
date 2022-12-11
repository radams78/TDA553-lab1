// Module to hold the class Loadable
// - Note that objects of this class is often delegated to certain vehicles and car repair shops

// ---- Packages ---- // 

package set.MVC.Model;


import java.lang.reflect.Array;



// ---- Imports ---- //

import java.util.ArrayList;
import java.util.Collection;

// ----- Class ----- //

  public class Loadable {
    
    private ArrayList<Car> loadedCars;
    private int capacity;

    // --- Constructor --- //

    public Loadable(int capacity){
        this.capacity = capacity;
        loadedCars = new ArrayList<Car>();
    }

    // ---- Methods ---- //

    // Method to load cars
    // - Note that you can only load cars within 15m radius and as long as capacity has not been reached
    public void loadCar(Car car, double x, double y) {
        double xDistance = Math.pow(Math.abs(car.getXPosition() - x), 2);
        double yDistance = Math.pow(Math.abs(car.getYPosition() - y), 2);
        double distanceToLoadable =  Math.sqrt(xDistance + yDistance);
        
        if (getAmountOfCarsLoaded() < capacity && distanceToLoadable < 15){
            car.setCoordinates(x, y);
            loadedCars.add(car);
        }
    }

    // Method to unload cars
    // - Note that cars can only be unloaded if we have loaded some car
    public void unloadCar() {
        if (getAmountOfCarsLoaded() > 0){
            loadedCars.remove(loadedCars.size() - 1);
        }
    }

    // Method to return amount of cars currently loaded
    public int getAmountOfCarsLoaded(){
        if (loadedCars.isEmpty()){
            return 0;
        } else {
            return loadedCars.size();
        }
        
    }

    // Method to get list of cars loaded
    public ArrayList<Car> getListOfCars(){
        return loadedCars;
    }
}

