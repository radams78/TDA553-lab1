package src;

public class AnglePlatform implements IPlatform {

    public double platformAngle = 0.0;  // Start value
    public int platformCapacity;
    public int loadOnPlatform;

    /** Constructor AnglePlatform.
        platformCapacity will be set to received argument.
        Argument must be positive. */
    public AnglePlatform(int platformCapacity){ 
        this.platformAngle = 0.0;
        this.platformCapacity = platformCapacity;
    }

    /** Call this method to raise platformAngle.
        Platform can not be raised more than 70 degrees. */
    public void raise(){
        if (this.platformAngle < 70.0){
            this.platformAngle += 1;
        }
        if (this.platformAngle > 70.0){
            this.platformAngle = 70.0;
        }

    }
    /** Call this method to lower the platformAngle.
        Platform can not be lowered more than 0 degrees */
    public void lower(){
        if (this.platformAngle > 0.0){
            this.platformAngle -= 1;
        }
        if (this.platformAngle < 0.0){
            this.platformAngle = 0.0;
        }

    }

    public boolean isPlatformAngleZero(){
        if (this.platformAngle == 0){
            return true;
        }
        else return false;
    }
/*    public void load(){
        

    }
    public void unload(){

    }
    */
}
