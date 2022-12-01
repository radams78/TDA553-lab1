package src;

import java.awt.Color;

public class CarTransporter extends Truck {
    private DiscretePlatform platform;
    private LoadsCar carLoader;
    private final int MaximalLoadedCars = 10;

    public CarTransporter() {
        super(2, 100, Color.gray, "Car Transporter");
        this.platform = new DiscretePlatform();
        this.carLoader = new LoadsCar(MaximalLoadedCars);

    }

    public void raisePlatform(){
        platform.raisePlatform(getCurrentSpeed());
    }

    public void lowerPlatform(){
        platform.lowerPlatform(getCurrentSpeed());
    }

    public boolean canGas(){
        return platform.canGas();
    }

    public boolean isPlatformUp() {
        return platform.isPlatformUp();
    }
    
    public void loadCar(Car car) {
        carLoader.loadCar(car);
    }

    public void unloadCar(Car car) {
        carLoader.unloadCar(car);
    }

    public boolean isCarInLoad(Car car) {
        return carLoader.isCarInLoad(car);
    }

    public boolean carInRange(Car other){
        return carLoader.carInRange(this.position, other);
}
}
