package labb1;
public class Flatbed extends Trailer{
    private final int MAX_NUMBER_OF_CARS;
    private int loadedCars;
    private int proximityToTransporter; //distans in whole meters from the transporter to the car that will be transported
    
    public Flatbed(int maxLoad, int MAX_NUMBER_OF_CARS){
    super(maxLoad);
    this.MAX_NUMBER_OF_CARS = MAX_NUMBER_OF_CARS;
    this.loadedCars = 0;
    this.proximityToTransporter = 0;
    }

    //Specific method for raising the platsform of the truck
    //Increases platsform angle if its not at the max angle
    public void extendPlatform(double currentSpeedX, double currentSpeedY){
        if (currentSpeedX != 0 || currentSpeedY != 0){
            throw new IllegalArgumentException("The truck is moving");
        } else{
            super.setPlatformExtended(true);
        }
    }
    
    //Specific method for lowering platsform
    //Decreases thje platsform angle if itn not at the min angle of zero
    public void retractPlatform(){
        if (super.getPlatformExtended()){
            super.setPlatformExtended(false);
        } else{
            throw new IllegalArgumentException("Platform is already up");
        }
    }
    
    public void loadCar(int proximityToTransporter){
        // If proximity is <= 5 meters load car else throw exception
        if (super.getPlatformExtended().equals(true) && proximityToTransporter >= 0 && proximityToTransporter <= 5){
            if (this.loadedCars < this.MAX_NUMBER_OF_CARS){
                this.loadedCars += 1;
            } else {
                throw new IllegalArgumentException("Car transporter is full");
            }
        } else{
            throw new IllegalArgumentException("Platform is not down or the car is to far away!");
        }
    }

    public void unLoadCar(int proximityToTransporter){
        if (super.getPlatformExtended().equals(true)){
            if (this.loadedCars > 0){
                this.loadedCars -= 1;
            } else {
                throw new IllegalArgumentException("Car transporter is already empty");
            }
        } else{
            throw new IllegalArgumentException("Platform is not down");
        }
    }
}
