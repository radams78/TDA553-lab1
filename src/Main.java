package src;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    // The frame that represents this instance View of the MVC pattern
    public static void main(String[] args) {
           
           // A list of cars, modify if needed
        ArrayList<Vehicle> cars = new ArrayList<>();
        
        cars.add(new Volvo240(0, 10));
        cars.add(new Saab95(0, 110));
        cars.add(new Scania(0, 210));
       
        // Instance of this class
        CarController cc = new CarController(cars);

        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc); //// HÄR är den som skapar, vill ha in en view

        // Start the timer
        cc.timer.start();
    }
    
}

    
