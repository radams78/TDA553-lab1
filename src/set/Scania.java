package set;

import java.awt.*;

public class Scania extends Truck{
    
    private double platformAngle;

    public Scania(){
        super(2, 100, "Scania", Color.black, 0);
        stopEngine();
    }
    public void changePlatform(double amount) {
        if (amount >= 0 && amount <= 70 && getCurrentSpeed() == 0) {
            this.platformAngle = amount;
        } else {
            throw new IllegalArgumentException("Can not change the platform any further");
        }
    }

    double speedFactor(){
        return getEnginePower() * 0.01;
    }


}
