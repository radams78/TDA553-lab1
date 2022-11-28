package Lab1;

import java.awt.*;

public abstract class Truck extends Car {
    int nrWheels;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int nrWheels) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.nrWheels = nrWheels;
    }
}
