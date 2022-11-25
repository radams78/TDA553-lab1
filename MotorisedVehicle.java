import java.awt.*;

public class MotorisedVehicle implements Movable {

    private Engine engine;
    private Body body;
    private double currentSpeed;

    private double x, y; // Coordinates

    private Direction direction; // Current direction

    public MotorisedVehicle(String modelName, Color color, double enginePower, int nrDoors) {
        this.engine = new Engine(enginePower);
        this.body = new Body(modelName, color, nrDoors);
        this.stopEngine();
        this.x = 0;
        this.y = 0;
        this.direction = Direction.NORTH;
    }

    //------------------------------------- Engine misc ----------------------------------------//
    public void startEngine() {
        this.setCurrentSpeed(0.1);
    }

    public void stopEngine() {
        this.currentSpeed = 0;
    }

    //------------------------------------- Getters ----------------------------------------//
    public int getNrDoors() {
        return this.body.getNrDoors();
    }

    public double getEnginePower() {
        return this.engine.getEnginePower();
    }
    
    public String getModelName() {
        return this.body.getModelName();
    }

    public double getCurrentSpeed() {
        return this.currentSpeed;
    }

    public Color getColor() {
        return this.body.getColor();
    }

    public double getXPos() { 
        return this.x;
    }

    public double getYPos() {
        return this.y;
    }

    public Direction getDirection() {
        return this.direction;
    }

   //------------------------------------- Setters----------------------------------------//
    public void setEnginePower(double enginePower) { // Might be unnecessary
        this.engine.setEnginePower(enginePower);
    }

    private void setCurrentSpeed(double amount) { // Input from increment- and decrementSpeed can't be outside range 0 - enginePower
        this.currentSpeed = amount;

    }

    public void setColor(Color color) { 
        this.body.setColor(color);
    }

    public void setXPos(double x) {
        this.x = x;
    }

    public void setYPos(double y) {
        this.y = y;
    }

    
     //------------------------------------- Handle speed ----------------------------------------//
    public double speedFactor() {
        return (this.getEnginePower() * 0.01);
    }

    private void incrementSpeed(double amount) { //Increse movementspeed of the vehicle
        this.setCurrentSpeed((Math.min(getCurrentSpeed() + speedFactor() * amount, this.getEnginePower())));
    }

    private void decrementSpeed(double amount) { // Lowers the speed of the vehicle, using the highest value when 
         this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0)); // comparing getCurrentSpeed() - speedFactor() * amount with 0
    }

    public void gas(double var1) {
        if (var1 >= 0 && var1 <= 1) { // Check that the input is between [0..1]. If > 1 then 1, if < 0 then 0 
            this.incrementSpeed(var1);
        } else if (var1 > 1) {
            this.incrementSpeed(1);
        } else {
            this.incrementSpeed(0);
        }
    }

    public void brake(double var1) { // Check that the input is between [0..1]. If > 1 then 1, if < 0 then 0 
        if (var1 >= 0 && var1 <= 1) {
            this.decrementSpeed(var1);
        } else if (var1 > 1) {
            this.decrementSpeed(1);
        } else {
            this.decrementSpeed(0);
        }
    }

     //------------------------------------- Direction and movement ----------------------------------------//

    public void turnLeft() {
        int dirValue = this.direction.getValue();
        this.direction = Direction.values()[((dirValue - 1) % 4)];
    }

    public void turnRight() {
        int dirValue = this.direction.getValue();
        this.direction = Direction.values()[(dirValue + 1) % 4];
    }
    
    //Moves the vehicle in the current direction
    public void move() {
        switch (this.direction) {
            case NORTH:
                this.y += this.currentSpeed;
                break;
            case EAST:
                this.x += this.currentSpeed;
                break;
            case SOUTH:
                this.y -= this.currentSpeed;
                break;
            case WEST:
                this.x -= this.currentSpeed;
                break;
        }
    }

}
