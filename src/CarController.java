package src;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController extends JFrame{
    // member fields:
    JButton gasButton = new JButton("Gas");
    JButton brakeButton = new JButton("Brake");
    JButton turboOnButton = new JButton("Saab Turbo on");
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");

     // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    Timer timer = new Timer(delay, new TimerListener());
    
    // A list of cars, modify if needed
    ArrayList<Vehicle> cars;

     // The frame that represents this instance View of the MVC pattern
    CarView frame;

    // Constructor
    public CarController(ArrayList<Vehicle> listOfVehicles) {
        this.cars = listOfVehicles;
    }

        // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : cars) {
            car.gas(gas);
        }
    }

    void startEngine() {
        for (Vehicle car : cars
                ) {
            car.startEngine();
        
        }
    }

    void brake(int amount) {
        double brek = ((double) amount) / 100;
        for (Vehicle car : cars
                ) {
            car.brake(brek);
        }
    }
    // This actionListener is for the gas button only
        // TODO: Create more for each component as necessary
   /*     gasButton.addActionListener(new ActionListener(int amount) {
            @Override
            public void actionPerformed(ActionEvent e) {
                gas(amount); //// DEN HÄR FINNS I CAR VIEW, ska få in i CarController tsm med alla panelgrejer
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){
                startEngine();
            }
            
        });

        brakeButton.addActionListener(new ActionListener(int amount) {
            @Override
            public void actionPerformed(ActionEvent event){
                brake(amount);
            }
            
        });
*/
    //methods:   
        /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle car : cars) {
                car.move();
                int x = (int) Math.round(car.getX());
                int y = (int) Math.round(car.getY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }
}
