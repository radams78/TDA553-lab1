package labb1;
import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle{
    private Trailer trailer;
    private Dumper dumper;
    //private flatbed flatbed;

    public Truck(Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY, String trailerType, int maxLoad, int minExtensionAngle, int maxExtensionAngle){
        super(2, color, enginePower, modelName, x, y, dirX, dirY);
        if (trailerType.equals("dumper")){
            dumper = new Dumper(maxLoad, minExtensionAngle, maxExtensionAngle);
            trailer = dumper;

        } /*else if (trailerType.equals("flatbed")){
            flatbed = new flatbed(maxLoad);
            trailer = flatbed;
        }
        */
    }
    
    @Override
    //Overrides the evehicle gas method to do a check for if the platform is extended
    public void gas(double amount){
        if (trailer.getPlatformExtended()){
            throw new IllegalArgumentException("Hey stop");
        }else{
            super.gas(amount);
        }
        
    }//gas()


    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
