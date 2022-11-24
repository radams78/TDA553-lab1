package labb1;
import java.awt.*;

public abstract class Car extends Vehicle {
    public Car(int nrDoors, Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY){
        super(nrDoors, color, enginePower, modelName,   x,  y, dirX,  dirY);
    }

    @Override 
    
    public abstract double speedFactor() ;

    @Override
    public String toString(){
        String rgbPrint = this.getColor().toString().substring(14);
        String printVehicle = "" + this.getModelName()+ ": " + "Doors: " + this.getNrDoors() + ", Color: " + rgbPrint + ", Engine power: " + this.getEnginePower() + ", Position: (" + (int) this.getX() + "," + (int) this.getY() + ")";
        return printVehicle;
    } //Car object as a visible car object
}

