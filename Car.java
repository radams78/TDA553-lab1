import java.awt.*;

public class Car implements Movable{
    
    private int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private String modelName;

    private int x, y; // Coordinates for car

    private Direction direction; // Which direction is the car facing?

    public enum Direction {
        NORTH(0),
        EAST(1),
        SOUTH(2),
        WEST(3);
        private int value;
        private Direction(int value){
            this.value = value;
        }
        public int getValue(int value){
            return this.value;
        }
    }

    public Car(String modelName, Color color, double enginePower, int nrDoors){
        this.modelName = modelName;
        this.enginePower = enginePower;        
        this.color = color;
        this.nrDoors = nrDoors;
        this.stopEngine();
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

    public void stopEngine(){
        this.currentSpeed = 0;
    }

    public int getNrDoors(){
        return this.nrDoors;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return this.enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelName() {
        return this.modelName;
    }

    public double speedFactor(){
        return (this.enginePower * 0.01);
    }

    public void incrementSpeed(double amount){
	    this.setCurrentSpeed((Math.min(getCurrentSpeed() + speedFactor() * amount, this.getEnginePower())));
    }

    public void decrementSpeed(double amount){
        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }

    @Override
    public void turnLeft() {
        this.direction
    }

    @Override
    public void turnRight() {

    }

    @Override
    public void move(){
        this.y += this.currentSpeed;
    }
}
