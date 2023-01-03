package Model;
import java.awt.Color;


public abstract class Truck extends Vehicle implements PlatformType{
    
    protected PlatformType platform;
    private final static double slowFactor = 0.8;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y, PlatformType 
    platformType) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
        
        platform = platformType;
      
    }
       

    @Override
    public double speedFactor(){

        return this.getEnginePower() * 0.01 * slowFactor;
    }

    abstract Boolean isAbleToMove();

    @Override 
    public void startEngine(){

        if(isEngineOn()){
            return;
        }
        else if(this.isAbleToMove()){
            this.setEngineOn(true);
            setCurrentSpeed(0.1);;
        }
        else{
            System.out.println("Cant drive with the current state of the plattform");
        }
    }

    @Override
    public void move() {

        if (isEngineOn()){
            direction();   
        }
        else{
            return;
        }
    }
    
    @Override
    public int getPlatformState(){

         return platform.getPlatformState();
    }


    @Override
    public void setPlatformState(int platformState){

        platform.setPlatformState(platformState);
    }


    @Override
    public void platformUp(int state) {
        if (this.getCurrentSpeed()==0){
            platform.platformUp(state);
        }
        else{
            System.out.println("Cant raise the platform while moving");
        }
    }

    @Override
    public void platfromDown(int state) {
        if (this.getCurrentSpeed()==0){
        platform.platfromDown(state);
        }
        else{
            System.out.println("Cant lower the platform while moving");
        }
    }
}
