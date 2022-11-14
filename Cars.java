import java.awt.*;

public abstract class Cars implements Movable {
   
    protected int nrDoors;
    protected Color color;  
    protected double enginePower; 
    protected String modelName; 
    protected double currentSpeed;
    protected double xVelocity;
    protected double yVelocity;


    protected Cars(int nrDoors, Color color, double enginePower, String modelName, double currentSpeed, double xVelocity, double yVelocity){
    this.nrDoors = nrDoors;
    this.color = color;
    this.enginePower = enginePower;
    this.modelName = modelName;
    this.currentSpeed = 0.1;
    this.xVelocity = xVelocity;
    this.yVelocity = yVelocity;


}

    public void turnRight(){
        if (yVelocity == 0) {
            if (xVelocity > 0) {
                xVelocity = 0;
                yVelocity = 1 * currentSpeed;
            }
            else if (xVelocity < 0) {
                xVelocity = 0;
                yVelocity = -1 * currentSpeed;
            }
        }
        if (xVelocity == 0){
            if (yVelocity < 0){
                xVelocity = 1 * currentSpeed;
                yVelocity = 0;
            }
            else if (yVelocity > 0){
                xVelocity = -1 * currentSpeed;
                yVelocity = 0;
            }
            
        }
        
    }



    public void turnLeft(){
        if (yVelocity == 0){
            if(xVelocity>0) {
                xVelocity = 0;
                yVelocity = -1 * currentSpeed;
            }
                else if (xVelocity<0){
                    xVelocity= 0;
                    xVelocity = 1 * currentSpeed;
            }}
            if (xVelocity == 0){
                if (yVelocity < 0){
                    xVelocity = -1 *currentSpeed;
                    yVelocity = 0;
                }
                else if (yVelocity > 0){
                    xVelocity = 1 * currentSpeed;
                    yVelocity = 0;
                }
            }    
            }
    
    


    public void move(){
        xVelocity = currentSpeed;
        yVelocity = 0;
    }

    protected double getxVelocity() {
        return xVelocity;
    }
    protected double getyVelocity() {
        return yVelocity;
    }


    protected int getNrDoors(){
        return nrDoors;
    }
    protected double getEnginePower(){
        return enginePower;
    }

    protected double getCurrentSpeed(){
        return currentSpeed;
    }

    protected Color getColor(){
        return color;
    }

    protected void setColor(Color clr){
        color = clr;
    }

    protected void startEngine(){
       currentSpeed = 0.1;
    }

    protected void stopEngine(){
        currentSpeed = 0;
    }

    protected void setxCoord_1() {

    }
    protected abstract double speedFactor(double amount);

    protected abstract void incrementSpeed(double amount);

    protected abstract void decrementSpeed(double amount);

}




