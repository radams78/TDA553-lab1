import java.awt.*;


public class Saab95 extends Car {

    // public boolean turboOn;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    private boolean turboOn;

    public Saab95(int doors, int power, int speed, Color color, String name, int x, int y, boolean turnLeft, boolean turnRight) {
        super(doors, power, speed, color, name, x, y, turnLeft, turnRight);

    }

    private void setTurboOn() {
        turboOn = true;
    }

    private void setTurboOff() {
        turboOn = false;
    }

    double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    void incrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() >= getEnginePower()) {
                throw new Exception();
            } else {
                setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
            }

        } catch (Exception e) {
            System.out.println("the car is already at max speed");
            setCurrentSpeed(getEnginePower());
        }

    }

    void decrementSpeed(double amount) {
        try {
            if (getCurrentSpeed() <= 0) {
                throw new Exception();
            } else {
                setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
            }

        } catch (Exception e) {
            System.out.println("the car is already still");
            setCurrentSpeed(0);
        }

    }


    // TODO fix this method according to lab pm

}

// TODO fix this method according to lab pm
