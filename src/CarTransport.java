import java.awt.*;

public class CarTransport extends Truck{
    private TwoStateFlatbed flatbed;

    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color); 
        this.flatbed = new TwoStateFlatbed();     
    }

    @Override
    public void startEngine() {
        
    }

    @Override
    public void gas(double gas){
        
    }
}