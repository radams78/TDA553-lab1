package Buttons;

import java.util.List;

import javax.swing.JButton;
import Model.Vehicle;
import Spinners.GasSpinner;



public class GasButton extends JButton {

    
    public GasButton(List<Vehicle> vehicles, GasSpinner gasSpinner){
        super("Gas");
  
        addActionListener(e -> {
            
            for (Vehicle vehicle : vehicles) {
                try {
                    vehicle.gas(((double) gasSpinner.getGasValue()) / 100);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
   

}
