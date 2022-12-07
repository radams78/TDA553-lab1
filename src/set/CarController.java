// --- Package --- //

package set;

// --- Imports --- //

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

 // --- Class --- //

public class CarController {

    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicles> vehicles = new ArrayList<>();
    

    //methods:

    public static void main(String[] args) {
        // Instance of this class
        CarController cc = new CarController();
        

        cc.vehicles.add(new Volvo240(4,Color.BLACK, 100, "Bil"));
        cc.vehicles.add(new Saab95(4,Color.BLACK, 100, "Bil"));
        cc.vehicles.add(new Scania(4,Color.BLACK, 100, "Bil", 70));

        cc.vehicles.get(0).setCoordinates(0, 50);
        cc.vehicles.get(1).setCoordinates(100, 150);  // For clarity
        cc.vehicles.get(2).setCoordinates(0, 100);


        // Start a new view and send a reference of self
        cc.frame = new CarView("CarSim 1.0", cc);

        // Start the timer
        cc.timer.start();
        
    }

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicles vehicle : vehicles) {
                
                vehicle.move();
                System.out.println(vehicle.getCurrentSpeed());
                System.out.println(vehicle);
                int x = (int) Math.round(vehicle.getXPosition());
                int y = (int) Math.round(vehicle.getYPosition());
                frame.drawPanel.moveit(x, y);
                // VERY BAD CODE BUT I ONLY WANT THE FIRST PART TO WORK BEFORE WE REFACTOR
                // Does not follow the openclosed principle, would need to add new code to paint another type of vehicle
                if (vehicle.getClass().equals(new Scania(y, null, y, null, x).getClass())){
                    
                    frame.drawPanel.moveScania((int)vehicle.getXPosition(), (int)vehicle.getYPosition());
                }
                if (vehicle.getClass().equals(new Volvo240(x, null, y, null).getClass())){

                    frame.drawPanel.moveVolvo((int)vehicle.getXPosition(), (int)vehicle.getYPosition());
                }
                if (vehicle.getClass().equals(new Saab95(x, null, y, null).getClass())){

                    frame.drawPanel.moveSaab((int)vehicle.getXPosition(),(int) vehicle.getYPosition());
                }
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
            
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100.0;
        for (Vehicles vehicle : vehicles) {
            vehicle.gas(gas);
        }
    }
    void startEngine(){
        for (Vehicles vehicle : vehicles) {
            vehicle.startEngine();
        }
    }
    
    void stopEngine(){
        for (Vehicles vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }
    // Not implemented
    void setTurboOn(){
        
    }
}
