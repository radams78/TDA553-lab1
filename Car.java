import java.awt.*;

public abstract class Car implements Movable {

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    protected double currentSpeed = 0; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x; // Car x-coordinate
    private double y; // Car y-coordinate

    public Car(int nrDoors, Color color, double enginePower, String modelName, double x, double y){
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        stopEngine();

    }

    Direction[] directions = new Direction[]{
        new Direction(0.0, -1.0),
        new Direction(1.0, 0.0),
        new Direction(0.0, 1.0),
        new Direction(-1.0, 0.0)
    };
    

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
        setX(getX() + getCurrentSpeed() );
        setY(getX() + getCurrentSpeed() );
    }

    public void turnLeft(){
        
    }
    
    public void turnRight(){
        
    }
    
    protected abstract double speedFactor();
    
    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);
    
}