package Model;
import java.awt.*;

public class Scania extends Truck {

    private Platform platform = new Platform();

    public Scania(){
        super(2, 500, Color.red, "Scania", "pics/Scania.jpg");
    }

    public void raisePlatform() {
        if (getCurrentSpeed() != 0) {throw new IllegalCallerException("Unable to raise platform while truck is moving");}
        else {
            platform.raisePlatform(1);
        }
    }

    public void lowerPlatform() {
        if (getCurrentSpeed() != 0) {throw new IllegalCallerException("Unable to lower platform while truck is moving");}
        else {
            platform.lowerPlatform(1);
        }
    }

    @Override
    public void incrementSpeed(double amount){
        if (platform.getAngle() != 0) {throw new IllegalArgumentException("Unable to move while platform is raised");}
        else {
            double newSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
            if (newSpeed > getCurrentSpeed()) {setCurrentSpeed(newSpeed);}
        }
    }

    @Override
    public void decrementSpeed(double amount){
        if (platform.getAngle() != 0) {throw new IllegalArgumentException("Unable to move while platform is raised");}
        else {
            double newSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
            if (newSpeed < getCurrentSpeed()) {setCurrentSpeed(newSpeed);}
        }
    }

    public Platform getPlatform() {
        return platform;
    }
}