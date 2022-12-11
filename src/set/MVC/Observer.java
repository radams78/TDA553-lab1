package set.MVC;

import java.util.ArrayList;

import set.MVC.Model.Vehicles;

public interface Observer {
    public void updateVehiclesList(ArrayList<Vehicles> vehicles);
}
