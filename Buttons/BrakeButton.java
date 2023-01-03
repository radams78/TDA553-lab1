package Buttons;

import java.util.List;

import javax.swing.*;

import Model.Vehicle;
import Spinners.GasSpinner;


public class BrakeButton extends JButton{


    public BrakeButton(List<Vehicle> vehicles, GasSpinner gasSpinner){
        super("Brake");
       
        addActionListener(e -> {
            for (Vehicle vehicle : vehicles) {
                try {
                    vehicle.brake(((double) gasSpinner.getGasValue()) / 100);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
   
 
}
