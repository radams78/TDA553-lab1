package Model;
import java.awt.Color;

public class Scania extends Truck{



    public Scania() {
        super(2, 100, 0.1, Color.BLACK, "Scania", 0, 0 ,
         new AngledPlatform(70));
        
    }
    
    @Override
    public Boolean isAbleToMove() {
        if (getPlatformState() == 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void gas(double amount) throws Exception{
        if (amount > 1 || amount < 0){
            throw new IllegalArgumentException("Only accepts values of 1 and 0");
        }
        else { if (platform.getPlatformState() == 0){
            incrementSpeed(amount);
        }
        }
    }

    
}
