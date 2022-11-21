
import java.awt.*;

public abstract class Car implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private int xPos; // startposition x värdet 
    private int yPos; // startposition y värdet
    private Direction cardirection; //the car's current direction


  

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int xPos, int yPos, Direction cardirection){
    this.nrDoors = nrDoors; // Number of doors on the car
    this.enginePower= enginePower; // Engine power of the car
    this.currentSpeed = currentSpeed; // The current speed of the car
    this.color = color; // Color of the car
    this.modelName = modelName; // The car model name
    this.xPos=xPos;     //the car's x position
    this.yPos=yPos;     //the car's y position
    this.cardirection=cardirection; //startvärdet
    }


    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) throws Exception{
        this.currentSpeed = currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }

    public String getmodelName(){
        return modelName;
    }

    public int getxPos(){
        return xPos;
    }
    public int getyPos(){
        return yPos;
    }
    
    public void gas(double amount) throws Exception{
     if (amount >=  0  && amount <= 1){         //gas only accepts values in the interval [0,1]
        incrementSpeed(amount);
    }else{                                      //else error message
      throw new Exception("the amount is not in the interval");  
    }
    }

    public void incrementSpeed(double amount){  //the min and max speed interval while gasing
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
    }


    public void brake(double amount) throws Exception{
        if (amount >=  0  && amount <= 1){          //brake only accepts values in the interval [0,1]
            decrementSpeed(amount);
        }else{                                       //else error message
          throw new Exception("the amount is not in the interval");
        }

        }
    public void decrementSpeed(double amount){  //the max and min speed interval while braking
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

    public Direction cardirection(){
        return cardirection;
    }

    protected abstract double speedFactor();

    @Override
    public void move(){
        if (cardirection== Direction.NORTH) {
            yPos -=1;
        }else if(cardirection== Direction.SOUTH){
            yPos+=1; 
        }else if(cardirection== Direction.WEST){
            xPos+=1;
        }else if(cardirection== Direction.EAST){
            xPos-=1;
        }
        
    }
    public void turnLeft(){
        if (cardirection == Direction.NORTH){
            cardirection = Direction.WEST;
        }else if (cardirection == Direction.WEST){
            cardirection = Direction.SOUTH;
        }else if (cardirection== Direction.SOUTH){
            cardirection= Direction.EAST;
        }else if (cardirection== Direction.EAST){
            cardirection= Direction.NORTH;
        }
    }
    public void turnRight(){
        if(cardirection== Direction.NORTH){
            cardirection=Direction.EAST;
        }else if(cardirection==Direction.EAST){
            cardirection=Direction.SOUTH;
        }else if (cardirection== Direction.SOUTH){
            cardirection= Direction.WEST;
        }else if (cardirection== Direction.WEST){
            cardirection= Direction.NORTH;
        }
        

}

}
