import java.awt.*;

public class Volvo240 extends MotorisedVehicle {

    private final static double trimFactor = 1.25; // TODO fixa magic number
    
    public Volvo240(){
        super("Volvo240", Color.black, 100, 4);
    }
    
    @Override
    public double speedFactor(){
        return (this.getEnginePower() * 0.01 * Volvo240.trimFactor);
    }
}
