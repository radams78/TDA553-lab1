package Lab1.vehicles;

import java.awt.*;

import Lab1.truckextensions.Trailer;

public abstract class Truck extends Vehicle {
    int nrWheels;
    Trailer trailer;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int nrWheels) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.nrWheels = nrWheels;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public void removeTrailer() {
        this.trailer = null;
    }

    @Override
    public void startEngine() {
        if (trailer == null) {
            super.startEngine();
        } else {
            if (trailer.allowDriving()) {
                super.startEngine();
            } else {
                throw new IllegalStateException("Trailer is not allowed to drive");
            }
        }
    }

    @Override
    public void setCurrentSpeed(double currentSpeed) {
        if (trailer == null) {
            super.setCurrentSpeed(currentSpeed);
        } else {
            if (trailer.allowDriving()) {
                super.setCurrentSpeed(currentSpeed);
            } else {
                throw new IllegalStateException("Trailer is not allowed to drive");
            }
        }
    }
}
