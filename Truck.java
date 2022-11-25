import java.awt.Color;

public abstract class Truck extends Vehicle {

    private int plattformState;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);

        this.plattformState = 0;
    }

    abstract void plattformUp(int state);

    abstract void plattfromDown(int state);

    public int getPlattformState() {
        return plattformState;
    }

    public void setPlattformState(int plattformState){


        if (this.getCurrentSpeed() > 0){
            System.out.println("Cant change plattformstate while moving");
        }
        else{
        this.plattformState = plattformState;
        }
    }

    public void move() {
        if (this.getPlattformState() > 0){
            System.out.println("Cant drive while plattform i raised");
        }
        else{
        startEngine();
        direction();    
        }
    }
    
}
