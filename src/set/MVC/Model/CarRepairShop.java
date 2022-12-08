// --- Packages --- //

package set.MVC.Model;

import set.MVC.Model.Loadable;


// ----- Class ----- //

 public class CarRepairShop {
    
    private double x;
    private double y;
    private Loadable loadingSpace;


    // --- Constructor --- //

    public CarRepairShop(double x, double y, int capacity){
        this.x = x;
        this.y = y;
        loadingSpace = new Loadable(capacity);
    }

    // ---- Methods ---- //

    // Method to load cars 
    public void loadCar(Car car){
        loadingSpace.loadCar(car, x, y);
    }

    // Method to unload cars
    public void unloadCar(){
        loadingSpace.unloadCar();
    }

}
