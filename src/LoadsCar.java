package src;

import java.util.ArrayList;

public class LoadsCar {
    /*List with loaded cars 
    load method
    unload method

    method for checking distance to car to load
    */
    private ArrayList<Car> loadedCarsList;
    private double maxLoadDistance;
    private int maximalLoadedCars;  

    public LoadsCar(int maximalLoadedCars, double maxLoadDistance) {
        this.maximalLoadedCars = maximalLoadedCars;
        this.maxLoadDistance = maxLoadDistance;
        this.loadedCarsList = new ArrayList<Car>();
    }
    
    public void loadCar(Car car) {
        loadedCarsList.add(car);
        car.setIsLoaded(true);
    }

    public void unloadCar(Car car) {
        loadedCarsList.remove(car);
        car.setIsLoaded(false);
    }

    public boolean isCarInLoad(Car car) {
        return loadedCarsList.contains(car);
    }

    public boolean carInRange(Position self, Car other){
        return maxLoadDistance > Math.sqrt(Math.pow(self.getxPosition() - other.position.getxPosition(), 2) + Math.pow(self.getyPosition() - other.position.getyPosition(), 2));
    }

}
