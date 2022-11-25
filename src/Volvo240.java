package src;
import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    private CarWithTrim trim;
    
    public Volvo240(){
        super(4, 100, Color.black, "Volvo240");
        this.trim = new CarWithTrim(trimFactor);
    }

    public double speedFactor(){
        return trim.speedFactor(enginePower);
    }
}
