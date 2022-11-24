import java.awt.Color;

public class Scania extends Car {

    private double plattformAngle;

    public Scania(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
        
    }
    
    public void raisePlattform(){
        
    }

    public void lowerPlattform(){

    }

    public double getPlattformAngle() {
        return plattformAngle;
    }

    public void setPlattformAngle(double plattformAngle) {
        this.plattformAngle = plattformAngle;
    }


}
