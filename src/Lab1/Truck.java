package Lab1;

import java.awt.*;

public abstract class Truck extends Car {
    int nrWheels;
    Trailer trailer;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int nrWheels) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.nrWheels = nrWheels;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
}
