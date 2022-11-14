import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    
    public Volvo240(Color color,double x, double y, double[] direction){
        super(4, color, 100, "Volvo240", x, y, direction);
    }
    
    @Override
    public double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

   

}
