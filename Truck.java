import java.awt.Color;

public abstract class Truck extends Vehicle{

    private Plattform plattform;
    private boolean ableToMove;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y, Plattform 
    plattformType) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
        
        plattform = plattformType;

    }

    public void setAbleToMove(Boolean ableToMove) {
        this.ableToMove = ableToMove;
    }

    @Override
    public void move() {
        if (!ableToMove){
            System.out.println("Cant drive with the current state of the plattform");
        }
        else{
        startEngine();
        direction();    
        }
    }
    
}
