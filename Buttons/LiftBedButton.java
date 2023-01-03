package Buttons;

import java.util.List;

import javax.swing.JButton;


import Model.Truck;


public class LiftBedButton extends JButton {

    public LiftBedButton(List<Truck> trucks) {
        super("Scania Lift Bed");
        addActionListener(e -> {
            for (Truck truck : trucks) {
                    truck.platformUp(10);
            }
        });

    }

    
}
