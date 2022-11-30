package Lab1;

import java.awt.*;

public abstract class Car extends Vehicle {

    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
    }
}
