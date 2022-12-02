import java.awt.*;
import java.util.Stack;

public class CarTransport extends Truck implements Load{
    private TwoStateFlatbed flatbed;
    private int maxNumberOfCarsLoaded;
    private Stack carStack;

    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color, int maxNumberOfCarsLoaded){
        super(nrDoors, enginePower, currentSpeed, color); 
        this.flatbed = new TwoStateFlatbed();   
        this.maxNumberOfCarsLoaded = Math.max(maxNumberOfCarsLoaded, 1);  
        this.carStack = new Stack<>();
    }

    @Override
    public void startEngine() {
        if (flatbed.getFlatbedUp() == true) {
            super.startEngine(); 
        }
    }

    @Override
    public void gas(double gas){
        if (flatbed.getFlatbedUp() == true) {
            super.gas(gas); 
        }
    }

    public void raise() {
        if (getCurrentSpeed() == 0) {
            flatbed.raise();
        }
    }

    public void lower() {
        if (getCurrentSpeed() == 0) {
            flatbed.lower();
        }
    }

    @Override
    public void load(Car car) { //You can only load cars.
        if ((carStack.size() < maxNumberOfCarsLoaded) && (distanceToCar(car) < 1) && (car.getDx() == 0) &&
         (car.getDy() == 0) && (flatbed.getFlatbedUp() == false)){
            car.setLoaded(true);
            this.carStack.push(car);
        }
    }

    private double distanceToCar(Car car) {
        double distance;
        double xDifference = car.getX() - getX();
        double yDifference = car.getY() - getY();
        distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
        return distance;
    }

    @Override
    public void unload(Car car) { //You can only load cars.
        if ((carStack.size() > 0) && (carStack.peek() == car) && (flatbed.getFlatbedUp() == false)){
            carStack.pop();
            car.setLoaded(false);
        }
    }
    
}