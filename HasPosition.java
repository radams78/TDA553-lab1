import static java.lang.Math.*;
public class HasPosition {
    
    private double xCoordinate; // initial x-coord
    private double yCoordinate; // initial y-coord
    private double dX;
    private double dY;
    private double currentDirectionRadian;
    private double initialFactor;

    public HasPosition() {
        this.xCoordinate = 5;
        this.yCoordinate = 5;
        this.dX = 0;
        this.dY = 0;
        this.currentDirectionRadian = PI/2;
        this.initialFactor = 1;
    }

    public void setCurrentDirectionRadian(Double leftOrRight) {
        this.currentDirectionRadian += (PI/180) * leftOrRight;
    }
    /*
    public void setCurrentDirection(double currentSpeed) {
        double dX = cos(currentDirectionDegree) * currentSpeed;
        double dY = sin(currentDirectionDegree) * currentSpeed;
    }
     */
    public double getX() {
        return xCoordinate;
    }

    public double getY() {
        return yCoordinate;
    }

    public double currentDX() {
        return dX;
    }

    public double currentDY() {
        return dY;
    }

    public double getInitialFactor() {
        return initialFactor;
    }

}