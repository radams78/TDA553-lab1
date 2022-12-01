import java.awt.*;

public class Scania extends Car {


public double platformAngle;
Turbo t  = new Turbo();
Platform platform;

public Scania(){
super(2, 162, 0 ,Color.white, "Scania Dump Truck", 0, 0, Direction.NORTH);
//turboOn = false;
speedFactor();
}

public void raiseplatform(double platformAngle) throws Exception{       //TODO test
    if (platform.getPlatformAngle()> 0 & getCurrentSpeed()==0){
        platform.closePlatform(platformAngle);
        
    }else if(getPlatformAngle() == 0 || getCurrentSpeed() > 0){
        throw new Exception("raising the platform is not possible");
    }
}

public void lowerplatform(double platformAngle) throws Exception{       //TODO test
    if (platform.getPlatformAngle()< 70 & getCurrentSpeed()==0){
        platform.openPlatform(platformAngle);
        
    }else if(getPlatformAngle() == 70 || getCurrentSpeed() > 0){
        throw new Exception("lowering the platform is not possible");
    }
}

public void setTurboOn(){
	    t.setTurboOn();
    }

    public void setTurboOff(){
	    t.setTurboOff();
    }
    
    protected double speedFactor(){ 
        return getEnginePower() * 0.01 * t.turbofactor();
    }


    public double getPlatformAngle() {
        return 0;
    }


}