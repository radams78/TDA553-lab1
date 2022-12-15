package Model;

public class CarRepairShop {

    private Loadable<Car> loadedCars;

    public CarRepairShop(int capacity)  {
        loadedCars = new Loadable<Car>(12, 5);
    }

    public void newCar(Car car) {
        if (loadedCars.getAmount() >= loadedCars.getCapacity()) {throw new IllegalCallerException("Unable to load more cars!");}
        loadedCars.loadCar(car);
    }

    public Loadable<Car> getLoadedCars() {
        return loadedCars;
    }
}
