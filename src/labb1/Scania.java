package labb1;

import java.awt.*;

//Class for scanias
public class Scania extends Truck{

    public Scania(Color color, double enginePower, String modelName, double x, double y, double dirX, double dirY, int maxLoad){
        super(color, 770, "Scania", x, y, dirX,  dirY, "dumpTruck", 300, 0, 70);
    }//Constructor

    @Override 
    public double speedFactor(){
        return enginePower * 0.01;
    }//speedFactor()

}//Class
