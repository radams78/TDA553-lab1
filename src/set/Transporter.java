// Module to hold the subclass Transporter
// - Note that this class inherits from its superclass Truck

// --- Packages --- //

package set;

// ---- Imports ---- //

import java.awt.*;
import java.util.List;
import java.math.*;

// ----- Class ----- //

public class Transporter extends Truck{

    private LiftRamp ramp;
    private List<Car> loadedCars;
    private static final int carCapacity = 8;

    
    // --- Constructor --- //
    
    public Transporter(int nrDoors, Color color, int enginePower, String modelName){
        super(nrDoors, color, enginePower, modelName);
        this.ramp = new LiftRamp();    
    }

    // ----- Methods ----- //

    @Override
    protected double speedFactor() {
        return getEnginePower() * 0.01;
    }

    // Method to raise Transporter object's ramp
    // - Note that this is only allowed while current speed is 0
    public void raiseRamp(){
        if (this.getCurrentSpeed() == 0){
            ramp.raiseRamp();
        }
    }

    // Method to lower Transporter object's ramp
    // - Note that this is only allowed while current speed is 0
    public void lowerRamp(){
        if (this.getCurrentSpeed() == 0){
            ramp.lowerRamp();
        }
    }

    @Override
    public void gas(double amount) {
        if (ramp.rampDown() == false) super.gas(amount);
    }        

    // Method to load cars
    // - Note that you can only load if:
    //   > Transporter is below capacity
    //   > Transporter's ramp is down
    //   > Distance to transporter is below 15m
    public void loadCar(Car car){
        double xDistance = Math.pow(Math.abs(car.getX() - this.getX()), 2);
        double yDistance = Math.pow(Math.abs(car.getY() - this.getY()), 2);
        double distanceToTransporter =  Math.sqrt(xDistance + yDistance);
        
        if (loadedCars.size() < carCapacity && ramp.rampDown() == true && distanceToTransporter < 15){
            loadedCars.add(car);
            
        }
    }
    
    // Method to unload cars
    public void unloadCar(Car car){
        if (loadedCars.size() > 0){
            
            loadedCars.remove(loadedCars.size() - 1);
        }
    }
}