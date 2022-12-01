import java.awt.*;

public abstract class Car extends Vehicle {
    public Car(int nrDoors, double enginePower, double currentSpeed, Color color) {
        super(nrDoors, enginePower, currentSpeed, color);
    }
    
    public void setColor(Color color) {
        if (condition) {
            super.setColor(color);;
        }
    }
}