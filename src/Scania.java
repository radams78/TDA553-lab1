import java.awt.*;

public class Scania extends Truck{
    private DegreeFlatbed flatbed;

    public Scania(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
        this.flatbed = new DegreeFlatbed();
    }

    @Override
    public void startEngine() {
        if (flatbed.getFlatbedAngle() == 0) {
            super.startEngine();
        }
    }

    @Override
    public void gas(double gas){
        if (flatbed.getFlatbedAngle() == 0) {
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
