package labb1;

import java.awt.*;

public class Scania extends Truck{
    private final int MAX_ANGLE = 70; //Maximum angle extention
    private final int MIN_ANGLE = 0; //Minimum angle extention
    private int platformAngle;

// }
=======
    public Scania(Color color, double enginePower, String modelName, double x, double y, double dirX, double dirY, int maxLoad){
        super(color, enginePower, modelName, x, y, dirX,  dirY, maxLoad);
        this.platformAngle = 0;
    }

    @Override 
    public double speedFactor(){
        return enginePower * 0.01;
    }

    public void raisePlatform(int angle){
        if (this.platformAngle <= MAX_ANGLE){
        this.platformAngle += angle;
        }else{
            this.platformAngle = MAX_ANGLE;
        }
    }

    public void lowerPlatform(int angle){
        if (this.platformAngle >= MIN_ANGLE){
            this.platformAngle -= angle;
            }else{
                this.platformAngle = MIN_ANGLE;
            }
    }

}
