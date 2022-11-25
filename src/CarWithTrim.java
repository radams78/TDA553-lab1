package src;

public class CarWithTrim{
    private double trimFactor;
    
    public CarWithTrim(double trimFactor) {
        this.trimFactor = trimFactor;
    }
    
    public double speedFactor(double enginePower){
        return enginePower * 0.01 * trimFactor;
    }   
}