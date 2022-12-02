package vehicle;
import java.awt.*;

public abstract class Car extends Vehicle {
    private boolean loaded;

    public boolean getLoaded() {
        return loaded;
    }

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color) {
        super(nrDoors, enginePower, currentSpeed, color);
        this.loaded = false;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    @Override
    public void startEngine(){
        if(loaded == false){
            super.startEngine();
        }
    }
    
    @Override
    public void gas(double gas){
        if(loaded == false){
            super.gas(gas);
        }
    }
    
}