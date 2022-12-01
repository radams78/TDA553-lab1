package src;

public class Trim{
    private double trimFactor;
    
    public Trim(double trimFactor) {
        this.trimFactor = trimFactor;
    }
    
    public double speedFactor(double enginePower){
        return enginePower * 0.01 * trimFactor;
    }   
}