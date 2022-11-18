import java.awt.*;

public abstract class Car extends Vehicle{
    private final int nrDoors;
    private final double enginePower;
    private final String modelName;

    public Car(int nrDoors, Color color, double enginePower, String modelName, String vehicleType, int x, int y, int dir){

        super(vehicleType, color, x, y, dir);
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.modelName = modelName;
        stopVehicle();
    }
    
    public String getModelName() {
        return modelName;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
        
    }

    public void setCurrentSpeed(double currentSpeed) {
        if(currentSpeed <= enginePower){
            super.setCurrentSpeed(currentSpeed);
        }
        else{
            System.out.println("Speed is to high");
        }

    }
    
    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (amount < 1 && amount > 0){
        incrementSpeed(amount);
        }
        else{
            System.out.println("Value not acceptable");;
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount < 1 && amount > 0){
            incrementSpeed(amount);
            }
            else{
                throw new IllegalArgumentException("Value must be a double between 0 and 1");
            }
    }

}
