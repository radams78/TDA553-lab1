import java.util.ArrayList;
import java.util.List;

public class VehicleModel {

    private List<Vehicle> vehicles;


    public VehicleModel(){

        this.vehicles = new ArrayList<>();
    }
    
    public void addVehicle(Vehicle vehicle){

        vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void moveit(Vehicle vehicle, double x, double y){
        vehicle.setX(x);;
        vehicle.setY(y);
    }

    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles
                ) {
            try {
                vehicle.gas(gas);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
