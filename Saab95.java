import static org.junit.Assert.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class Saab95 extends Car implements Movable {

    private boolean turboOn;

    private Saab95() {
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
        turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    private double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    private void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    private void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        decrementSpeed(amount);
    }

    @Override
    public void move(double x, double y) {
        switch (cardinal % 360) {
            case 0:
                y += currentSpeed;
                break;
            case 90:
                x += currentSpeed;
                break;
            case 180:
                y -= currentSpeed;
                break;
            case 270:
                x -= currentSpeed;
                break;
        }
    }

    @Override
    public void turnLeft() {
        cardinal -= 90;
    }

    @Override
    public void turnRight() {
        cardinal += 90;
    }

    @Test
    public void testMove() {
        startEngine();
        turnRight();
        double exp = (x -= currentSpeed);
        move(x, y);
        assertEquals(x, exp, 0);
        turnRight();
        double nextExp = (y -= currentSpeed);
        move(x, y);
        assertEquals(y, nextExp, 0);
    }

    @Test
    public void testGas() {
        double expectedIncrementSpeed = getCurrentSpeed() + speedFactor() * 10.5;
        gas(10.5);
        assertEquals(currentSpeed, expectedIncrementSpeed, 0);
        double expectedDecrementSpeed = getCurrentSpeed() - speedFactor() * 10.5;
        brake(10.5);
        assertEquals(currentSpeed, expectedDecrementSpeed, 0);
    }

    @Test
    public void testSpeed() {
        double expectedIncrementSpeed = getCurrentSpeed() + speedFactor() * 10.5;
        incrementSpeed(10.5);
        assertEquals(currentSpeed, expectedIncrementSpeed, 0);
        double expectedDecrementSpeed = getCurrentSpeed() - speedFactor() * 10.5;
        decrementSpeed(10.5);
        assertEquals(currentSpeed, expectedDecrementSpeed, 0);
    }

    @Test
    public void testSpeedFactor() {
        setTurboOn();
        assertEquals(speedFactor(), enginePower * 0.01 * 1.3, 0);
        setTurboOff();
        assertEquals(speedFactor(), enginePower * 0.01 * 1, 0);
    }
}
