import static org.junit.Assert.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class Volvo240 extends Car{

    private final static double trimFactor = 1.25;

    private Volvo240() {
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    private double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    private void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    private void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }

    public void gas(double amount) {
        if (amount<=1 && amount >=0 ){
            incrementSpeed(amount);
        }
        else
        {
            incrementSpeed(0);
            System.out.print("Wrong value! Try between 0 and 1 ");
        }
    }
        
    public void brake(double amount) {
        if (amount<=1 && amount >=0 ){
            decrementSpeed(amount);
        }
        else
        {   decrementSpeed(0);
            System.out.print("Wrong value! Try between 0 and 1 ");}
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
        double expectedIncrementSpeed = Math.max(getCurrentSpeed() + speedFactor() * 10.5, 0);
        gas(10.5);
        assertEquals(currentSpeed, expectedIncrementSpeed, 0);
        double expectedDecrementSpeed = Math.max(getCurrentSpeed() - speedFactor() * 10.5, 0);
        brake(10.5);
        assertEquals(currentSpeed, expectedDecrementSpeed, 0);
    }

    @Test
    public void testSpeed() {
        double expectedIncrementSpeed = Math.max(getCurrentSpeed() + speedFactor() * 10.5, 0);
        incrementSpeed(10.5);
        assertEquals(currentSpeed, expectedIncrementSpeed, 0);
        double expectedDecrementSpeed = Math.max(getCurrentSpeed() - speedFactor() * 10.5, 0);
        decrementSpeed(10.5);
        assertEquals(currentSpeed, expectedDecrementSpeed, 0);
    }

    @Test
    public void testSpeedFactor() {
        assertEquals(speedFactor(), enginePower * 0.01 * trimFactor, 0);
    }
}
