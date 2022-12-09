package src.carModel;
import java.awt.*;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;
    private Trim trim;
    
    public Volvo240(int positionX, int positionY){
        super(4, 100, Color.black, "Volvo240", positionX, positionY);
        this.trim = new Trim(trimFactor);
    }

    @Override
    public double speedFactor(){
        return trim.speedFactor(this.getEnginePower());
    }
}
