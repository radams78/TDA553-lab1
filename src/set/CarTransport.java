package set;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class CarTransport extends Truck{

    private List <Car> loadedCars = new ArrayList();

    public CarTransport(){
        super(2, 100, "Car Transport", Color.red, 0, 0);
    }

    public void changePlatform() {
        if (getCurrentSpeed() == 0) {
            if (getPlatformAngle() == 0){
                setPlatformAngle(45); //Raised
            }else{
                setPlatformAngle(0); //Lowered
            }
        } else {
            throw new IllegalArgumentException("Can not change the platform while car transport is moving");
        }
    }

    public void loadCar(Car object){
        if (getPlatformAngle() == 0){
            loadedCars.add(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    }

    public void unloadCar(Car object){
        if (getPlatformAngle() == 0){
            loadedCars.remove(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    } 

    public List<Car> getLoadedCars(){
        return loadedCars;
    }

    double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
