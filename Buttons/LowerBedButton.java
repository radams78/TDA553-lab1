package Buttons;

import java.util.List;

import javax.swing.JButton;

import Model.Truck;

public class LowerBedButton extends JButton {

    public LowerBedButton(List<Truck> trucks) {
        super("Lower Lift Bed");
        addActionListener(e -> {
            for (Truck truck : trucks) {
                    truck.platfromDown(10);
            }
        });
        
    }

   
}
