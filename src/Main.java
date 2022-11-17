package src;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car volvo = new Volvo240(4, 100, Color.black, "Volvo240", 0, 0);
        Car saab = new Saab95(2, 125, Color.red, "Saab95", 0, 0);

        List<Car> listOfCars = new ArrayList();

        listOfCars.add(volvo);
        listOfCars.add(saab);

        volvo.startEngine();
        volvo.incrementSpeed(3);
        System.out.println(volvo.getCurrentSpeed());

        System.out.println(volvo.getEnginePower());
        System.out.println(saab.getCurrentSpeed());
        volvo.gas(2);
        saab.gas(4);
        System.out.println(volvo.getCurrentSpeed());
        System.out.println(saab.getCurrentSpeed());

        for(int i=0; i<10; i++) {
            volvo.move();
            System.out.println(volvo.getX() + " " + volvo.getY());
            volvo.turnLeft();
            volvo.move();
            volvo.turnRight();
            volvo.move();
        }
    }
}
