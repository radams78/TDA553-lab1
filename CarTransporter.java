import java.awt.Color;

public class CarTransporter extends Truck {

    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0,
         new CarTransportPlattform(10));
    }


    @Override
    public void incrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void decrementSpeed(double amount) {
        
    }

    
    @Override
    public double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }


}
