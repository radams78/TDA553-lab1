import java.awt.*;

public abstract class Vehicle implements Movable{
    
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double y;
    private double x;
    private int currentDirection;

    public Vehicle(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
      
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.currentDirection = 3;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getNrDoors(){
        return nrDoors;
    }


    public String getModelName() {
        return modelName;
    }

    public int getCurrentDirection() {
        return currentDirection;
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

    abstract double speedFactor();

    public void incrementSpeed(double amount){
        this.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * Math.max(amount, 0), this.getEnginePower()));
    }

   
    public void decrementSpeed(double amount){
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * Math.max(amount, 0), 0));;
   
    }
    public void gas(double amount) throws Exception{

        if (amount > 1 || amount < 0){
            throw new IllegalArgumentException("Only accepts values of 1 and 0");
        }
           
        else {
            incrementSpeed(amount);
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) throws Exception{
        if (amount > 1 || amount < 0){
            throw new IllegalArgumentException("Only accepts values of 1 and 0");
        }   
        else {
            decrementSpeed(amount);
        }
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void direction(){
        switch(this.currentDirection){
            case 0:
                this.setY(this.y + currentSpeed);
                break;

            case 1:
                this.setX(this.x + currentSpeed);
                break;

            case 2:
                this.setY(this.y-currentSpeed);
                break;

            case 3:
                this.setX(this.y -currentSpeed);
                break;
        }
    }

    public void turnLeft(){
        this.currentDirection -= 1;

        if(this.currentDirection < 0){
            this.currentDirection = 3;
        }
        
    }

    public void turnRight(){
        this.currentDirection += 1;

        if(this.currentDirection > 3){
            this.currentDirection = 0;
        }
    }

}

