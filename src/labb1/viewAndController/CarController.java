
import javax.swing.*;
import java.awt.*;

import labb1.Car;
import labb1.CarsModel;
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

    public CarController(CarsModel model, CarView view) {
        this.model = model;
        this.view = view;
        this.controlPanel = view.getControlPanel();

    }

    

    // A list of cars, modify if needed
    ArrayList<Vehicle> cars = new ArrayList<>();
    ArrayList<Saab95> turbocars = new ArrayList<>();
    ArrayList<Truck> trucks = new ArrayList<>();

    JButton gasButton = new JButton("Gas");
    JButton brakeButton = new JButton("Brake");
    JButton turboOnButton = new JButton("Saab Turbo on");
    JButton turboOffButton = new JButton("Saab Turbo off");
    JButton liftBedButton = new JButton("Scania Lift Bed");
    JButton lowerBedButton = new JButton("Lower Lift Bed");

    JButton startButton = new JButton("Start all cars");
    JButton stopButton = new JButton("Stop all cars");

    controlPanel.add(controlPanel);
    controlPanel.add(gasButton, 0);
    controlPanel.add(turboOnButton, 1);
    controlPanel.add(liftBedButton, 2);
    controlPanel.add(brakeButton, 3);
    controlPanel.add(turboOffButton, 4);

    startButton.setBackground(Color.blue);
    startButton.setForeground(Color.green);
    startButton.setPreferredSize(new Dimension(X / 5 - 15, 200));
    view.add(startButton);

    stopButton.setBackground(Color.red);
    stopButton.setForeground(Color.black);
    stopButton.setPreferredSize(new Dimension(X / 5 - 15, 200));
    view.add(stopButton);

      // To controller
    gasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
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

    // turboOnButton.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         carC.turnOnTurbo();
    //     }
    // });
    // turboOffButton.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         carC.turnOffTurbo();
    //     }
    // });

    // lowerBedButton.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         carC.lowerBed();
    //     }
    // });

    // liftBedButton.addActionListener(new ActionListener() {
    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         carC.raiseBed();
    //     }
    // });

}

    /*
     * Each step the TimerListener moves all the cars in the list and tells the
     * view to update its images. Change this method to your needs.
     */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.update();
            for (Vehicle car : cars) {
                car.move();
                int x = (int) Math.round(car.getX());
                int y = (int) Math.round(car.getY());
                frame.drawPanel.moveit(x, y);
                // repaint() calls the paintComponent method of the panel
                // This shouldnt be here
                frame.drawPanel.repaint();
            }
        }

    }

    // really ugly and doesnt follow open closed principle. Remake?? Might need
    // refactoring or maybe not
    void turnOnTurbo() {
        int i = 0;
        for (Saab95 car : turbocars) {
            car.setTurboOn();
        }
    }

    // this ones really ugly too
    void turnOffTurbo() {
        int i = 0;
        for (Saab95 car : turbocars) {
            car.setTurboOff();
        }
    }

    void lowerBed() {
        for (Truck truck : trucks) {
            truck.extendPlatform();
        }
    }

    void raiseBed() {
        for (Truck truck : trucks) {
            truck.retractPlatform();
        }
    }

}
