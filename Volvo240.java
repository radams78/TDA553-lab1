import java.awt.*;

public class Volvo240 extends Car {

    public final static double trimFactor = 1.25;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    boolean turnLeft, turnRight;

    private Volvo240() {
        super(4, 100, 0, Color.black, "Volvo204", 0, 0, false, false);

    }

    double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    void incrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() >= getEnginePower()) {
                throw new Exception();

            } else {
                setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower));
            }

        } catch (Exception e) {
            System.out.println("the car is already at max speed");
        }

    }

    void decrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() <= 0) {
                throw new Exception();
            } else {
                setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
            }
        } catch (Exception e) {
            System.out.println("the car is already still");
        }
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }
}
