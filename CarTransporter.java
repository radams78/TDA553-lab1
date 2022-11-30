import java.awt.Color;


public class CarTransporter extends Truck {
    
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

    public void load(Car c) {
        if (getPlatformState() == 0){
            load.load(getX(), getY(), c);
        }
    }

    
    public void unload() {
        if(getPlatformState() == 0){
           load.unload(getX(), getY());
        }        
    }
}
