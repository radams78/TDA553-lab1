package src;
import java.awt.*;

public class Scania extends Car{

    public AnglePlatform flatbed;

    public Scania() {
        super(2, 200, Color.green, "Scania Dumb truck 2000GX", 20, 20);
        flatbed = new AnglePlatform(1000);
    }
    public void raiseFlatbed(){
        flatbed.raise();
    }

    public double speedFactor(){
        return 1.0;
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
