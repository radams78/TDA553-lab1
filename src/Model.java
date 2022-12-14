package src;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import src.carModel.Car;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Model {

    // member fields:
    private ArrayList<IObserver> observers = new ArrayList<IObserver>();

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the
    // statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    Controller currentController;

    // A list of cars, modify if needed
    private List<Car> cars = new ArrayList<>();

    public Model(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car carToAdd) {
        cars.add(carToAdd);
    }

    // methods:
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car car : cars) {
                car.move();
                // repaint() calls the paintComponent method of the view
            }
            //currentController.currentView.repaint();
            updateObservers();
        }
    }
    public ArrayList<Car> getCars() {
        return new ArrayList<>(cars);
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : cars) {
            car.gas(gas);
        }
    }

    public void start() {
        timer.start();
    }

    private void updateObservers() {
        for (IObserver o: observers) {
            o.update();
        }
    }
}
