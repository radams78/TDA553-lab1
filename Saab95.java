import java.awt.*;

public class Saab95 extends Car implements Movable{

    // public boolean turboOn;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    boolean turboOn,turnLeft,turnRight;
    public Saab95(){
        super(2,125,0,Color.red,"Saab95",0,0);
        stopEngine();
        
       
        // nrDoors = 2;
        // color = Color.red;
        // enginePower = 125;
	    turboOn = false;
        turnLeft=false;
        turnRight=false;
        // modelName = "Saab95";
        // stopEngine();
        
    }

    private void setTurboOn(){
	    turboOn = true;
    }

    private void setTurboOff(){
	    turboOn = false;
    }
    
    double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }
    
    // TODO fix this method according to lab pm
    void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    void brake(double amount){
        decrementSpeed(amount);
    }
    public void turnLeft(){
        turnRight=false;
        turnLeft=true;
    }
    public void turnRight(){
        turnLeft=false;
        turnRight=false;
    }
    public void move(){
        if (turnLeft==true){
            setX(getCurrentSpeed());
            setY(getCurrentSpeed());

        }else if(turnRight==true){
            setX(-getCurrentSpeed());
            setY(getCurrentSpeed());
        }else{
            setY(getCurrentSpeed());        
        }
    }
}
