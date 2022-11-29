package Lab1;

import java.awt.*;

import Lab1.interfaces.ITrailer;

public abstract class Truck extends Car {
    int nrWheels;
    ITrailer trailer;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int nrWheels) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
        this.nrWheels = nrWheels;
    }

    public void setTrailer(ITrailer trailer) {
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
