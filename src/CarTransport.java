import java.awt.*;

public class CarTransport extends Truck{
    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        stopEngine();      

        
    }
}