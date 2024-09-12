package src;
import java.awt.*;

public class Volvo240 extends Vehicle{

    public final static double trimFactor = 1.25;
    
    public Volvo240(double xCoordinate, double yCoordinate) {
        super(4, 100, Color.black, "Volvo240", xCoordinate, yCoordinate, true);
    }

    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }
 
}
