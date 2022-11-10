import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    
    public Volvo240(){
        super(4,100,0,Color.black,"Volvo204");
        // nrDoors = 4;
        // color = Color.black;
        // enginePower = 100;
        // modelName = "Volvo240";
        // stopEngine();
    }
    
    int getNrDoors(){
        return nrDoors;
    }
    double getEnginePower(){
        return enginePower;
    }

    double getCurrentSpeed(){
        return currentSpeed;
    }

    Color getColor(){
        return color;
    }

    void setColor(Color clr){
	    color = clr;
    }

    void startEngine(){
	    currentSpeed = 0.1;
    }

    void stopEngine(){
	    currentSpeed = 0;
    }
    
    double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    // TODO fix this method according to lab pm
    void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    void brake(double amount){
        decrementSpeed(amount);
    }
}
