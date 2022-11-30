package Lab1;

import java.awt.Color;

import Lab1.vehicles.Truck;
import Lab1.truckextensions.Transportbed;

public class CarTransporter extends Truck {

    /**
     * @param nrDoors
     * @param enginePower
     * @param currentSpeed
     * @param color
     * @param modelName
     * @param nrWheels
     */
    public CarTransporter(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName,
            int nrWheels) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, nrWheels);
        this.trailer = new Transportbed();
    }

    public double speedFactor() {
        if (!trailer.allowDriving()) {
            return 0;
        } else {
            return getEnginePower() * 0.01;
        }
    }

}
