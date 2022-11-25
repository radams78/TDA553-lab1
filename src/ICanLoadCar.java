package src;

import java.util.ArrayList;

public interface ICanLoadCar {
    
    void loadCar(Vehicle car);

    void unloadCar(Vehicle car);

    void loadableVehiclesInCloseVicinity(ArrayList<Vehicle> listOfVehicle);
}
