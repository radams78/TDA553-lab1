import java.awt.*;



abstract class Car implements Movable{
    private int nrDoors;
    private double enginePower;
    private double currentSpeed;
    private Color color;
    private String modelName;
    private double x;
    private double y;

    private int[][] directionList = {{0,1},{1,0},{0,-1},{-1,0}};
    private int index = 0;
    

    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = 120.0;
        this.color = color;
        this.modelName = modelName;
        this.x = 0;
        this.y = 0;
    }
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }
    public String getModelName() {
        return modelName;
    }
    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public double speedFactor(){
        return 0;
    }
    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }
    public void incrementSpeed(double amount){
        if (this.getCurrentSpeed() <= this.getEnginePower()){
            currentSpeed = getCurrentSpeed() + speedFactor() * amount;
        }
    }

    public void decrementSpeed(double amount){
        if (this.getCurrentSpeed() > 0){
            currentSpeed = getCurrentSpeed() - speedFactor() * amount;
        }
    }

    


    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount <= 1 && amount <= 0){
            incrementSpeed(amount);
        }
        else{
            throw new IllegalArgumentException("Amount should be in the range 0-1.");
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount <= 1 && amount <= 0){
            decrementSpeed(amount);
        }
        else{
            throw new IllegalArgumentException("Amount should be in the range 0-1.");
        }
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }


    public void turnLeft(){
        index -= 1;
        if (index < 0){
            index = 3;
        }
    }

    public void turnRight(){
        index += 1;
        if (index > 3){
            index = 0;
        }
    }

    public void move(){
        double new_x = getX() + currentSpeed * directionList[index][0];
        this.setX(new_x);
        double new_y = getY() + currentSpeed * directionList[index][1];
        this.setY( new_y);
    }
}


