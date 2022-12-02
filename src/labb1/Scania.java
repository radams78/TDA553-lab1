package labb1;

import java.awt.*;

//Class for scanias
public class Scania extends Truck {
    private Dumper trailer; // the trailer that is to be attached to the truck
    public Scania(Color color, double x, double y, double dirX, double dirY) {
        super(color, 770, "Scania", x, y, dirX, dirY,300);
        //Attaching the trailer
        this.trailer = new Dumper(300, 0, 70, speedFactor());
       
    }// Constructor



    

    @Override
    public Dumper getTrailer(){
        return trailer;
    }
    

    @Override
    public double speedFactor() {
        return enginePower * 0.01;
    }// speedFactor()
    
}//Class

