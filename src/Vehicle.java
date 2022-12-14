package src;
import java.awt.*;

public abstract class Vehicle extends HasPosition implements Movable {

	private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed = 0; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double turnRightNegative = -1; // To turn right
    private double turnLeftPositive = 1; // To turn left


    public Vehicle(int nrDoors, double enginePower, Color color, String modelName, double xCoordinate, double yCoordinate, boolean isLoadable) {
        super(xCoordinate, yCoordinate);
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
    }

    @Override
    public void turnLeft() {
        setCurrentDirectionRadian(turnLeftPositive);
    }

    @Override
    public void turnRight() {
        setCurrentDirectionRadian(turnRightNegative);
    }


    // Move-method updates to coordinates for the vehicle and its "hitbox"
    @Override
    public void move() {
        updateCoordinate();

    }

    private void incrementSpeed(double amount){
        if (getCurrentSpeed() < getEnginePower()) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() *amount);
            setCurrentDirection(getCurrentSpeed());
            }
        else {
            setCurrentSpeed(getEnginePower());
            setCurrentDirection(getCurrentSpeed());
        }
    }

    private void decrementSpeed(double amount) {
        if(getCurrentSpeed() >= 0){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        setCurrentDirection(getCurrentSpeed());

        }
        else{
            setCurrentSpeed(0);
            setCurrentDirection(getCurrentSpeed());
        }
    }

    public double speedFactor(){
        return 1.0;
    }

    public void setCurrentSpeed(double newSpeed){
        this.currentSpeed = newSpeed;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }
    
    public void gas(double amount) {
        if(0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        }
    }
    public void brake(double amount) {
        if(0 <= amount && amount <= 1){
            decrementSpeed(amount);
        }
    }

    public boolean isVehicleCurrentSpeedZero(){
        if(this.currentSpeed == 0.0){
            return true;
        }
        else return false;
    }

    // framtidens bekymmer nedan
    public void setColor(Color clr) {
        color = clr;
    }

    public Color getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public int getNrDoors() {
        return nrDoors;
    }
}