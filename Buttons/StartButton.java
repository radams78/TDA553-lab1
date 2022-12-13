package Buttons;

import java.util.List;

import javax.swing.JButton;

import java.awt.*;


import Model.Vehicle;


public class StartButton extends JButton{

    public StartButton(List<Vehicle> vehicles) {
        super("Start all cars");
        addActionListener(e -> {
            for (Vehicle vehicle : vehicles) {
                    vehicle.startEngine();
            }
        });

        setBackground(Color.blue);
        setForeground(Color.green);
        setPreferredSize(new Dimension(800/5-15,200));
    }


    
}   
