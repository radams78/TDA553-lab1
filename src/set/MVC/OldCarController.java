// --- Package --- //

package set.MVC;
/* 
// --- Imports --- //

import javax.swing.*;

import org.junit.jupiter.api.function.ThrowingSupplier;
import org.junit.jupiter.params.provider.EnumSource.Mode;

import set.MVC.Model.ModelHead;
import set.MVC.Model.Saab95;
import set.MVC.Model.Scania;
import set.MVC.Model.Vehicles;
import set.MVC.Model.Volvo240;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.


 // --- Class --- //

public class CarController implements Observer{

    // member fields:

    

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of cars, modify if needed
    ArrayList<Vehicles> vehicles;
    ModelHead modelHead;
    
    public CarController(ModelHead modelhead){
        this.modelHead = modelhead;
    }
    public void updateVehiclesList(ArrayList<Vehicles> vehicles){
        this.vehicles = vehicles;
    }

    //methods:
*/
    

    /* Each step the TimerListener moves all the cars in the list and tells the
    * view to update its images. Change this method to your needs.
    * 
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicles vehicle : vehicles) {
                
                vehicle.move();
                System.out.println(vehicle.getCurrentSpeed());
                System.out.println(vehicle);
                int x = (int) Math.round(vehicle.getXPosition());
                int y = (int) Math.round(vehicle.getYPosition());
                
                // VERY BAD CODE BUT I ONLY WANT THE FIRST PART TO WORK BEFORE WE REFACTOR
                // Does not follow the openclosed principle, would need to add new code to paint another type of vehicle
               
            }
            
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        modelHead.gasVehicles(amount);
    }
    void startEngine(){
        modelHead.startEngines();
    }
    
    void stopEngine(){
        modelHead.stopEngines();
    }
    
}
*/