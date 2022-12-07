package labb1.viewAndController;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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

    private static final int X = GraphicsDependencies.getX();
    private static final int Y = GraphicsDependencies.getY();
    // The frame that represents this instance View of the MVC pattern
    private CarsModel model;
    private CarView view;

    private JSpinner gasSpinner = new JSpinner();
    private double gasAmount = 0;

    private JPanel controlPanel = new JPanel();

    private JPanel gasPanel = new JPanel();
    private JLabel gasLabel = new JLabel("Amount of gas");

    private JButton gasButton = new JButton("Gas");
    private JButton brakeButton = new JButton("Brake");
    private JButton turboOnButton = new JButton("Saab Turbo on");
    private JButton turboOffButton = new JButton("Saab Turbo off");
    private JButton liftBedButton = new JButton("Scania Lift Bed");
    private JButton lowerBedButton = new JButton("Lower Lift Bed");

    private JButton startButton = new JButton("Start all cars");
    private JButton stopButton = new JButton("Stop all cars");

    public CarController(CarsModel model, CarView view) {
        this.model = model;
        this.view = view;
        initControlPanel();
        initGasPanel();
        view.add(controlPanel);
        view.add(gasPanel);
        addButtons();
        addListeners();
        addSpinner();

    }

    private void addButtons() {
        // controlPanel.add(controlPanel);
        this.controlPanel.add(gasButton, 0);
        controlPanel.add(turboOnButton, 1);
        controlPanel.add(liftBedButton, 2);
        controlPanel.add(brakeButton, 3);
        controlPanel.add(turboOffButton, 4);

        startButton.setBackground(Color.blue);
        startButton.setForeground(Color.green);
        startButton.setPreferredSize(view.getPreferredButtonSize());
        controlPanel.add(startButton);

        stopButton.setBackground(Color.red);
        stopButton.setForeground(Color.black);
        stopButton.setPreferredSize(view.getPreferredButtonSize());
        controlPanel.add(stopButton);

    }

    private void initControlPanel() {
        controlPanel.setLayout(new GridLayout(2, 4));
        controlPanel.setPreferredSize(new Dimension((X / 2) + 4, 200));
        controlPanel.setBackground(Color.CYAN);
        view.add(controlPanel);
    }

    private void initGasPanel() {
        gasPanel.setLayout(new BorderLayout());
        gasPanel.add(gasLabel, BorderLayout.PAGE_START);
        view.add(gasPanel);
    }

    private void addSpinner() {
        SpinnerModel spinnerModel = new SpinnerNumberModel(0, // initial value
                0, // min
                100, // max
                1);// step
        gasSpinner = new JSpinner(spinnerModel);
        gasPanel.add(gasSpinner);
    }

    private void addListeners() {

        gasSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                gasAmount = (int) ((JSpinner) e.getSource()).getValue();
            }
        });

        gasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO MAke this work better
                model.gas(gasAmount);
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