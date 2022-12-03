package set;

import java.awt.*;


abstract class TurboCar extends Car{

    private boolean turboOn;

    protected TurboCar(int nrDoors, double enginePower, String modelName, Color color, double currentSpeed, boolean turboOn){
        super(nrDoors, enginePower, modelName, color, currentSpeed);
        this.turboOn = turboOn;
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    protected boolean getTurboOn(){
        return turboOn;
    }
}

