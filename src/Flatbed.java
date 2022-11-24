import java.awt.*;

abstract class Flatbed extends Car {
    boolean flatbedFastened;

    public Flatbed(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
        flatbedFastened = true;
    }

    @Override
    public void incrementSpeed(double amount) {
        if (flatbedFastened == true) {
            if (this.getCurrentSpeed() < this.getEnginePower()) {
                this.setCurrentSpeed(this.getCurrentSpeed() + this.speedFactor() * amount);
            }
        }
    }

    public void setFlatbedFastened(boolean status) {
            flatbedFastened = status;
    }

    public void lowerFlatbed() {
        if (this.getCurrentSpeed() == 0) {
            flatbedFastened = false;
        }

    }

    public void raiseFlatbed() {
        if (this.getCurrentSpeed() == 0) {
            flatbedFastened = true;
        }

    }
}
