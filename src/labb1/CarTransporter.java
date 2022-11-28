package labb1;
import java.awt.*;

//Class for car transporters
public class CarTransporter extends Truck{


    public CarTransporter(Color color, double  x, double y, double dirX, double dirY, int maxLoad){
        super(color, 500, "SOME CAR TRANSPORTER,", x, y, dirX, dirY, maxLoad);
    }//Constructor
     
    @Override
    //Specific speed factor for the car transporter
    public double speedFactor(){
        return enginePower*0.01;
    }
}// Class