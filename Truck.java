import java.awt.Color;


public abstract class Truck extends Vehicle{
    
    private Platform platform;
    private final static double slowFactor = 0.8;

    public Truck(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y, Platform 
    platformType) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
        
        platform = platformType;
      
    }
       

    @Override
    public double speedFactor(){

        return this.getEnginePower() * 0.01 * slowFactor;
    }


    @Override
    public void incrementSpeed(double amount){

	    this.setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, this.getEnginePower()));
    }


    @Override
    public void decrementSpeed(double amount){

        this.setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));;
    }


    abstract Boolean isAbleToMove();


    @Override
    public void move() {

        if (this.isAbleToMove()){
            System.out.println("Cant drive with the current state of the plattform");
        }

        else{
        startEngine();
        direction();    
        }
    }
    

    public int getPlatformState(){

         return platform.getPlatformState();
    }


    public void setPlatformState(int platformState){

        platform.setPlatformState(platformState);
    }


    public void platformUp(int state) {

        platform.platformUp(state);
    }


    public void platfromDown(int state) {

        platform.platfromDown(state);
    }
  
}
