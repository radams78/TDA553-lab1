import java.awt.*;

public abstract class Car implements Movable{
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private int xPos; // startposition x värdet 
    private int yPos; // startposition y värdet
    private direction cardirection;


  

    public Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int xPos, int yPos, direction cardirection){
    this.nrDoors = nrDoors; // Number of doors on the car
    this.enginePower= enginePower; // Engine power of the car
    this.currentSpeed = currentSpeed; // The current speed of the car
    this.color = color; // Color of the car
    this.modelName = modelName; // The car model name
    this.xPos=xPos;
    this.yPos=yPos;
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

    public void setCurrentSpeed(double currentSpeed){
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
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    public abstract void incrementSpeed(double amount);


    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
    public abstract void decrementSpeed(double amount);

    public direction cardirection(){
        return cardirection;

    }

    //public direction setdirection(){
     //   return user.direction; // user direction är något som behövs senare 
    //}
   
    @Override
    public void move(){
        if (cardirection== direction.NORTH) {
            yPos -=1;
        }else if(cardirection== direction.SOUTH){
            yPos+=1;  ///Minskar/ ökar den? 
        }else if(cardirection== direction.WEST){
            xPos+=1;
        }else if(cardirection== direction.EAST){
            xPos-=1;
        }
        
    }
    public void turnLeft(){
        if (cardirection == direction.NORTH){
            cardirection = direction.WEST;
        }else if (cardirection == direction.WEST){
            cardirection = direction.SOUTH;
        }else if (cardirection== direction.SOUTH){
            cardirection= direction.EAST;
        }else if (cardirection== direction.EAST){
            cardirection= direction.NORTH;
        }
    }
    public void turnRight(){
        if(cardirection== direction.NORTH){
            cardirection=direction.EAST;
        }else if(cardirection==direction.EAST){
            cardirection=direction.SOUTH;
        }else if (cardirection== direction.SOUTH){
            cardirection= direction.WEST;
        }else if (cardirection== direction.WEST){
            cardirection= direction.NORTH;
        }
        

}

}
