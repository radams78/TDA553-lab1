import java.awt.*;

public class Transporter extends Car{

    private static boolean ramp = false;

    private Transporter() {
        nrDoors = 2;
        color = Color.black; 
        enginePower = 75;
        modelName = "Transporter";
        stopEngine();
    }
    
    
    public void lowerRamp(){
        if (currentSpeed == 0){
            ramp = false;
        }
    }

    public void raiseRamp(){
        ramp = true;
    }

    private double speedFactor() {
        return enginePower * 0.01;
    }

    private void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void gas(double amount) {
        if (amount <=1 && amount >=0 && ramp == true){
            incrementSpeed(amount);
        }
        else
        {
            incrementSpeed(0);
            System.out.print("Wrong value! Try between 0 and 1 ");
        }
    }
        
    public void brake(double amount) {
        if (amount <=1 && amount >=0){
            decrementSpeed(amount);
        }
        else
        {   decrementSpeed(0);
            System.out.print("Wrong value! Try between 0 and 1 ");}
    }
    
}
