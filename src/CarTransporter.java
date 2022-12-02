package src;
import java.awt.*;

public class CarTransporter extends Vehicle{
    
    public TransporterPlatform carPlatform;
    public Object carsOnPlatform;


    /**
     * Constructor CarTransporter
     */
    public CarTransporter(double xCoordinate, double yCoordinate) {
        super(2, 85, Color.darkGray, "TransportTorkel", xCoordinate, yCoordinate, false);
        this.carPlatform = new TransporterPlatform(5);
    }

    /**
     * Call this method to raise the ramp
     */
    public void raiseRamp(){
        this.carPlatform.raisePlatform();
        
    }


    /**
     * Call this method to lower the ramp
     */
    public void lowerRamp(){
        if(this.isVehicleCurrentSpeedZero()){
            this.carPlatform.lowerPlatform();
            }
    }

    
    public void loadCarToPlatform(Vehicle car){
        updateCoordinatesForLoadingAndUnloading();
        this.carPlatform.loadCar(car);
    }

    public void unloadCarFromPlatform(){
        updateCoordinatesForLoadingAndUnloading();
        this.carPlatform.unloadCar();
    }

    public void updateCoordinatesForLoadingAndUnloading(){
        this.carPlatform.xCoordinate = (int)getX();
        this.carPlatform.yCoordinate = (int)getY();
    }

    public int getNumberOfCarsOnPlatform(){
        return this.carPlatform.carsOnPlatform.size();
    }

    /**
     * Call this method to increase the speed of the carTransporter
     */
    @Override
    public void startEngine(){
        if(carPlatform.rampDown == false){
            this.setCurrentSpeed(0.1);
        }
    }
}

