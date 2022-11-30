import java.awt.Color;

public class Scania extends Truck{



    public Scania() {
        super(2, 100, 0, Color.BLACK, "Scania Interlink", 0, 0 ,
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


}
