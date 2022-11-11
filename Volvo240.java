import java.awt.*;

public class Volvo240 extends Car implements Movable {

    private final static double trimFactor = 1.25;
    
    private Volvo240(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }
    
    private double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    private void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }

    private void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
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
    public void move(double x, double y) {
        switch (cardinal % 360) {
            case 0:
                y += currentSpeed;
                break;
            case 90: 
                x += currentSpeed;
                break;
            case 180: 
                y -= currentSpeed;
                break;
            case 270:
                x -= currentSpeed;
                break;
        }
    }

    @Override
    public void turnLeft() {
        cardinal -= 90;
    }

    @Override
    public void turnRight() {
        cardinal += 90;
    }
}
