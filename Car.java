import java.awt.*;

public abstract class Car {
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

  

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName){
    this.nrDoors = nrDoors; // Number of doors on the car
    this.enginePower= enginePower; // Engine power of the car
    this.currentSpeed = currentSpeed; // The current speed of the car
    this.color = color; // Color of the car
    this.modelName = modelName; // The car model name
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

    public void setCurrentSpeed(double currentSpeed){
        this.currentSpeed = currentSpeed;
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

    public String getmodelName(){
        return modelName;
    }

    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    public abstract void incrementSpeed(double amount);


    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
    public abstract void decrementSpeed(double amount);
    

}
