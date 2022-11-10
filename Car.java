import java.awt.*;

public class Car {
    
    private int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private String modelName;

    public Car(String modelName, Color color, double enginePower, int nrDoors){
        this.modelName = modelName;
        this.enginePower = enginePower;        
        this.color = color;
        this.nrDoors = nrDoors;
        this.stopEngine();
    }

    public void stopEngine(){
        this.currentSpeed = 0;
    }

    public int getNrDoors(){
        return this.nrDoors;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelName() {
        return this.modelName;
    }

}