package JUnitTesting;

import java.awt.*;

public class Car implements Movable { 
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private int direction; // direction of car, 0: up, 1: right, 2: down, 3: left
    private double xCord;
    private double yCord;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        this.nrDoors      = nrDoors;
        this.enginePower  = enginePower;
        this.currentSpeed = currentSpeed;
        this.color        = color;
        this.modelName    = modelName;
        this.direction = 0;
        this.xCord = 10.0;
        this.yCord = 10.0;
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

    public void setCurrentSpeed(double val) {
        if(0 <= val && val <= enginePower) {
            currentSpeed = val;
        }
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public void move() {
        switch(direction) {
            case 0:
                yCord -= currentSpeed;
                break;
            case 1:
                xCord += currentSpeed;
            break;
            case 2:
                yCord += currentSpeed;
            break;
            case 3:
                xCord -= currentSpeed;
            break;
            default:
            break;
        }
    }

    public void turnLeft() {
        direction = (direction == 0 ? 3 : direction - 1);
    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    public int getDirection() {
        return direction;
    }

    public double getXCord() {
        return xCord;
    }

    public double getYCord() {
        return yCord;
    }
}