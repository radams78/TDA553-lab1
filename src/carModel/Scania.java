package src.carModel;
import java.awt.*;

public class Scania extends Truck {
    private ContinuousPlatform platform;

    public Scania(int positionX, int positionY) {
        super(2, 100, Color.yellow, "Scania", positionX, positionY);
        this.platform = new ContinuousPlatform();
    }

    public void raisePlatform(){
        platform.raisePlatform(getCurrentSpeed());
    }

    public void lowerPlatform(){
        platform.lowerPlatform(getCurrentSpeed());
    }

    @Override
    public boolean canGas(){
        return platform.canGas();
    }

    public double getPlatformAngle(){
        return platform.getPlatformAngle();
    }
}
