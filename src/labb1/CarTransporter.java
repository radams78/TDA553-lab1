package labb1;

import java.awt.*;

//Class for car transporters
public class CarTransporter extends Truck {
    static Flatbed flatbed = new Flatbed(maxLoad, MAX_NUMBER_OF_CARS);

    public CarTransporter(Color color, double x, double y, double dirX, double dirY, int maxNrOfCars) {

        super(color, 500, "Ford", x, y, dirX, dirY, new Flatbed(100, maxNrOfCars), 100, maxNrOfCars);
    }// Constructor

    @Override
    // Specific speed factor for the car transporter
    public double speedFactor() {
        return enginePower * 0.01;
    }
}// Class