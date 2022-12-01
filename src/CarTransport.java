import java.awt.*;

public class CarTransport extends Truck{
    private TwoStateFlatbed flatbed;

    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color); 
        this.flatbed = new TwoStateFlatbed();     
    }

    @Override
    public void startEngine() {
        if (flatbed.getFlatbedUp() == true) {
            super.startEngine(); 
        }
    }

    @Override
    public void gas(double gas){
        if (flatbed.getFlatbedUp() == true) {
            super.gas(gas); 
        }
    }

    public void raise() {
        if (getCurrentSpeed() == 0) {
            flatbed.raise();
        }
    }

    public void lower() {
        if (getCurrentSpeed() == 0) {
            flatbed.lower();
        }
    }
    
}