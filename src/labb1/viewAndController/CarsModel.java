package labb1.viewAndController;

import labb1.Car;
import labb1.Truck;
import labb1.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarsModel {
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    ArrayList<Car> cars;
    ArrayList<Truck> trucks;
    List<Observer> observers = new ArrayList<Observer>();

    public CarsModel(ArrayList<Truck> trucks, ArrayList<Car> cars) {
        this.trucks = trucks;
        this.cars = cars;
        this.vehicles.addAll(cars);
        this.vehicles.addAll(trucks);
    }

    public void start() {
        // TODO make this slower
        while (true) {
            update();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void update() {
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public ArrayList<Vehicle> getVehicles() {
        ArrayList<Vehicle> copy = new ArrayList<Vehicle>(this.vehicles);

        return copy;
    }

    // Calls the gas method for each car once
    public void gas(double amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : vehicles) {
            car.gas(gas);
        }
    }

    public void stopEngine() {
        for (Vehicle car : vehicles) {
            car.stopEngine();
        }
    }

    public void startEngine() {
        for (Vehicle car : vehicles) {
            car.startEngine();
        }
    }

}

// class TimerListener implements ActionListener {
// public void actionPerformed(ActionEvent e) {
// update();
// }
// }
