package src;



public class CarRepairShop {
    private LoadsCar carLoader;
    private Position position;


    public CarRepairShop(int MaximalLoadedCars, int PositionX, int positionY) {
        this.carLoader = new LoadsCar(MaximalLoadedCars);
        this.position = new Position(PositionX, positionY);
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
