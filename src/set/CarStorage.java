package set;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {

    private List<Car> loadedCars = new ArrayList();
    private int maxNumCars;

    public CarStorage(int maxNumCars) {
        this.maxNumCars = maxNumCars;
    }

    public void loadCar(Car object) {
        if (loadedCars.size() < maxNumCars && !object.isCarInStorage()) {
            loadedCars.add(object);
            object.changeCarInStorage();
            object.stopEngine();
        } else {
            throw new IllegalArgumentException("Platform must be lowered or the maximum car capacity has been reached");
        }
    }
    
    public void unloadCar(Car object){
        if (!loadedCars.isEmpty() && object.isCarInStorage()){
            loadedCars.remove(object);
            object.changeCarInStorage();
        }else{
            throw new IllegalArgumentException("That car is not loaded");
        }
    }

    public List<Car> getLoadedCars(){
        return loadedCars;
    }
}
