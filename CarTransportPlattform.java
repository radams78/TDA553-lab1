import java.util.LinkedList;

public class CarTransportPlattform implements Plattform{

    private Boolean ableToLoad;
    private int capacity;
    private LinkedList<Car> cars;
    
    public CarTransportPlattform(int capacity){

        this.capacity = capacity;
    }

    @Override
    public void plattformUp(int state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void plattfromDown(int state) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setPlattformState(int plattformState) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getPlattformState() {
        // TODO Auto-generated method stub
        return 0;
    }

}