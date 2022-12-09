
import java.util.ArrayList;

import Model.*;

public class VehicleModel {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //methods:


    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }


    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

 
    // Calls the gas method for each car once
    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            try {
                vehicle.gas(gas);
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
    }

    public void startEngine() {

        for (Vehicle vehicle : vehicles){
            
            vehicle.startEngine();
        }
    }

    public void stopEngine() {
        
        for (Vehicle vehicle : vehicles){
            
            vehicle.stopEngine();

        }
    }

    public void brake(int amount){
        double brake = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles){
            
            try {
                vehicle.brake(brake);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void liftBedButton() {
        for (Vehicle vehicle : vehicles){
            if (vehicle instanceof Scania) {
                Scania scania = (Scania) vehicle;
                scania.platformUp(10);
            }
                
    }}

    public void lowerBedButton() {
        for (Vehicle vehicle : vehicles){
            if (vehicle instanceof Scania) {
                Scania scania = (Scania) vehicle;
                scania.platfromDown(10);
            }
                  
    }}

    public void turboOn() {
        for (Vehicle vehicle : vehicles){
            if (vehicle instanceof Saab95) {
                Saab95 saab = (Saab95) vehicle;
                saab.setTurboOn();
            }
    }
    }

    public void turboOff() {
        for (Vehicle vehicle : vehicles){
            if (vehicle instanceof Saab95) {
                Saab95 saab = (Saab95) vehicle;
                saab.setTurboOff();
            }
    }
    }

}
