import java.awt.*;

public class Volvo240 extends Cars{

    public final static double trimFactor = 1.25;
    
    public Volvo240(){
        super(4, 100, "Volvo240", Color.black, 0);
        stopEngine();
    }
    
    private double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
	    setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount,0));
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
	public void move() {
		// TODO Auto-generated method stub
		setX(getX() + (Math.cos(Math.toRadians(getDirection())) * getCurrentSpeed()));
        setY(getY() + (Math.sin(Math.toRadians(getDirection())) * getCurrentSpeed()));
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		setDirection(getDirection() + 90);
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		setDirection(getDirection() - 90);
	}
    
}
