import java.awt.*;

import org.junit.Test;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;

public class Car implements Movable{
    
    private int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private String modelName;

    private double x, y; // Coordinates for car

    private Direction direction; // Which direction is the car facing?

    public Car(String modelName, Color color, double enginePower, int nrDoors){
        this.modelName = modelName;
        this.enginePower = enginePower;        
        this.color = color;
        this.nrDoors = nrDoors;
        this.stopEngine();
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

    public void startEngine(){
	    this.setCurrentSpeed(0.1);
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

    public void setCurrentSpeed(double amount) {
        if (amount >= 0 && amount <= this.enginePower) {
            this.currentSpeed = amount;
        } else {
            System.out.println("Warning! Current speed > Engine power!");
        }
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getXPos() {
        return this.x;
    }

    public double getYPos() {
        return this.y;
    }

    public String getModelName() {
        return this.modelName;
    }

    public double speedFactor(){
        return (this.enginePower * 0.01);
    }

    public void incrementSpeed(double amount){
	    this.setCurrentSpeed((Math.min(getCurrentSpeed() + speedFactor() * amount, this.getEnginePower())));
    }

    public void decrementSpeed(double amount){
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }
    
    public void gas(double var1) {
        if (var1 >= 0 && var1 <= 1) {
            this.incrementSpeed(var1);
        } else {
            System.out.println("Error! Gas outside interval!");
        }
    }

    public void brake(double var1) {
        if (var1 >= 0 && var1 <= 1) {
            this.decrementSpeed(var1);
        } else {
            System.out.println("Error! Brake outside interval!");
        }
    }

    @Override
    public void turnLeft() {
        int dirValue = this.direction.getValue();
        this.direction = Direction.values()[(dirValue - 1) % 4];
    }

    @Override
    public void turnRight() {
        int dirValue = this.direction.getValue();
        this.direction = Direction.values()[(dirValue + 1) % 4];
    }

    @Override
    public void move(){
        switch(this.direction) {
            case NORTH:
                this.y += this.currentSpeed;
                break;
            case EAST:
                this.x += this.currentSpeed;
                break;
            case SOUTH:
                this.y -= this.currentSpeed;
                break;
            case WEST:
                this.x -= this.currentSpeed;
                break;
        }
        out.println(" " + this.x + " " + this.y);
    }


}
