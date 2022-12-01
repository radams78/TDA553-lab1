package src;
import java.awt.*;

public class Scania extends Truck {
    private ContinuousPlatform platform;

    public Scania() {
        super(2, 100, Color.yellow, "Scania dump truck");
        this.platform = new ContinuousPlatform();
    }

    public void raisePlatform(){
        platform.raisePlatform(getCurrentSpeed());
    }

    public void lowerPlatform(){
        platform.lowerPlatform(getCurrentSpeed());
    }

    public boolean canGas(){
        return platform.canGas();
    }

    public double getPlatformAngle(){
        return platform.getPlatformAngle();
    }
}
