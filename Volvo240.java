import java.awt.*;

public class Volvo240 extends Car {

    private final static double trimFactor = 1.25;

    public Volvo240(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight) {
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);

    }

    double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

    void incrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() > getEnginePower()) {
                throw new Exception();

            } else {
                setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
            }

        } catch (Exception e) {
            System.out.println("the car is already at max speed");
            setCurrentSpeed(getEnginePower());
        }

    }

    void decrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() < 0) {
                throw new Exception();
            } else {
                setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
            }
        } catch (Exception e) {
            System.out.println("the car is already still");
            setCurrentSpeed(0);
        }
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
    }
}
