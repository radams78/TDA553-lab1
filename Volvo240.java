import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;
    
    public Volvo240(){
        super("Volvo240", Color.black, 100, 4);
    }
    
    @Override
    public double speedFactor(){
        return (this.getEnginePower() * 0.01 * Volvo240.trimFactor);
    }
}
