import java.awt.Color;
import java.util.*; 

public class CarTransporter extends Truck{

    private int carAmount;
    Content contents = new Content(xPos,yPos, carAmount);

    public CarTransporter() {
        super(2, 110, 0, Color.BLUE, "car transporter", 0, 0, Direction.NORTH);
        
    }

    public void SetCaramount(Stack<Car> loadedCars){
        contents.SetCaramount(loadedCars);
    }
    public void GetCaramount(Stack<Car> loadedCars){
        contents.getCarStack(loadedCars);
    }

    public void openPlatform() {
        platform.setPlatformAngle(platform.maxAngle);
    }

    public void closePlatform() { 
        platform.setPlatformAngle(platform.minAngle); 
    }

    public void move(Stack<Car> loadcarslist){
        for (Car car : loadcarslist) {
            car.setxPos(xPos);
            car.setyPos(yPos);
        }
    }
}
