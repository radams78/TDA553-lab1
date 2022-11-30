import java.awt.*;

public class Volvo240 extends MotorisedVehicle<Engine, TrimBody> {

    
    public Volvo240(){
        super(new TrimBody("Volvo240", Color.black, 4, 1.25), new Engine(100));
    }

    public double getTrimFactor(){
        return this.getBody().getTrimFactor();
    }
    
    @Override
    public double speedFactor(){
        return (this.getEnginePower() * 0.01 * this.getTrimFactor());
    }
}
