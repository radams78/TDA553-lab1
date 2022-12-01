import java.awt.*;

public class CarTransport extends Truck implements Load{
    private TwoStateFlatbed flatbed;
    private int maxNumberOfCarsLoaded;
    private int currentNumberOfCarsLoaded;

    public CarTransport(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color); 
        this.flatbed = new TwoStateFlatbed();     
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
        if ((currentNumberOfCarsLoaded < maxNumberOfCarsLoaded) && (distanceToCar(car) < 1)){
            currentNumberOfCarsLoaded += 1;
            car.setLoaded(true);
        }
    }

    private double distanceToCar(Car car) {
        double distance;
        double xDifference = car.getX() - x;
        double yDifference = car.getY() - y;
        distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
        return distance;
    }

    @Override
    public void unload(Car car) { //You can only load cars.
        if (currentNumberOfCarsLoaded > 0){
            currentNumberOfCarsLoaded -= 1;
            car.setLoaded(false);
        }
    }
    
}