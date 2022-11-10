import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Saab95 car1 = new car1(Car.nrDoors: 2, Car.color: Color.red, Car.enginePower : 125, Car.modelName : "Saab95");
        Volvo240 car2 = new car2(Car.nrDoors: 4, Car.color:Color.black, Car.enginePower : 100,  Car.modelName : "Volvo240");

        List<Car> cars = new ArrayList();

        cars.add(car1Saab95);
        cars.add(car2Volvo240);

        for (Car car : cars){
            System.out.println(car.getName());
        }

        
}}
