package labb1;
import java.awt.*;
// To-Do
// Add turning radius, a variable that change how fast the car turns

public abstract class Car implements Movable {
    private int nrDoors;
    private Color color;
    protected double enginePower;
    private String modelName;
    private double currentSpeedX;
    private double currentSpeedY;
    private double x;
    private double y;
    private double[] direction; // x and y list for the direction that  the car is supposed to move in

    
    public Car(int nrDoors, Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.direction = new double[] {dirX, dirY} ;
        stopEngine();
    }//car
    

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


    //temp
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }



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

    private void increaseDirectionX(double amount){
        this.direction[0]+= amount;
    }

    private void decreaseDirectionX(double amount){
        this.direction[0]-= amount;
    }



    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount <= 1 && amount >= 0){
            incrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("amount needs to be between 0 and 1");
        }
        
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount <= 1 && amount >= 0){
            decrementSpeed(amount);
        }else{
            throw new IllegalArgumentException("amount needs to be between 0 and 1");
        }
    }

    //TODO? the updated speeds are with this code only dependent on the speed in the X-axis
    private void incrementSpeed(double amount){
        double incrementAmount = getCurrentSpeedX() + speedFactor() * amount*this.direction[0];
        if(incrementAmount <= 0){
            incrementAmount = 0;
        }else if(incrementAmount >= enginePower){
            incrementAmount = enginePower;
        } 
        currentSpeedX = incrementAmount;
        currentSpeedY  = incrementAmount;  
    }
    
    //TODO? the updated speeds are with this code only dependent on the speed in the X-axis
    private void decrementSpeed(double amount){
        double decrementAmount = getCurrentSpeedX() - speedFactor() * amount*this.direction[0];
        if(decrementAmount <= 0){
            decrementAmount = 0;
        }else if(decrementAmount >= enginePower){
            decrementAmount = enginePower;
        } 
        currentSpeedX = decrementAmount;
        currentSpeedY = decrementAmount;  
    }
    
    public abstract double speedFactor();

    @Override
    public String toString(){
        String rgbPrint = this.getColor().toString().substring(14);
        String printCar = "" + modelName + ": " + "Doors: " + this.getNrDoors() + ", Color: " + rgbPrint + ", Engine power: " + this.getEnginePower() + ", Position: (" + (int) x + "," + (int) y + ")" + ", Direction: (" + direction[0] + "," + direction[1] + ")";
        return printCar;
    } //Car object as a visible car object

    

    // Jag testar om jag har write access
}
