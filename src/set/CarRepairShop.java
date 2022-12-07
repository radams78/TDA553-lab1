package set;

public class CarRepairShop extends Workshop{

    private int maxNumCars;
    private CarStorage storage; 

    public CarRepairShop(String name, double x, double y, int maxNumCars){
        super(name, x, y);
        this.maxNumCars = maxNumCars;
        storage = new CarStorage(maxNumCars);
    }

    private boolean isCarCloseEnoughToStore(Car object){
        double xDiff = this.getX() - object.getX();
        double yDiff = this.getY() - object.getY();
        return Math.sqrt(Math.pow(xDiff, 2) + (Math.pow(yDiff, 2))) < 4;
    }

    public void loadCar(Car object){
        if (isCarCloseEnoughToStore(object)){
            storage.loadCar(object);
            object.changeCarInStorage();
            object.setX(getX());
            object.setY(getY());
        }else{
            throw new IllegalArgumentException("Car is not close enough to be loaded");
        }
    }

    public void unloadCar(Car object){
        storage.unloadCar(object);
        object.changeCarInStorage();
    }
}
