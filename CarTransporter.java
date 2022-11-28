import java.awt.*;
import java.util.Stack;

public class CarTransporter extends MotorisedVehicle{

    private CarPlatform carPlatform;
    private Stack<MotorisedVehicle> loadedVehicles;
    private int maxCapacity;

    public CarTransporter(int maxCapacity) {
        super("Temporary", Color.black, 120, 2);
        this.carPlatform = new CarPlatform();
        this.maxCapacity = maxCapacity;
    }

    public void load(MotorisedVehicle car) {
        if (car != this) {
            this.tryToLoad(car);
        } else {
            throw new IllegalArgumentException("Cannot load yourself onto yourself");
        }
    }

    public MotorisedVehicle unload() {
            return this.loadedVehicles.pop(); // Will throw exception if loadedVehicles is empty
    }

    public void raisePlatform() {
        this.carPlatform.raisePlatform();
    }

    public void lowerPlatform() {
        if (this.getCurrentSpeed() != 0) this.carPlatform.lowerPlatform();
    }

    @Override
    public void move() {
        if (!this.carPlatform.isPlatformDown()) {
            super.move();
            for (int i = 0; i < loadedVehicles.size() - 1; i++) { // Update positions of loaded vehicles
                loadedVehicles.get(i).setXPos(this.getX());
                loadedVehicles.get(i).setYPos(this.getY());
            }
        }
    }
// for(MotorisedVehicle m : loadedVehicles) { // TODO Switch stack for ArrayList?
//     m.setXPos = this.getXPos;
//     m.setYPos = this.getYPos;

// }

    private void tryToLoad(MotorisedVehicle car) {
        if (this.loadedVehicles.size() < this.maxCapacity) {
            this.loadedVehicles.push(car);
        } else {
            throw new IllegalArgumentException("Car Transporter already at full capacity");
        }
    }
}