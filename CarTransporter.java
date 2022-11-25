import java.awt.*;
import java.util.ArrayList;

public class CarTransporter extends MotorisedVehicle{
    
    private CarPlatform carPlatform;
    private ArrayList<MotorisedVehicle> loadedVehicles;
    private int maxCapacity;
    
    public CarTransporter(int maxCapacity) {
        super("Temporary", Color.black, 120, 2);
        this.carPlatform = new CarPlatform();
        this.maxCapacity = maxCapacity;
    }

    public void raisePlatform() {
        this.carPlatform.raisePlatform();
    }

    public void lowerPlatform() {
        if (this.getCurrentSpeed() != 0) this.carPlatform.lowerPlatform();
    }

    @Override
    public void move() {
        if (!this.carPlatform.isPlatformDown()) super.move();
    }
}
