package labb1;

import java.awt.*;

//Class for scanias
public class Scania extends Truck{
    private final int MAX_ANGLE = 70; //Maximum angle extention
    private final int MIN_ANGLE = 0; //Minimum angle extention
    private int platformAngle;

// }
    public Scania(Color color, double x, double y, double dirX, double dirY){
        super(color, 770, "Scania", x, y, dirX, dirY, 300);
        this.platformAngle = 0;
    }//Constructor

    @Override 
    public double speedFactor(){
        return enginePower * 0.01;
    }//speedFactor()

    public void raisePlatform(int angle){ //extendPlatform tests if the truck is moving, if it isn't then extend platform otherwise do nothing(Truck will trow exception). 
        this.extendPlatform(); 
        if (this.platformAngle <= MAX_ANGLE && this.isPlatformExtended()){
            this.platformAngle += angle;
            }else{
                this.platformAngle = MAX_ANGLE;
            }
    }//raisePlatform()


    //Specific method for lowering platsform
    //Decreases thje platsform angle if itn not at the min angle of zero
    public void lowerPlatform(int angle){
        if (this.platformAngle >= MIN_ANGLE){
            this.platformAngle -= angle;
            }else{
                this.platformAngle = MIN_ANGLE;
                this.retractPlatform();
            }
    }//lowerPlatform()
}//Class
