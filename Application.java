import java.util.ArrayList;

import Model.Car;

import Model.Saab95;
import Model.Scania;
import Model.Truck;
import Model.TurboCar;

import Model.Vehicle;
import Model.Volvo240;


public class Application {
    
    public static void main(String[] args) {

        Car volvo = new Volvo240();
        TurboCar saab = new Saab95();
        Truck scania = new Scania();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(volvo);
        vehicles.add(saab);
        vehicles.add(scania);

        ArrayList<TurboCar> turboTypes = new ArrayList<>();
        turboTypes.add(saab);

        ArrayList<Truck> trucks = new ArrayList<>();
        trucks.add(scania);
        
        VehicleController cc = new VehicleController(trucks, turboTypes, vehicles);
       
        cc.start();
    }
}
