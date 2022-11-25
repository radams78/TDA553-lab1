import java.awt.*;


    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
        
    }
   
    public void move() {
        startEngine();
        direction();    
    }
}
