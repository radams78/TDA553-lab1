import java.awt.Color;


public class CarTransporter extends Truck {
    
    
    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0,
         new CarTransportPlatform(), new CarLoad(10));
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


}
