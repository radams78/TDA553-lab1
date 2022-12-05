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
            if (getPlatformAngle() == -45){
                setPlatformAngle(0);//Raised
            }else{
                setPlatformAngle(-45); //Lowered
            }
        } else {
            throw new IllegalArgumentException("Can not change the platform while car transport is moving");
        }
    }

    public void loadCar(Car object){
        if (getPlatformAngle() == -45 && loadedCars.size() <= 6){
            object.setX(getX());
            object.setY(getY());
            loadedCars.add(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered or the maximum car capacity has been reached");
        }
    }

    public void unloadCar(Car object){
        if (!loadedCars.isEmpty() && getPlatformAngle() == -45){
            loadedCars.remove(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered or there are no cars to unload");
        }
    }
     
    @Override
    public void move() {
        setX(getX() + Math.cos(Math.toRadians(getDirection())) * getCurrentSpeed());
        setY(getY() + Math.sin(Math.toRadians(getDirection())) * getCurrentSpeed());
        for (int i = 0; i <= loadedCars.size(); i++) {
            loadedCars.get(i).setX(getX());
            loadedCars.get(i).setY(getY());
        }
    }

    public List<Car> getLoadedCars(){
        return loadedCars;
    }

    double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
