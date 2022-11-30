import java.awt.*;

public class Scania extends Truck{
    private Flatbed flatbed;

    public Scania(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        this.flatbed = new DegreeFlatbed();
    }

    @Override
    public void startEngine() {
        
    }

    @Override
    public void gas(double gas){
        
    }
}
