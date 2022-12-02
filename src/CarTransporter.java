import java.awt.Color;

public class CarTransporter extends Truck{

    public CarTransporter(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int xPos,
            int yPos, Direction currentcardirection) {
        super(2, 110, 0, Color.BLUE, "car transporter", 0, 0, Direction.NORTH);
        
    }

@Override
public double openPlatform(double platformAngle){       //platform is not in the superclass, cant override
    return platformAngle = 70;                          //can we move the open and close func to Truck?
}

@Override
public double closePlatform(double platformAngle){       //platform is not in the superclass, cant override
    return platformAngle = 0;                          //can we move the open and close func to Truck?
}
}
