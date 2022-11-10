import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    
    public Volvo240(Color color){
        super(4, color, 100, "Saab240");
    }
    
    @Override
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

   

}
