import java.util.ArrayDeque;

public class LoadFunktion {
    
    private ArrayDeque<Car> cars;
    private int capacity;

    public LoadFunktion(int capacity){
        cars = new ArrayDeque<Car>();
        this.capacity = capacity;
    }

    public ArrayDeque<Car> getCars() {
        return cars;
    }

    public int getCapacity() {
        return capacity;
    }

    public void loadCar(Car c, double x, double y){
        if(x < c.getX() && c.getX() < (x+2) && y < c.getY() && c.getY() < (y+2)
        && cars.size() < capacity){
            cars.add(c);
        }
        else if (cars.size() + 1 > capacity){
            System.out.println("The load is full");
        }
        else {
            System.out.println("The car is not close enough to load");
        }
    } 

    void unloadCar(double x, double y){

        Car c = cars.pop();
        c.setX((x+1));
        c.setY(y+1);
    }


}
