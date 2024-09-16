package test;

import static org.junit.Assert.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class ScaniaTest {

    @Test
    public void cantLowerPlatformPast0Degrees() {
        Scania test = new Scania();
        test.lowerPlatform();
        assertEquals(0, test.getPlatformAngle(), 0.01);
    }

    @Test
    public void cantRaisePast70() {
        Scania test = new Scania();
        for (int i = 0; i < 80; i++) {
            test.raisePlatform();
        }
        assertEquals(70, test.getPlatformAngle(), 0.01);
    }

    @Test
    public void canGasWhenPlatformDown() {
        Scania test = new Scania();
        test.gas(0.7);
        assertEquals(0.7, test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void cantGasWhenPlatformUp() {
        Scania test = new Scania();
        test.raisePlatform();
        test.gas(0.7);
        assertEquals(0, test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void throwsErrorWhenGasToLargeWhilePlatformIsUp() {
        Scania test = new Scania();
        test.raisePlatform();
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void testGetEnginePower() {
        Car test = new Scania();
        double enginePower = test.getEnginePower();
        double testPower = 100;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void testBrakeInRange() {
        Car test = new Scania();
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRangeThrowsException() {
        Car test = new Scania();
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRangeThrowsException() {
        Car test = new Scania();
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void canMove() {
        Car testCar = new Scania();
        testCar.gas(1);
        testCar.move();
        assertEquals(1.00, testCar.getXPosition(), 0.01);
    }

    @Test
    public void canTurnLeft() {
        Car testCar = new Scania();
        testCar.turnLeft();
        assertEquals(Math.PI / 60, testCar.getFacingDirection(), 0.01);
    }

    @Test
    public void canTurnRight() {
        Car testCar = new Scania();
        testCar.turnRight();
        assertEquals(-(Math.PI / 60), testCar.getFacingDirection(), 0.01);
    }
}
