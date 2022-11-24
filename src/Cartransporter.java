import java.awt.*;
import java.util.*;

public class Cartransporter extends Flatbed{
static private final int MAX_CAPACITY = 6;
ArrayList<Car> loadedCars;

    public Cartransporter(int nrDoors, double enginePower, Color color, String modelName){
            super(nrDoors, enginePower,color, modelName);
            flatbedFastened = true;
            loadedCars = new ArrayList<Car>();
        }
    
    public void loadCar(Car car){
        if(loadedCars.size() < MAX_CAPACITY){
            loadedCars.add(car);
            }
        }
    public void unloadCar(){


    }


    }