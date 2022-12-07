package set;

import java.awt.Color;

public class CarTransport extends Truck{

    private CarStorage storage = new CarStorage(6); 

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

    private boolean isCarCloseEnoughToStore(Car object){
        double xDiff = this.getX() - object.getX();
        double yDiff = this.getY() - object.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + (Math.pow(yDiff, 2))) < 4;
    }

    public void loadCar(Car object){
        if (isCarCloseEnoughToStore(object) && getPlatformAngle() == -45){
            storage.loadCar(object);
            object.setX(getX());
            object.setY(getY());
        }else{
            throw new IllegalArgumentException("Car is not close enough to be loaded");
        }
    }

    public void unloadCar(Car object){
        if (getPlatformAngle() == -45){
            storage.unloadCar(object);
        }else{
            throw new IllegalArgumentException("Platform must be lowered");
        }
    }
     
    @Override
    public void move() {
        setX(getX() + Math.cos(Math.toRadians(getDirection())) * getCurrentSpeed());
        setY(getY() + Math.sin(Math.toRadians(getDirection())) * getCurrentSpeed());
        for (int i = 0; i <= storage.getLoadedCars().size()-1; i++) {
            storage.getLoadedCars().get(i).setX(getX());
            storage.getLoadedCars().get(i).setY(getY());
        }
    }
    
    double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
