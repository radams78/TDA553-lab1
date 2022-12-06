import java.awt.*;

abstract public class Truck extends Vehicle{
    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    @Override
    public void incrementSpeed(double amount) {
        if (this.getCurrentSpeed() < this.getEnginePower()) {
            this.setCurrentSpeed(this.getCurrentSpeed() + this.speedFactor() * amount);
        }     
    }
}