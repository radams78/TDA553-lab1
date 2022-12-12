package Model;

public class CarRepairShop {

    private Loadable loadedCars;

    public CarRepairShop(int capacity)  {
        loadedCars = new Loadable(12, 5);
    }

    public void newCar(Car car) {
        if (loadedCars.getAmount() >= loadedCars.getCapacity()) {throw new IllegalCallerException("Unable to load more cars!");}
        loadedCars.addCar(car);
    }
}
