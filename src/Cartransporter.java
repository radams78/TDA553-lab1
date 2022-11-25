import java.awt.*;
import java.util.*;

public class Cartransporter extends Flatbed{
static private final int MAX_CAPACITY = 6;
ArrayList<Car> loadedCars;

    public Cartransporter(){
        super(2,70, Color.yellow, "Cartransporter");
            flatbedFastened = true;
            loadedCars = new ArrayList<Car>();
        }
    
    public int getAmountOfLoadedCars() {
        return loadedCars.size();
    }

    public void loadCar(Car car){
        if(loadedCars.size() < MAX_CAPACITY && distanceToCar(car) < 15){
            loadedCars.add(car);
            }
        }

    public void unloadLatestCar(){
        Car carToUnload = loadedCars.get(loadedCars.size() - 1);
        int index = loadedCars.size() - 1;
        loadedCars.remove(index);
        carToUnload.setY(this.getY()+10);
    }

    public double distanceToCar(Car car){
        double yDiff = Math.pow(Math.abs(this.getY() - car.getY()),2);
        double xDiff = Math.pow(Math.abs(this.getX() - car.getX()),2);
        double dist = Math.sqrt(xDiff+yDiff);
        return dist;
    }


    }