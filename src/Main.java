package src;



import src.carModel.Car;
import src.carModel.Saab95;
import src.carModel.Scania;
import src.carModel.Volvo240;

import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class Main {
    private static final int X = Config.X;
    private static final int Y = Config.Y;
    private static ArrayList<Car> cars = new ArrayList<Car>() {
        
        {
        add(new Volvo240(0, 0));
        add(new Saab95(0, 100));
        add(new Scania(0, 200));
        }
    };
    public static void main(String[] args) {
        
        
        // Instance of this class
        Model currentModel = new Model(cars);

        currentModel.addCar(new Volvo240(0, 0));
        currentModel.addCar(new Saab95(0, 100));
        currentModel.addCar(new Scania(0, 200));

        // Start a new view and send a reference of self
        View currentView = new View(X, Y-240, currentModel);
        currentModel.currentController = new Controller("CarSim 1.0", currentModel);
        Window currentwindow = new Window("Car Simulator 1.0", currentView, currentModel.currentController);
        // Start the timer
        currentModel.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
}
