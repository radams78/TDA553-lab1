package src;
import java.awt.*;

public class CarTransporter extends Vehicle{
    
    public TransporterPlatform carPlatform;


    /**
     * Constructor CarTransporter
     */
    public CarTransporter() {
        super(2, 85, Color.darkGray, "TransportTorkel", 30, 30, false);
        this.carPlatform = new TransporterPlatform(5);
    }

    /**
     * Call this method to raise the ramp
     */
    public void raiseRamp(){
        this.carPlatform.raise();
        
    }


    /**
     * Call this method to lower the ramp
     */
    public void lowerRamp(){
        if(this.isVehicleCurrentSpeedZero()){
            this.carPlatform.lower();
            }
    }

    public double speedFactor(){
        return 1.0;
    }
    
    public void loadCar(Vehicle car){
        this.carPlatform.loadCar(car);
    }

    public void unloadCarFromPlatform(){
        this.carPlatform.xCoordinate = (int)getX();
        this.carPlatform.yCoordinate = (int)getY();
        this.carPlatform.unloadCar();
    }

    /**
     * Call this method to increase the speed of the carTransporter
     */
    @Override
    public void gas(double amount) {
        if(0 <= amount && amount <= 1 && carPlatform.rampDown == false) {
            incrementSpeed(amount);
        }
    }
    
    /**
     * This method will be called by the gas method.
     * Speed can not be more than the engine power of the carTransporter.
     */
    @Override
    public void incrementSpeed(double amount){
        if (getCurrentSpeed() < getEnginePower()) {
            setCurrentSpeed(getCurrentSpeed() + speedFactor() *amount);
            }
        else {
            setCurrentSpeed(getEnginePower());
        }
    }

    /**
     * Call this method to decrease the speed of the carTransporter.
     * Speed can not be less than 0.
     */
    @Override
    public void decrementSpeed(double amount) {
        if(getCurrentSpeed() >= 0){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }
        else{
            setCurrentSpeed(0);
        }
    }


}

