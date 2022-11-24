package labb1;

import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle{
    private int maxLoad;
    private Boolean platformExtended;
    public Truck(Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY, int maxLoad){
        super(2, color, enginePower, modelName,   x,  y, dirX,  dirY);
        this.maxLoad = maxLoad;
        this.platformExtended = false;
    }

    // Returns max load var
    public int getMaxLoad(){
        return maxLoad;
    }

    public Boolean isPlatformExtended(){
        return platformExtended;
    }

    public void extendPlatform(){
        platformExtended = true;
    }

    public void retractPlatform(){
        platformExtended = false;
    }
    
    @Override
    public void gas(double amount){
        if (platformExtended){
            throw new IllegalArgumentException("Hey stop");
        }else{
            super.gas(amount);
        }
        
    }


    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
