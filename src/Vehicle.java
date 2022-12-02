package src;
import java.awt.*;

public abstract class Vehicle extends HasPosition implements Movable {

    // KANSKE SKA TA BORT private Boolean isLoadable; // True if the vehicle can be loaded
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
        // KANSKE SKA TA BORT this.isLoadable = isLoadable;
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
        //this.pickupRectangle.x = (int)getX();
        //this.pickupRectangle.y = (int)getY();

    }

    public void incrementSpeed(double amount){
        if (getCurrentSpeed() < getEnginePower()) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() *amount);
            }
        else {
            setCurrentSpeed(getEnginePower());
        }
    }

    public void decrementSpeed(double amount) {
        if(getCurrentSpeed() >= 0){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }
        else{
            setCurrentSpeed(0);
        }
    }

    public double speedFactor(){
        return 1.0;
    }

    public void setCurrentSpeed(double newSpeed){
        this.currentSpeed = newSpeed;
    }

    /*  KANSKE SKA TA BORT
    public Boolean getIsLoadableBoolean() {
        return isLoadable;
    }
    */

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