import java.awt.*;

public abstract class Car implements Movable {
    private int nrDoors;
    private Color color;
    protected int enginePower;
    private String modelName;
    private double currentSpeedX;
    private double currentSpeedY;
    private int x;
    private int y;
    private double[] direction;

    
    public Car(int nrDoors, Color color, int enginePower, String modelName, int  x, int y, double[] direction) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.x = x;
        this.y = y;
        this.direction = direction;
        stopEngine();
    }
    
    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeedX(){
        return currentSpeedX;
    }
    public double getCurrentSpeedY(){
        return currentSpeedY;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        incrementSpeed(0.1);
    }

    public void stopEngine(){
        currentSpeedX = 0;
        currentSpeedY = 0;
    }

    @Override
    public void move(){

    }

    @Override
    public void turnLeft(){
        direction[0]--;
    }

    @Override
    public void turnRight(){
        direction[0]++;

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

    

    // Jag testar om jag har write access
}
