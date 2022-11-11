import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Saab95 car1 = new Saab95(2, Color.red, 125,"Saab95");
        Volvo240 car2 = new Volvo240(4, Color.black, 100, "Volvo240");

        List<Car> cars = new ArrayList();

        cars.add(car1Saab95);
        cars.add(car2Volvo240);

        for (Car car : cars){
            System.out.println(car.getName());
        }

    stopEngine();

        
}}
