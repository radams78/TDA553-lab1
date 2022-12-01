import java.awt.*;

public abstract class Car extends Vehicle {
    private boolean loaded;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color) {
        super(nrDoors, enginePower, currentSpeed, color);
        this.loaded = false;
    }

    private void setLoaded(boolean trueOrFalse) {
        this.loaded = trueOrFalse;
    }
    
    public void setColor(Color color) {
        if (condition) {
            super.setColor(color);;
        }
    }
}