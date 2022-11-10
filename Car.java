import java.awt.*;
public abstract class Car {
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    public Car(int doors,double power,double speed, Color caColor, String name){
        this.nrDoors=doors;
        this.enginePower=power; 
        this.currentSpeed=speed; 
        this.color=caColor; 
        this.modelName=name; 
    }

    int getNrDoors(){
        return this.nrDoors;
    }

    double getEnginePower(){
        return this.enginePower;
    }

    double getCurrentSpeed(){
        return this.currentSpeed;
    }

    Color getColor(){
        return this.color;
    }

    void setColor(Color clr){
	    this.color = clr;
    }

    void startEngine(){
	    this.currentSpeed = 0.1;
    }

    void stopEngine(){
	    this.currentSpeed = 0;
    }
       
    // abstract int getNrDoors();
    
    // abstract double getEnginePower();

    // abstract double getCurrentSpeed();

    // abstract Color getColor();

    // abstract void setColor(Color clr);

    // abstract void startEngine();

    // abstract void stopEngine();
    
    abstract double speedFactor();

    abstract void incrementSpeed(double amount);

    abstract void decrementSpeed(double amount);

    // TODO fix this method according to lab pm
    abstract void gas(double amount);

    // TODO fix this method according to lab pm
    abstract void brake(double amount);
    
}
