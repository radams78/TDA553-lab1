import java.awt.*;

public abstract class Vehicle implements Movable {
    
    private double currentSpeed;
    private Color color;
    private final String vehicleType;
    private int x;
    private int y;
    private int dir;


    public Vehicle(String vehicleType, Color color, int x, int y, int dir){
        this.vehicleType = vehicleType;
        this.color = color;
        this.x = x;
        this.y = y; 
        this.dir = dir;

    }

    public void setCurrentSpeed(double currentSpeed){
        this.currentSpeed = currentSpeed;
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

    public void startVehicle(){
	    currentSpeed = 0.1;        
    }

    public void stopVehicle(){
	    currentSpeed = 0;
    }

    public void move(){
        this.x += currentSpeed;
        this.y += currentSpeed;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getDir() {
        return dir;
    }

    public void turnLeft(){
        System.out.println("tjjena mittbena");
    }

    public void turnRight(){
        System.out.println("tjjena mittbena");
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }


    public abstract void incrementSpeed(double amount);
        
    

    public abstract void decrementSpeed(double amount);
        
    

}
