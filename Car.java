import java.awt.*;

public abstract class Car implements Movable{

    public static void main(String[] args) {
        
    }
    
    public boolean turboOn;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public int y;
    public int x;
    public String direction;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y, String direction) {
      
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.direction = direction;
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

    public  double speedFactor(){
       return 0;
    }

    public void incrementSpeed(double amount){
    }

    public void decrementSpeed(double amount){
   
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){

    }

    // TODO fix this method according to lab pm
    public void brake(double amount){

    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
    }

    public void setX(double x) {
    }

    public void turnLeft(){

    }

    public void turnRight(){
        
    }
    
    
}
