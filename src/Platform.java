package src;

import static java.lang.Math.abs;

public class Platform {
    private double angle = 0;
    private final double[] angleLimits = {0, 70};

    public void raisePlatform(double degree) {
        setAngle(getAngle()+abs(degree));
    }
    
    public void raisePlatform(int degree) {
        setAngle(getAngle()+(double)abs(degree));
    }

    public void lowerPlatform(double degree) {
        setAngle(getAngle()-abs(degree));
    }

    public void lowerPlatform(int degree) {
        setAngle(getAngle()-(double)abs(degree));
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        if (angleLimits[0] <= angle && angle < angleLimits[1]) {this.angle = angle;}        
    }
}
