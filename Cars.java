import java.awt.*;

public abstract class Cars implements Movable {
   
    protected int nrDoors;
    protected Color color;  
    protected double enginePower; 
    protected String modelName; 
    protected double currentSpeed;
    protected double xCoord_1;
    protected double xCoord_2;
    protected double yCoord_1;
    protected double yCoord_2;
    protected double center;

    protected Cars(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xCoord_1, double xCoord_2, double yCoord_1, double yCoord_2, double center){
    this.nrDoors = nrDoors;
    this.color = color;
    this.enginePower = enginePower;
    this.modelName = modelName;
    this.currentSpeed = currentSpeed;
    this.xCoord_1 = xCoord_1;
    this.xCoord_2 = xCoord_2;
    this.yCoord_1 = yCoord_1;
    this.yCoord_2 = yCoord_2;
    this.center = center;

}

    public void turnRight(){
    }

    public void turnLeft(){
    }

    public void move(){
    }

    protected double getxCoord_1() {
        return xCoord_1;
    }
    protected double getxCoord_2() {
        return xCoord_2;
    }
    protected double getyCoord_1() {
        return yCoord_1;
    }
    protected double getyCoord_2() {
        return yCoord_2;
    }
    protected double getCenter() {
        return center;
    }

    //protected double getCenter() {
        return center;
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

