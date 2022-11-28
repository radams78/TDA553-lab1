package labb1;
import java.awt.*;

// Superclass for all cars
// a car has to fulfill the contract of both a vehicle and movable
// car adds a special print method for cars and adds to the polymorphism
public abstract class Car extends Vehicle {
    public Car(int nrDoors, Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY){
        super(nrDoors, color, enginePower, modelName,   x,  y, dirX,  dirY);
    }// Constructor


    @Override 
    //To be implemented by subclasses
    public abstract double speedFactor() ;

    @Override
    //THe print method specific to cars
    public String toString(){
        String rgbPrint = this.getColor().toString().substring(14);
        String printVehicle = "" + this.getModelName()+ ": " + "Doors: " + this.getNrDoors() + ", Color: " + rgbPrint + ", Engine power: " + this.getEnginePower() + ", Position: (" + (int) this.getX() + "," + (int) this.getY() + ")";
        return printVehicle;
    } // toString()
} // Class

