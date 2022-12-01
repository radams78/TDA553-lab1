package src;
import java.awt.*;

public class Volvo240 extends Truck{

    private final static double trimFactor = 1.25;
    private Trim trim;
    
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
        this.trim = new Trim(trimFactor);
    }

    @Override
    public double speedFactor(){
        return trim.speedFactor(enginePower);
    }
}
