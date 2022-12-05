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
// om angle > 0 -> kan inte öka speed
// om speed > 0 -> kan inte raise eller lower
// vi får ha speed = 0 och angle == 0
public void raiseplatform(double platformAngle) throws Exception{
    if (getCurrentSpeed()==0){  //platform.getPlatformAngle()> 0 &
        platform.openPlatform(platformAngle);                             //platform.closePlatform, intervallet hanteras av openplatform
    }else if(getCurrentSpeed() > 0){ //getPlatformAngle() == 0  (?)
        throw new Exception("raising the platform is not possible");
    }
}
public void lowerplatform(double platformAngle) throws Exception{
    if (getCurrentSpeed()==0){  //platform.getPlatformAngle()< 70 &
        platform.closePlatform(platformAngle);  //close not open
    }else if(getCurrentSpeed() > 0){  //getPlatformAngle() == 70 ||
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
        return platformAngle;
    }
}