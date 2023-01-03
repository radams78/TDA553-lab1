package Buttons;

import java.util.List;

import javax.swing.JButton;

import java.awt.*;


import Model.Vehicle;

public class StopButton extends JButton {

    public StopButton(List<Vehicle> vehicles) {
        super("Stop all cars");
        addActionListener(e -> {
            for (Vehicle vehicle : vehicles) {
                    vehicle.stopEngine();
            }
        });

        setBackground(Color.red);
        setForeground(Color.black);
        setPreferredSize(new Dimension(800/5-15,200));
   
    }

}
