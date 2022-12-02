package labb1;
import java.awt.*;

// To-Do
// Add turning radius, a variable that change how fast the car turns


//Vehicle  superclass for all vehicles
public abstract class Vehicle implements Movable {
    private int nrDoors; //Amount of doors
    private Color color; //Color of the vehicle
    protected double enginePower; //Vehicles engine power used to calculate speed
    private String modelName; //THe name of the vehicle
    private double currentSpeedX; //Current speed for moving
    private double currentSpeedY;// --||--
    private double x; // x coordinate
    private double y; // y coordinate
    private double[] direction; // x and y list for the direction that  the car is supposed to move in

    
    public Vehicle(int nrDoors, Color color, double enginePower, String modelName, double  x, double y, double dirX, double dirY) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.direction = new double[] {dirX, dirY} ;
        stopEngine();
    }//Constructor
    

    //getters
    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }


    //Gets the speed
    public double getCurrentSpeedX(){
        return currentSpeedX;
    }
    public double getCurrentSpeedY(){
        return currentSpeedY;
    }


    @Override
    public double getX(){
        return x;
    }
    @Override
    public double getY(){
        return y;
    }

    public Color getColor(){
        return color;
    }

    public String getModelName(){
        return modelName;
    }

    public void setColor(Color clr){
        color = clr;
    }

    private void setCurrentSpeedX(double speed){
        this.currentSpeedX = speed;
    } //Used to set speed in sanity tests

    private void setCurrentSpeedY(double speed){
        this.currentSpeedY = speed;
    }//Used to set speed in sanity tests

    //Increases the speed by a little
    public void startEngine(){
        incrementSpeed(0.1);
    }

    //sets speed in both directions to stop the car
    public void stopEngine(){
        currentSpeedX = 0;
        currentSpeedY = 0;
    }


    //moves the cas by adding the speed to the car position
    @Override
    public void move(){
        x+= currentSpeedX;
        y+= currentSpeedY;
    }

    // decrement the direction to change its turning
    @Override
    public void turnLeft(){
        System.out.println("turning: " + this);
        decreaseDirectionX(0.1);
    }

    //Increments the x direction to turn the vehicle
    @Override
    public void turnRight(){
        increaseDirectionX(0.1);

    }

    // increases variabe x direction vector
    private void increaseDirectionX(double amount){
        double increment = this.direction[0] + amount;
        if  (increment > -1 && increment < 1) {
            this.direction[0] = increment;
        }
    } //increaseDirectionX()

    //i decreases x direction vector
    private void decreaseDirectionX(double amount){
        double increment = this.direction[0] - amount;
        if  (increment > -1 && increment < 1){
            this.direction[0] = increment;
        }
    }//decreaseDirectionX()


    //standar gas method 
    //increments speed
    public void gas(double amount){
        if (Helpers.inBounds(1.0, 0.0, amount) == 0){
            incrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("amount needs to be between 0 and 1");
        } 
    } //gas()



    //Calculates and bound sets the speed to be applied after increaing/decreasing
    private double calculateSpeed(double speedToChange, double amount){
        if (Helpers.inBounds(enginePower, 0.0, speedToChange) == -1){
            speedToChange = 0;
        }
        else if (Helpers.inBounds(enginePower, 0, speedToChange) == 1){
            speedToChange = enginePower;
        }
        return speedToChange;
    }//calculateSpeed()
    
    //decreses speed
    public void brake(double amount){
        if (Helpers.inBounds(1.0, 0.0, amount) == 0){
            decrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("amount needs to be between 0 and 1");
        }
    }//brake()
 
    
    //Adds up speed in both x and y direction
    private void incrementSpeed(double amount){
        currentSpeedX = calculateSpeed(getCurrentSpeedX() + speedFactor()*amount, amount)*this.direction[0];
        currentSpeedY  = calculateSpeed(getCurrentSpeedY() + speedFactor()*amount, amount)*this.direction[1];
    }//incrementSpeed()
    
    //Subtracts speed in both x and y direction
    private void decrementSpeed(double amount){
        currentSpeedX = calculateSpeed(getCurrentSpeedX() - speedFactor()*amount, amount)*this.direction[0];
        currentSpeedY = calculateSpeed(getCurrentSpeedY() - speedFactor()*amount, amount)*this.direction[1];  
    }//decrementSpeed()
    
    //To be implemented
    public abstract double speedFactor();
}//Clas
