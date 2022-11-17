import java.awt.*;
public class Saab95 extends Car{

    // public boolean turboOn;
    // public int nrDoors; // Number of doors on the car
    // public double enginePower; // Engine power of the car
    // public double currentSpeed; // The current speed of the car
    // public Color color; // Color of the car
    // public String modelName; // The car model name
    boolean turboOn, turnLeft, turnRight;

    private Saab95() {
        super(2, 125, 0, Color.red, "Saab95", 0, 0,false,false);
        startEngine();
        setTurboOn();
        stopEngine();
        setTurboOff();
        turboOn = false;
        turnLeft = false;
        turnRight = false;

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
        }

    }

    // TODO fix this method according to lab pm
    void gas(double amount) {
        try {
            if (amount < 0 || amount > 1) {
                throw new Exception();
            } else {
                incrementSpeed(amount);
            }

        } catch (Exception e) {
            System.out.println("impossible ammount");

        }
    }

    // TODO fix this method according to lab pm
    void brake(double amount) {
        try {
            if (amount < 0 || amount > 1) {
                throw new Exception();
            } else {
                decrementSpeed(amount);

            }
        } catch (Exception e) {
            System.out.println("impossible ammount");

        }
    }

    
}
