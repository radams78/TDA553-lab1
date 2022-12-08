package labb1.viewAndController;

import labb1.Car;
import labb1.Truck;
import labb1.Vehicle;

import java.util.ArrayList;
import java.util.List;


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
       
        while (true) {

            update();

            //TODO make this into a separate method
            try {
                Thread.sleep(GraphicsDependencies.getFrameTime());
            } catch (InterruptedException e) {
                System.out.println("Clock Interrupted");
                System.out.println(e);
            }
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void update() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getCurrentSpeedX() > 0 || vehicle.getCurrentSpeedY() > 0){
                vehicle.move();
                notifyObservers();
            }
        }
      
    }

    public ArrayList<Vehicle> getVehicles() {
        //Defensive copying
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

    public void brake(double amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle car : vehicles) {
            car.brake(gas);
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


    public void turnOnTurbo(){
        for (Vehicle car : vehicles){
            try{
                car.setTurboOn();
            }catch (IllegalArgumentException e){
                System.out.println(e);
            }
        }
    }
    //TODO make more method listeners from the controller

}

