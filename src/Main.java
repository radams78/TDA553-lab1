package src;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        Car saab = new Saab95(2, 125, Color.red, "Saab95", 0, 0);

        List<Car> listOfCars = new ArrayList();

        listOfCars.add(volvo);
        listOfCars.add(saab);

        volvo.turnLeftMethod();
        System.out.println(volvo.turnLeft);
        System.out.println(saab.turnLeft);
    }
}
