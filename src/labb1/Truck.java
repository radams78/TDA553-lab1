package labb1;
import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle{
    private Trailer trailer;
    private Dumper dumper;
    private Flatbed flatbed;

    public Truck(Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY, String trailerType, int maxLoad, int minExtensionAngle, int maxExtensionAngle){
        super(2, color, enginePower, modelName, x, y, dirX, dirY);
            dumper = new Dumper(maxLoad, minExtensionAngle, maxExtensionAngle);
            trailer = dumper;
    }

    public Truck(Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY, String trailerType, int maxLoad, int MAX_NUMBER_OF_CARS){
        super(2, color, enginePower, modelName, x, y, dirX, dirY);    
        flatbed = new Flatbed(maxLoad, MAX_NUMBER_OF_CARS);
            trailer = flatbed;
        }
    
    @Override
    //Overrides the evehicle gas method to do a check for if the platform is extended
    public void gas(double amount){
        if (trailer.getPlatformExtended()){
            throw new IllegalArgumentException("Can not move while platform is extended");
        }else{
            super.gas(amount);
        }
        
    }//gas()


    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
