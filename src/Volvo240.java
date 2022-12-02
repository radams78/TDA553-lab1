import java.awt.*;

public class Volvo240 extends Car{

    public final static double trimFactor = 1.25;
    
    public Volvo240(int nrDoors, double enginePower, double currentSpeed, Color color){
        super(nrDoors, enginePower, currentSpeed, color);
<<<<<<< HEAD
        stopEngine();
    }
    
    protected double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

=======
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    

>>>>>>> parent of 873f4f5 (Divided all files iin to packages)
}
