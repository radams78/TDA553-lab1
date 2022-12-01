package src;
import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    private Trim trim;
    
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
        this.trim = new Trim(trimFactor);
    }

    public double speedFactor(){
        return trim.speedFactor(enginePower);
    }

    public boolean canGas(){
        return true;
    }
}
