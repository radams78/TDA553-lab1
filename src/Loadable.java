import java.util.*;


public class Loadable {
    private int capacity;
    ArrayList<Car> loadedCars;
    public Loadable(int nr){
        capacity = nr;
        loadedCars = new ArrayList<Car>();
    }
    public int getAmountOfLoadedCars() {
        return loadedCars.size();
    }

    public void loadCar(Car car, Car other){
        if(loadedCars.size() < capacity && distanceToCar(car, other) < 15){
            loadedCars.add(car);
            }
        }

    public void unloadLatestCar(Car other){
        Car carToUnload = loadedCars.get(loadedCars.size() - 1);
        int index = loadedCars.size() - 1;
        loadedCars.remove(index);
        carToUnload.setY(other.getY()+5);
        carToUnload.setX(other.getX()+5);
    }

    public double distanceToCar(Car car, Car other){
        double yDiff = Math.pow(Math.abs(other.getY() - car.getY()),2);
        double xDiff = Math.pow(Math.abs(other.getX() - car.getX()),2);
        double dist = Math.sqrt(xDiff+yDiff);
        return dist;
    }

    
}
