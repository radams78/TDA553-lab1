import java.util.ArrayDeque;

public class CarLoad{
    
    private ArrayDeque<Car> cars;
    private int capacity;
  

    public CarLoad(int capacity){
        cars = new ArrayDeque<Car>();
        this.capacity = capacity;
        
    }

    public ArrayDeque<Car> getCars() {
        return cars;
    }

    
    public int getCapacity() {
        return capacity;
    }

    
    public void load(double x, double y, Car c) {
        
        if(x <= c.getX() && c.getX() <= (x+2) && y <= c.getY() && c.getY() <= (y+2)
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

    
    public void unload(double x, double y) {
        Car c = cars.pop();
        c.setX((x+1));
        c.setY(y+1);
        
    }

    
}
