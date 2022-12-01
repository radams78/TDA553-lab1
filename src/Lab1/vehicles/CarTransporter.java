package Lab1.vehicles;

import java.awt.Color;

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
    }

    public double speedFactor() {
        if (!trailer.allowDriving()) {
            return 0;
        } else {
            return getEnginePower() * 0.01;
        }
    }

    public void addTransportBed(int capacity, double radius) {
        trailer = new Transportbed(capacity, radius);
    }

}
