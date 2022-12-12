import javax.swing.*;

import Model.*;

import java.awt.event.*;
import java.util.ArrayList;


// DETTA ÄR FÖR FRAMTIDEN
// INTE VIKTIGT NU


public class CarApplication {
    public static void main(String[] args) {
        ArrayList<Vehicle> cars = new ArrayList<>();

        cars.add(new Volvo240());
        cars.add(new Saab95());
        cars.add(new Scania());

        CarController cc = new CarController();
        CarView view = new CarView("CarSim 1.0", cc);


    }
}
