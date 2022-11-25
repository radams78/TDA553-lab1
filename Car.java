import java.awt.*;

public abstract class Car extends Vehicle{


    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
        
    }
   
    public void move() {
        startEngine();
        direction();    
    }
}
