package set;

import java.awt.*;

public class Scania extends Truck{
    
    private double speedFactor = 1.25; 
    private double platformAngleMax;


    public Scania(){
        super(2, 100, "Scania", Color.black, 0, 70);
        stopEngine();

    }

    double calculateSpeed(double amount) {
        return speedFactor * amount;
    }
}
