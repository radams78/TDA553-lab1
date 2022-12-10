import javax.swing.*;
import Model.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController {
    
    private final int delay = 50;
   
    private Timer timer = new Timer(delay, new TimerListener());

    private VehicleView frame;
    private VehicleModel model;

    


    public VehicleController(VehicleModel model){
        this.model = model;
        this.frame = new VehicleView("Vehiclesim 1.0", this);
    }
    
    //methods:

    /* Each step the TimerListener moves all the Vehicles in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            for (Vehicle vehicle : model.getVehicles()) {
                vehicle.move();
                
                int x = (int) Math.round(vehicle.getX());
                int y = (int) Math.round(vehicle.getY());
                frame.moveit(model.getVehicles().indexOf(vehicle), x, y);
                // repaint() calls the paintComponent method of the panel
                frame.repaint();
            }
        }
    }

    public void start(){
        timer.start();
    }
  
    public ArrayList<Vehicle> getVehicles() {
        return model.getVehicles();
    }

    // Calls the gas method for each car once
    public void gas(int amount) {
        model.gas(amount);
    }

    public void startEngine() {

        model.startEngine();
    }

    public void stopEngine() {
        
        model.stopEngine();
    }

    public void brake(int amount){
       model.brake(amount);
    }

    public void liftBedButton() {
        model.liftBedButton();}

    public void lowerBedButton() {
        model.lowerBedButton();
    }

    public void turboOn() {
        model.turboOn();
    }

    public void turboOff() {
        model.turboOff();
    }

}