package labb1;
import java.awt.*;

public class CarTransporter extends Truck{
    int nrDoors, Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY
    public CarTransporter(Color color, double  x, double y, double dirX, double dirY, int maxLoad){
        super(color, 500, "SOME CAR TRANSPORTER," x, y, dirX, dirY, 2);
    }//Constructor
     
    int hej = "hej";
    
    public boolean isStationary(){

    }

    public boolean platformUp(){

    }

    @Override
    public void raisePlatform(){

    }

    @Override
    public void lowerPlatform(){

    }
}