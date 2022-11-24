package labb1;
import java.awt.*;

public class CarTransporter extends Truck{


    public CarTransporter(Color color, double  x, double y, double dirX, double dirY, int maxLoad){
        super(color, 500, "SOME CAR TRANSPORTER,", x, y, dirX, dirY, maxLoad);
    }//Constructor
     
    @Override
    public void extendPlatform(){
        if (this.getCurrentSpeedX() != 0 || this.getCurrentSpeedY() != 0){
            throw new IllegalArgumentException("The truck is moving");
        }
        else{
            super.extendPlatform();
        }
    }


    @Override
    public double speedFactor(){
        return enginePower*0.01;
    }
}