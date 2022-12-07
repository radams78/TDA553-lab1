package labb1.viewAndController;

import javax.swing.*;
import java.awt.*;

import labb1.Car;
import labb1.Saab95;
import labb1.Scania;
import labb1.Truck;
import labb1.Vehicle;
import labb1.Volvo240;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

//this does a bit too much for a controller
public class CarController {
    // The frame that represents this instance View of the MVC pattern
    CarsModel model;
    CarView view;
    JPanel controlPanel;

    JButton gasButton = new JButton("Gas");
    JButton brakeButton = new JButton("Brake");
    JButton turboOnButton = new JButton("Saab Turbo on");
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");

    public CarController(CarsModel model, CarView view) {
        this.model = model;
        this.view = view;
        this.controlPanel = view.getControlPanel();

        // controlPanel.add(controlPanel);
        controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);

        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(view.getPreferredButtonSize());
        view.add(startButton);

        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(view.getPreferredButtonSize());
        view.add(stopButton);

        // To controller
        gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO MAke this work better
                model.gas();
            }
        });
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.stopEngine();
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.startEngine();
            }
        });
    }
}

// --------------TODO
// turboOnButton.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// carC.turnOnTurbo();
// }
// });
// turboOffButton.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// carC.turnOffTurbo();
// }
// });

// lowerBedButton.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// carC.lowerBed();
// }
// });

// liftBedButton.addActionListener(new ActionListener() {
// @Override
// public void actionPerformed(ActionEvent e) {
// carC.raiseBed();
// }
// });