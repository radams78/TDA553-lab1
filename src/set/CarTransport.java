package set;

import java.awt.Color;
import java.util.ArrayList;

public class CarTransport extends Truck{

    double platformAngle;
    ArrayList <Car> loadedCars = new ArrayList();

    public CarTransport(){
        super(2, 100, "Car Transport", Color.red, 0);
    }

    public void changePlatform() {
        if (getCurrentSpeed() == 0) {
            if (platformAngle == 0){
                this.platformAngle = 45; //Raised
            }else{
                this.platformAngle = 0; //Lowered
            }
        } else {
            throw new IllegalArgumentException("Can not change the platform while car transport is moving");
        }
    }

    public void loadCar(Car object){
        if (platformAngle == 0){
            loadedCars.add(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    }

    public void unloadCar(Car object){
        if (platformAngle == 0){
            loadedCars.remove(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    } 

    public ArrayList getLoadedCars(){
        return loadedCars;
    }

    double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
