package set.MVC.Model;
import java.awt.Color;

import java.util.ArrayList;



import set.MVC.Observer;



public class ModelHead {
    ArrayList<Vehicles> vehicles = new ArrayList<>();
    CarFactory factory = new CarFactory();
    ArrayList<Observer> observers = new ArrayList<>();
    
    public ModelHead(){
        
    }
    public void createScania(){
        vehicles.add(factory.createScania(2, Color.black, 100, "null", 70));
    }
    public void createSaab(){
        vehicles.add(factory.createSaab(4, Color.black, 100, "null"));
    }
    public void createVolvo(){
        vehicles.add(factory.createVolvo(4, Color.black, 100, "null"));
    }
    public ArrayList<Vehicles> getVehicleList(){
        return vehicles;
    }
    public void addToObservers(Observer o){
        observers.add(o);
    }
    public void createStandardModel(){
        vehicles.clear();
        createScania();
        createSaab();
        createVolvo();
    }
    public void sendObserverSignal(){
        for (Observer observer : observers){
            observer.updateVehiclesList(vehicles);
        }
    }

    

    public void gasVehicles(int amount){
        Double gas = ((double) amount) / 100;
        for (Vehicles vehicle : vehicles){
            vehicle.gas(gas);
        }
    }
    public void brakeVehicles(int amount){
        Double gas = ((double) amount) / 100;
        for (Vehicles vehicle : vehicles){
            vehicle.brake(gas);
        }
    }
    public void startEngines(){
        for (Vehicles vehicle : vehicles){
            vehicle.startEngine();
        }
    }
    public void stopEngines(){
        for (Vehicles vehicle : vehicles){
            vehicle.stopEngine();
        }
    }
    public void moveVehicles(){
        for (Vehicles vehicle : vehicles){
            vehicle.move();
        }
    }

    public void run(){
        while (true){
            sendObserverSignal();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                
                System.out.println("Not work");
            }
        }
    }
    
    /*
    public void turnTurboOn(){
        for (Vehicles vehicle : vehicles){
            if (vehicle instanceof Saab95){
                
                
            }
        }
    }
    public void turnTurboOff(){
        for (Vehicles vehicle : vehicles){
            if (vehicle instanceof Saab95){
                
            }
        }
    }
    public void liftScaniaBed(){
        for (Vehicles vehicle : vehicles){
            if (vehicle instanceof Scania){
                
            }
        }
    }
    public void lowerScaniaBed(){
        for (Vehicles vehicle : vehicles){
            if (vehicle instanceof Scania){
                
            }
        }
    } */
}
