import java.awt.*;

public class Car {
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    private int dx;  // speed of the car in the direction on x-axel
    private int dy; // speed of the car in the direction on y-axel
    private int x; // current position of the car
    private int y; // current position of the car on y-axel
    private int direction;

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

    public double speedFactor(){
        return 0.01;
    }
    public void setDx(int dx){
        this.dx = dx;
    }
    public void setDy(int dy){
        this.dy = dy;
    }
    public int getDx(){
        return dx;
    }
    public int getDy(){
        return dy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getDirection(){
        return direction;
    }
    public void setDirection(int dir){
        this.direction = dir;
    }




}
