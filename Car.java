import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name

    public Car(int nrDoors, Color color, double enginePower, String modelName){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        stopEngine();
    }

    protected int getNrDoors(){
        return nrDoors;
    }
    protected double getEnginePower(){
        return enginePower;
    }

    protected double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Color getColor(){
        return color;
    }

    protected void setColor(Color clr){
	    color = clr;
    }

    protected void startEngine(){
	    currentSpeed = 0.1;
    }

    protected void stopEngine(){
	    currentSpeed = 0;
    }
    
    // TODO fix this method according to lab pm

    protected void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm

    protected void brake(double amount){
        decrementSpeed(amount);
    }

    public void move(){
        
    }

    public void turnLeft(){

    }
    
    public void turnRight(){
        
    }
    
    protected abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);
    
}