import java.awt.*;
import java.util.List;

public class CarTransporter extends MotorisedVehicle{
    private CarPlatform carPlatform;
    private List<MotorisedVehicle> loadedVehicles;
    
    public CarTransporter() {
        super("Temporary", Color.black, 120, 2);
        this.carPlatform = new CarPlatform();
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
