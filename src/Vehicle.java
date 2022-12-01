package src;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public abstract class Vehicle extends HasPosition implements Movable {

    private Boolean isLoadable; // True if the vehicle can be loaded
	private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed = 0; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double turnRightNegative = -1; // To turn right
    private double turnLeftPositive = 1; // To turn left
    private Rectangle pickupRectangle; // "hitbox" to decide wether vehicles are in the vicinity to be picked up
    private ArrayList<Rectangle> listOfVehicleRectangles;

    public Vehicle(int nrDoors, double enginePower, Color color, String modelName, int xCoordinate, int yCoordinate, boolean isLoadable) {
        super(xCoordinate, yCoordinate);
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.isLoadable = isLoadable;
        this.pickupRectangle.x = xCoordinate;
        this.pickupRectangle.y = yCoordinate;
        this.pickupRectangle.height = 20;
        this.pickupRectangle.width = 10;
        listOfVehicleRectangles.add(this.pickupRectangle);
    }

    @Override
    public void turnLeft() {
        setCurrentDirectionRadian(turnLeftPositive);
    }

    @Override
    public void turnRight() {
        setCurrentDirectionRadian(turnRightNegative);
    }


    // Move-method updates to coordinates for the vehicle and its "hitbox"
    @Override
    public void move() {
        updateCoordinate();
        this.pickupRectangle.x = (int)getX();
        this.pickupRectangle.y = (int)getY();

    }

    public abstract void incrementSpeed(double amount);

    public abstract void decrementSpeed(double amount);

    public abstract double speedFactor();

    public void setCurrentSpeed(double newSpeed){
        this.currentSpeed = newSpeed;
    }

    public Boolean getIsLoadableBoolean() {
        return isLoadable;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }
    
    public void gas(double amount) {
        if(0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        }
    }
    public void brake(double amount) {
        if(0 <= amount && amount <= 1){
            decrementSpeed(amount);
        }
    }

    public boolean isVehicleCurrentSpeedZero(){
        if(this.currentSpeed == 0.0){
            return true;
        }
        else return false;
    }

    // framtidens bekymmer nedan
    public void setColor(Color clr) {
        color = clr;
    }

    public Color getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public int getNrDoors() {
        return nrDoors;
    }
}