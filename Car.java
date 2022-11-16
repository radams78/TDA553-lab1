import java.awt.*;
import java.math.*;

public abstract class Car extends HasPosition implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double turnRightNegative = -1; //To turn right
    private double turnLeftPositive = 1; //To turn left



    public String getModelName(){
        return modelName;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public Color getColor(){
        return color;
    }
    //interface methods

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    @Override
    public void turnLeft() {
        setCurrentDirectionRadian(turnLeftPositive);
    }
    @Override
    public void turnRight() {  
        setCurrentDirectionRadian(turnRightNegative);
    }
    @Override
    public void move() {

    }

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int xCoordinate, int yCoordinate) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}