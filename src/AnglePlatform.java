package src;

public class AnglePlatform implements IPlatform {

    public double platformAngle = 0.0;
    public int platformCapacity;
    public int loadOnPlatform;

    public AnglePlatform(int platformCapacity){ 
        this.platformAngle = 0.0;
        this.platformCapacity = platformCapacity;
    }

    public void raise(){
        if (this.platformAngle < 70.0){
            this.platformAngle += 1;
        }
        if (this.platformAngle > 70.0){
            this.platformAngle = 70.0;
        }

    }
    public void lower(){
        if (this.platformAngle > 0.0){
            this.platformAngle -= 1;
        }
        if (this.platformAngle < 0.0){
            this.platformAngle = 0.0;
        }

    }
/*    public void load(){
        

    }
    public void unload(){

    }
    */
}
