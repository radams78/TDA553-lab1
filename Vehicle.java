import java.awt.*;

import javax.swing.plaf.synth.ColorType;

public class Vehicle {
    
    private int nrDoors; 
    private Color color;
    private double enginePower;
    private String modelName;

    public Vehicle(){}

    public Vehicle(int nrDoors2, Color color2, double enginePower2, String modelName2) {
        this.nrDoors = nrDoors;
        this.color = color;
        this.enginePower = enginePower;
        this.modelName = modelName;
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
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;

    }
    // TODO fix this method according to lab pm
    public void gas(double amount){
     incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
     decrementSpeed(amount);
    }

}



