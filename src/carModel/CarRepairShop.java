package src.carModel;

public class CarRepairShop {
    private LoadsCar carLoader;
    private Position position;
    private final double maxLoadDistance = 50;

    public CarRepairShop(int maximalLoadedCars, int PositionX, int positionY) {
        this.carLoader = new LoadsCar(maximalLoadedCars, maxLoadDistance);
        this.position = new Position(PositionX, positionY);
    }

    public void loadCar(Car car) {
        carLoader.loadCar(position, car);
    }

    public void unloadCar(Car car) {
        carLoader.unloadCar(car);
    }

    public boolean isCarInLoad(Car car) {
        return carLoader.isCarInLoad(car);
    }

    public boolean carInRange(Car other) {
        return carLoader.carInRange(this.position, other);
    }
}
