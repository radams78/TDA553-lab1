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

    // TODO add logic for loading from ground to carRepairShop and unload from CarTransporter to ground?
    public void load(MotorisedVehicle car) {
        this.tryToLoad(car);
    }

    public void load(CarTransporter transCar, int amountToLoad) {
        for (int i = 0; i < amountToLoad; i++) {
            this.tryToLoad(transCar.unload());
            }
    }

    public void load(CarTransporter transCar) {
        this.tryToLoad(transCar.unload());
    }

    private void tryToLoad(MotorisedVehicle car) {
    if (this.repairshopGarage.size() < this.maxCapacity) {
        this.repairshopGarage.add(car);
        } else {
        throw new IllegalArgumentException("Car Transporter already at full capacity");
        }
    }
}
