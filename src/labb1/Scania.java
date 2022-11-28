package labb1;

import java.awt.*;

//Class for scanias
public class Scania extends Truck{
    private final int MAX_ANGLE = 70; //Maximum angle extention
    private final int MIN_ANGLE = 0; //Minimum angle extention
    private int platformAngle;

    public Scania(Color color, double enginePower, String modelName, double x, double y, double dirX, double dirY, int maxLoad){
        super(color, enginePower, modelName, x, y, dirX,  dirY, maxLoad);
        this.platformAngle = 0;
    }//Constructor

    @Override 
    public double speedFactor(){
        return enginePower * 0.01;
    }//speedFactor()

    //Specific method for raising the platsform of the truck
    //Increases platsform angle if its not at the max angle
    public void raisePlatform(int angle){
        if (this.platformAngle <= MAX_ANGLE){
            this.platformAngle += angle;
            this.extendPlatform();
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
