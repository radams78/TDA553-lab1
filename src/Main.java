package src;

import javax.management.AttributeChangeNotificationFilter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class Main {
    private static ArrayList<Car> cars = new ArrayList<Car>() {
        {
        add(new Volvo240(0, 0));
        add(new Saab95(0, 100));
        add(new Scania(0, 200));
        }
    };
    public static void main(String[] args) {
        // Instance of this class
        Model cc = new Model(cars);

        cc.cars.add(new Volvo240(0, 0));
        cc.cars.add(new Saab95(0, 100));
        cc.cars.add(new Scania(0, 200));

        // Start a new view and send a reference of self
        cc.frame = new Controller("CarSim 1.0", cc);

        // Start the timer
        cc.start();
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */


    
}
