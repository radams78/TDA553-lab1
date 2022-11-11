import java.awt.*;
public abstract class Cars {
   
    protected int nrDoors;
    protected Color color;  
    protected double enginePower; 
    protected String modelName; 
    protected double currentSpeed;

    protected Cars(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed){
    this.nrDoors = nrDoors;
    this.color = color;
    this.enginePower = enginePower;
    this.modelName = modelName;
    this.currentSpeed = currentSpeed;
    
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

protected abstract double speedFactor(double amount);

protected abstract void incrementSpeed(double amount);

protected abstract void decrementSpeed(double amount);

    
}

