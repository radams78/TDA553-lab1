package labb1.viewAndController;

import labb1.Car;
import labb1.Saab95;
import labb1.Scania;
import labb1.Truck;
import labb1.Vehicle;
import labb1.Volvo240;
import java.awt.*;
import java.util.ArrayList;
import java.util.Timer;

public class Program {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<Car>();
        ArrayList<Truck> trucks = new ArrayList<Truck>();

        // Make factory?
        Volvo240 volvo = new Volvo240(Color.red, 0, 50, 0, 1);
        Saab95 saab = new Saab95(Color.red, 100, 50, 0, 1);
        Scania scania = new Scania(Color.green, 200, 50, 0, 1);

        cars.add(volvo);
        cars.add(saab);
        trucks.add(scania);

        CarsModel model = new CarsModel(trucks, cars);
        CarView frame = new CarView("carView", model);
        CarController cc = new CarController(model, frame);

        model.addObserver(frame);
        model.start();
    }
}
