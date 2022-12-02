package vehicle;
import java.awt.*;

public class Truck extends Vehicle{
    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color) {
        super(nrDoors, enginePower, currentSpeed, color);

        // this.modelName = modelName;
    }

    public double speedFactor(){
        return getEnginePower() * 0.01;
    }

}
