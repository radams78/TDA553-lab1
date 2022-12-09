package Model;
import java.awt.Color;
import java.util.ArrayDeque;


public class CarTransporter extends Truck implements CarLoadable {
    
    private CarLoad load;

    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0,
         new CarTransportPlatform());
         load = new CarLoad(10);
    }

    @Override
    public Boolean isAbleToMove() {
        if (getPlatformState() == 1){
            return true;
        }
        else {
            return false;
        } 
    }

    @Override
    public void load(Car c) {
        if (getPlatformState() == 0){
            load.load(getX(), getY(), c);
        }
    }

    
    @Override
    public void unload() {
        if(getPlatformState() == 0){
           load.unload(getX(), getY());
        }        
    }

    @Override
    public ArrayDeque<Car> getCars() {
      
        return load.getCars();
    }

    @Override
    public void gas(double amount) throws Exception{
        if (amount > 1 || amount < 0){
            throw new IllegalArgumentException("Only accepts values of 1 and 0");
        }
        else { if (platform.getPlatformState() == 1){
            incrementSpeed(amount);
        }
        }
    }
    @Override
    public void startEngine(){
        if (platform.getPlatformState()== 1){
        this.setCurrentSpeed((0.1));
        }
    }
}
