package src;
import java.awt.*;

public class Scania extends Vehicle{

    public AnglePlatform garbagePlatform;

    public Scania() {
        super(2, 200, Color.green, "Scania Dumb truck 2000GX", 20, 20, false);
        garbagePlatform = new AnglePlatform(1000);
    }
    
    public void raiseGarbagePlatform(){
        if(this.isVehicleCurrentSpeedZero()){
            garbagePlatform.raise();
        }
    }

    public void lowerGarbagePlatform(){
        garbagePlatform.lower();
    }

    public double speedFactor(){
        return 1.0;
    }
    
    @Override
    public void startEngine(){
        if(this.garbagePlatform.platformAngle == 0){
            this.setCurrentSpeed(0.1);
        }
    }

    @Override
    public void gas(double amount) {
        if(0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        }
    }
    
    
    @Override
    public void incrementSpeed(double amount){
        if (getCurrentSpeed() < getEnginePower()) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() *amount);
            }
        else {
            setCurrentSpeed(getEnginePower());
        }
    }
    @Override
    public void decrementSpeed(double amount) {
        if(getCurrentSpeed() >= 0){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }
        else{
            setCurrentSpeed(0);
        }
    }
}
