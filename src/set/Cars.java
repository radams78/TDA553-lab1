
import java.awt.*;

abstract class Cars implements Movable{

    private int nrDoors;
    private double enginePower;
    private String modelName;
    private Color color;
    private double currentSpeed;
    private double direction;
    private double x;
    private double y;

    public Cars(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.direction = 0;
        this.x = 0;
        this.y = 0;
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
    public void setCurrentSpeed(double currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getDirection(){
        return direction;
    }
    public void setDirection(double direction){
        this.direction = direction;
    }

    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public Color getColor(){
        return color;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    @Override
    public void move() {
        // TODO Auto-generated method stub
        setX(getX() + (Math.cos(Math.toRadians(getDirection())) * getCurrentSpeed()));
        setY(getY() + (Math.sin(Math.toRadians(getDirection())) * getCurrentSpeed()));
    }

    public void turnLeft() {
        // TODO Auto-generated method stub
        setDirection(getDirection() + 90);
    }

    public void turnRight() {
        // TODO Auto-generated method stub
        setDirection(getDirection() - 90);
    }
    
    public String toString() {
        return "Cars [nrDoors = " + nrDoors + ", enginePower = " + enginePower + ", modelName = " + modelName + ", color="
                + color + ", currentSpeed = " + currentSpeed + ", X = " + x + ", Y = " + y + "]";
    }
    
}
