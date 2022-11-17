import java.awt.*;

public abstract class Car implements Movable{
    
    public boolean turboOn;
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public int y;
    public int x;
    public int currentDirection;

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
      
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = currentSpeed;
        this.color = color;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.currentDirection = 3;
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
	    currentSpeed = 1;
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

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setY(double y) {
    }

    public void setX(double x) {
    }

    private void direction(){
        switch(this.currentDirection){
            case 0:
                this.y += this.currentSpeed;
                break;

            case 1:
                this.x += this.currentSpeed;
                break;

            case 2:
                this.y -= this.currentSpeed;
                break;

            case 3:
                this.x -= this.currentSpeed;
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
  
    public void move() {
        startEngine();
        direction();    
        
    }
}
