import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.AbstractDocument.Content;

import java.util.*; 

public class CarTransporter extends Truck{

    Content contents = new Content(xPos,yPos);      //TODO varför?

    public CarTransporter() {
        super(2, 110, 0, Color.BLUE, "car transporter", 0, 0, Direction.NORTH);
    }

    // det ska vara max och min i platform;

    @Override
    public void openPlatform() {
        // platform is not in the superclass, cant override
        platform.setPlatformAngle(platform.maxAngle); // can we move the open and close func to Truck?
    }

    @Override
    public void closePlatform() { // platform is not in the superclass, cant override
        platform.setPlatformAngle(platform.minAngle); // can we move the open and close func to Truck?
    }


}
