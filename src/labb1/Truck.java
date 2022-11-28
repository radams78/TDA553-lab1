package labb1;

import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle{
    private int maxLoad;
    private Boolean platformExtended;
    public Truck(Color color, double enginePower, String modelName, double  x, double y, double dirX, double dirY, int maxLoad){
        super(2, color, enginePower, modelName,   x,  y, dirX,  dirY);
        this.maxLoad = maxLoad;
        this.platformExtended = false;
    }

    // Returns max load 
    public int getMaxLoad(){
        return maxLoad;
    }

    // Returns true if the platsform is extended 
    public Boolean isPlatformExtended(){
        return platformExtended;
    }

    // Sets the platsform to extended
    public void extendPlatform(){
        if (this.getCurrentSpeedX() != 0 || this.getCurrentSpeedY() != 0){
            throw new IllegalArgumentException("The truck is moving");
        }
        else{
            platformExtended = true;
        }
    }//extendPlatform()
    

    //sets platasform extended to false
    public void retractPlatform(){
        platformExtended = false;
    }
    
    @Override
    //Overrides th evehicle gas method to do a check for if the platform is extended
    public void gas(double amount){
        if (platformExtended){
            throw new IllegalArgumentException("Hey stop");
        }else{
            super.gas(amount);
        }
        
    }//gas()


    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
