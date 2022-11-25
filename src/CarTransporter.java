package src;
import java.awt.*;

public class CarTransporter extends Car implements ICanLoadCar{
    
public TransporterPlatform flatbed;

    public CarTransporter() {
        super(2, 85, Color.darkGray, "TransportTorkel", 30, 30);
        this.flatbed = new TransporterPlatform(5);
    }
    public void raiseFlatbed(){
        
    }
}

