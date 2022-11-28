import java.awt.Color;


public class CarTransporter extends Truck {
    

    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0,
         new CarTransportPlattform());
    }


    @Override
    public Boolean isAbleToMove() {
        if (plattform.getPlattformState() == 1){
            return false;
        }
        else {
            return true;
        }
        
    }


}
