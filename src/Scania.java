import java.awt.*;

public class Scania extends Truck{
    public Scania(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        stopEngine();
    }

}
