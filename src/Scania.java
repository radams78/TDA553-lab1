package src;
import java.awt.*;

public class Scania extends Vehicle {

    public AnglePlatform garbagePlatform;

    public Scania(double xCoordinate, double yCoordinate) {
        super(2, 200, Color.green, "Scania Dumb truck 2000GX", xCoordinate, yCoordinate, false);
        garbagePlatform = new AnglePlatform(1000);
    }
    
    public void raisePlatform(){
        if(this.isVehicleCurrentSpeedZero()){
            garbagePlatform.raisePlatform();
        }
    }

    public void lowerPlatform(){
        garbagePlatform.lowerPlatform();
    }
    
    @Override
    public void startEngine(){
        if(this.garbagePlatform.platformAngle == 0){
            this.setCurrentSpeed(0.1);
        }
    }
    
}
