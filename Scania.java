import java.awt.Color;

public class Scania extends Truck {



    public Scania() {
        super(2, 100, 0, Color.BLACK, "Scania Interlink", 0, 0 ,
         new AngledPlattform(70));
        
    }

    @Override
    double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    void incrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    void decrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }


}
