import java.util.ArrayList;

public class CarRepairShop {
    private double x;
    private double y;

    private int maxCapacity;

    private ArrayList<MotorisedVehicle> repairshopGarage;

    public CarRepairShop(double x, double y, int maxCapacity) { 
        this.x = x;
        this.y = y;
        this.maxCapacity = maxCapacity;
    }

    //--------------------Getters---------------------------------
    
    public double getX(){
        return this.x;
    }

        public double getY(){
        return this.y;
    }

        public double getMaxCapacity(){
        return this.maxCapacity;
    }

    //--------------------Setters--------------------------------

    public void setX(double x) {
        this.x = x;
    }

        public void setY(double y) {
        this.y = y;
    }

    // TODO add logic for loading from ground to carRepairShop and unload from CarTransporter to ground?
    public void load(MotorisedVehicle car) {
        this.tryToLoad(car);
    }

    public void carTransfer(CarTransporter transCar, int amountToLoad) {
        if (amountToLoad > this.maxCapacity - this.repairshopGarage.size()) {
            throw new IllegalArgumentException("Can't unload that many vechiles into garage.");
        }

        for (int i = 0; i < amountToLoad; i++) {
            this.repairshopGarage.add(transCar.unload());
        }
    }

    public void carTransfer(CarTransporter transCar) {
        if (!this.isFull()) {
            this.repairshopGarage.add(transCar.unload());
        } else {
            throw new IllegalArgumentException("Car Repair Shop already at full capacity");
        }
    }

    private void tryToLoad(MotorisedVehicle car) {
    if (!this.isFull()) {
        this.repairshopGarage.add(car);
        } else {
        throw new IllegalArgumentException("Car Repair Shop already at full capacity");
        }
    }
    
    private boolean isFull() {
        return this.repairshopGarage.size() >= this.maxCapacity;
    }

    @Override
    public String toString() {
        return "CarRepairShop [repairshopGarage=" + repairshopGarage + "]";
    }

    public void carToRepairShopPos(MotorisedVehicle car) {
        car.setX(this.x);
        car.setY(this.y);
    }
    
}
