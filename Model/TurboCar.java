package Model;

import java.awt.Color;

public class TurboCar extends Vehicle implements TurboType {


    private TurboMode turbo;

    public TurboCar(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName, int x, int y) {
        super(nrDoors, enginePower, currentSpeed, color, modelName, x, y);
    
    }

    @Override
    public void setTurboOn(){
	    turbo.setTurboOn();
    }

    @Override
    public void setTurboOff(){
        turbo.setTurboOff();
    }
    
    @Override
    public double speedFactor(){
    
        if(turbo.isTurboOn()){ turbo.setTurbo(1.3);
        }
        return this.getEnginePower() * 0.01 * turbo.getTurbo();
    }
    
}
