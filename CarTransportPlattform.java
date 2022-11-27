import java.util.LinkedList;

public class CarTransportPlattform extends Plattform{

    private Boolean ableToLoad;
    private int capacity;
    private LinkedList<Car> cars;
    
    public CarTransportPlattform(int capacity){

        this.capacity = capacity;
    }

    @Override
    public void plattformUp(int state) {

        this.setPlattformState(1);
        this.ableToLoad = false;
    }

    @Override
    public void plattfromDown(int state) {

        this.setPlattformState(0);
        this.ableToLoad = true;
    }

    public Boolean getAbleToLoad() {
        return ableToLoad;
    }

    public int getCapacity() {
        return capacity;
    }

    public LinkedList<Car> getCars() {
        return cars;
    }

    @Override
    void setPlattformState(int plattformState) {
        if (plattformState > 1 || plattformState < 0){
            System.out.println("Only accepts values between 1 or 0");;
        }
        else {
            this.plattformState = plattformState;
        }
        
    }

}