import java.awt.*;
// To-Do
// Add turning radius, a variable that change how fast the car turns

public abstract class Car implements Movable {
    private int nrDoors;
    private Color color;
    protected int enginePower;
    private String modelName;
    private double currentSpeedX;
    private double currentSpeedY;
    private double x;
    private double y;
    private double[] direction; // x and y list for the direction that  the car is supposed to move in

    
    public Car(int nrDoors, Color color, int enginePower, String modelName, double  x, double y, double[] direction) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.direction = direction;
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
    // public double getX(){
    //     return x;
    // }
    // public double getY(){
    //     return y;
    // }

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
        direction[0]+=0.1;
    }

    //Increments the x direction to turn the vehicle
    @Override
    public void turnRight(){
        direction[0]+= 0.1;

    }



    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }


    public void incrementSpeed(double amount){
        currentSpeedX = (getCurrentSpeedX() + speedFactor() * amount)*direction[0];
        currentSpeedY = (getCurrentSpeedY() + speedFactor() * amount)*direction[1];
    }
    

    public void decrementSpeed(double amount){
        currentSpeedX = (getCurrentSpeedX() - speedFactor() * amount)*direction[0];
        currentSpeedY = (getCurrentSpeedY() - speedFactor() * amount)*direction[1];
    }
    
    public abstract double speedFactor();

    @Override
    public String toString(){
        String rgbPrint = this.getColor().toString().substring(14);
        String printCar = "" + modelName + ": " + "Doors: " + this.getNrDoors() + ", Color: " + rgbPrint + ", Engine power: " + this.getEnginePower() + ", Position: (" + (int) x + "," + (int) y + ")" + ", Direction: (" + direction[0] + "," + direction[1] + ")";
        return printCar;
    }

    

    // Jag testar om jag har write access
}
