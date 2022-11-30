import java.util.ArrayList;

public class CarRepairShop {
    private double x;
    private double y;

    private int maxCapacity;

    private final double LOAD_RANGE = 5.0;

    private ArrayList<MotorisedVehicle<Engine, Body>> repairshopGarage;

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

    //-------------------Repairshop misc-------------------------


    public void load(MotorisedVehicle car) { // TODO Ask TA/Föreläsare how to implement this distance check
        if (car.getDistance(this.x, this.y) > this.LOAD_RANGE){
            throw new IllegalArgumentException("Too far away from repair shop to transfer.");
        }
        this.tryToLoad(car);
    }

    public void carTransfer(CarTransporter transCar, int amountToLoad) {
        if (amountToLoad > this.maxCapacity - this.repairshopGarage.size()) {
            throw new IllegalArgumentException("Can't unload that many vehicles into garage."); // TODO hantera om de vill lasta av mer än möjligt
        }
        
        if (transCar.getDistance(this.x, this.y) > this.LOAD_RANGE){
            throw new IllegalArgumentException("Too far away from repair shop to transfer.");
        }

        this.isOutsideRange(transCar);

        this.inRange();

        for (int i = 0; i < amountToLoad; i++) {
            this.repairshopGarage.add(transCar.unload());
        }
    }

    public void isOutsideRange(CarTransporter transCar){
        if (transCar.getDistance(this.x, this.y) > this.LOAD_RANGE){
            throw new IllegalArgumentException("Too far away from repair shop to transfer.");
        }
    }

    public void carTransfer(CarTransporter transCar) {
        if (transCar.getDistance(this.x, this.y) > this.LOAD_RANGE) {
            throw new IllegalArgumentException("Too far away from repair shop to transfer.");
        }
        
        if (!this.isFull()) {
            this.repairshopGarage.add(transCar.unload());
        } else {
            throw new IllegalArgumentException("Car Repair Shop already at full capacity");
        }
    }

    public void unload(MotorisedVehicle car) {
        this.repairshopGarage.remove(car);
        this.carToRepairShopPos(car);
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

    private void carToRepairShopPos(MotorisedVehicle car) {
        car.setX(this.x);
        car.setY(this.y);
    }
    
}
