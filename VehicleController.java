import javax.swing.*;
import Model.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.List;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController{
    
    private final int delay = 50;
   
    private Timer timer = new Timer(delay, new TimerListener());

    private VehicleView frame;

    private List<Truck> trucks;
    private List<TurboCar> turboCars;
    private List<Vehicle> vehicles;

    
    public List<Truck> getTrucks() {
        return trucks;
    }

    public List<TurboCar> getTurboCars() {
        return turboCars;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }


    public VehicleController(List<Truck> trucks, List<TurboCar> turboCars, 
                            List<Vehicle> vehicles){

        this.trucks = trucks;
        this.vehicles = vehicles;
        this.turboCars = turboCars;

        this.frame = new VehicleView("Vehiclesim 1.0", this);
    }
    
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            for (Vehicle vehicle : getVehicles()) {
                vehicle.move();
                
                int x = (int) Math.round(vehicle.getX());
                int y = (int) Math.round(vehicle.getY());
                frame.moveit(getVehicles().indexOf(vehicle), x, y);
            
                frame.repaint();
            }
        }
    }

    public void start(){
        timer.start();
    }
  

}