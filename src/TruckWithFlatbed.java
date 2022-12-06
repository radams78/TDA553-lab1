import java.awt.*;

abstract class TruckWithFlatbed extends Truck {
    boolean flatbedFastened;

    public TruckWithFlatbed(int nrDoors, double enginePower, Color color, String modelName) {
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
    public void setFlatbedFastened(boolean inBoolean) {
        flatbedFastened = inBoolean;
    }
}
