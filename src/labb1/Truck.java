package labb1;

import java.awt.*;

//*Abstract class for any truck. Truck must have a max load . */
public abstract class Truck extends Vehicle{
    private int maxLoad;
    public Truck(int nrDoors, Color color, int enginePower, String modelName, double  x, double y, double dirX, double dirY, int maxLoad){
        super(nrDoors, color, enginePower, modelName,   x,  y, dirX,  dirY);
        this.maxLoad = maxLoad;
    }

    // Returns max load var
    public int getMaxLoad(){
        return maxLoad;
    }


    // Part of the class contract. SUbclass must implement speedFactor
    @Override
    public abstract double speedFactor();
}
