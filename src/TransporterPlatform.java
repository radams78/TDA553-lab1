package src;

import java.util.ArrayList;

public class TransporterPlatform implements IPlatform, ICanLoadCar {
    
    public boolean rampDown;
    public int platformCapacity;
    public ArrayList<Car> carsOnPlatform;

    public TransporterPlatform(int platformCapacity){
        this.rampDown = true;
        this.platformCapacity = platformCapacity;
    }

    public boolean isSpaceLeftOnPlatform(){
        if (platformCapacity == carsOnPlatform.size()){
            return false;
        }
        else return true;
    }

    public void raise(){
        this.rampDown = false;
        }

    public void lower(){
        this.rampDown = true;
    }
    
    @Override
    public void loadCar(Car car){
        if (this.rampDown == true && isSpaceLeftOnPlatform() == true){
            carsOnPlatform.add(car);
        }
    }
    @Override
    public void unloadCar(Car car){
        if (this.rampDown == true && carsOnPlatform.isEmpty() == false){
            carsOnPlatform.remove(carsOnPlatform.size()-1);
        }
    }

}
