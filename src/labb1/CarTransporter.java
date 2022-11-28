package labb1;
import java.awt.*;

//Class for car transporters
public class CarTransporter extends Truck{


    public CarTransporter(Color color, int enginePower, String modelName, double x, double y, double dirX, double dirY, int maxLoad, int maxNrOfCars){
        super(color, 500, "Ford", x, y, dirX,  dirY, "flatbed", 100, maxNrOfCars);
    }//Constructor
     
    @Override
    //Specific speed factor for the car transporter
    public double speedFactor(){
        return enginePower*0.01;
    }
}// Class