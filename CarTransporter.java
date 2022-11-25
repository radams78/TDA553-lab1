import java.awt.Color;
import java.util.ArrayList;

public class CarTransporter extends Truck {

    private ArrayList<Car> cars;

    public CarTransporter() {
        super(2, 100, 0, Color.BLACK, "Car Transporter", 0, 0);
        
    }


    @Override
    public void incrementSpeed(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void decrementSpeed(double amount) {
        
    }

    public void loadCar(Car c){
        cars.add(c);
    }

    public void unloadCars(){

        for (Car c : cars) {
            
            

        }
    }

    @Override
    double speedFactor() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void plattformUp(int state) {
        this.setPlattformState(1);
    }


    @Override
    public void plattfromDown(int state) {
        this.setPlattformState(0);
    }


    public ArrayList<Car> getCars() {
        return cars;
    }



}
