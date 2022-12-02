package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class CarTransporterTest {

    @Test
    public void canLoadCar() {
        Volvo240 testCar = new Volvo240();
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.loadCar(testCar);
        assertEquals(true, testCarTransporter.isCarInLoad(testCar));
    }

    @Test
    public void canUnloadCar() {
        Volvo240 testCar = new Volvo240();
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.loadCar(testCar);
        testCarTransporter.unloadCar(testCar);
        ;
        assertEquals(false, testCarTransporter.isCarInLoad(testCar));
    }

    @Test
    public void cantLoadCarTooFarAway() {
        Volvo240 testCar = new Volvo240();
        CarTransporter testCarTransporter = new CarTransporter();
        testCar.gas(1);
        for (int i = 0; i < 50; i++) {
            testCar.move();
        }
        assertThrows(IllegalArgumentException.class, () -> {
            testCarTransporter.loadCar(testCar);
        });
    }

    @Test
    public void doesntLowerWhenCallingRaise() {
        CarTransporter test = new CarTransporter();
        for (int i = 0; i < 80; i++) {
            test.raisePlatform();
            test.raisePlatform();
        }
        assertEquals(true, test.isPlatformUp());
    }

    @Test
    public void doesntRaiseWhenCallingLower() {
        CarTransporter test = new CarTransporter();
        for (int i = 0; i < 80; i++) {
            test.lowerPlatform();
            test.lowerPlatform();
        }
        assertEquals(true, !test.isPlatformUp());
    }

    @Test
    public void canGasWhenPlatformUp() {
        CarTransporter test = new CarTransporter();
        test.raisePlatform();
        test.gas(0.7);
        assertEquals(0.7, test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void cantGasWhenPlatfromDown() {
        CarTransporter test = new CarTransporter();
        test.lowerPlatform();
        test.gas(0.7);
        assertEquals(0, test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void throwsErrorWhenGasToLargeWhilePlatformIsUp() {
        CarTransporter test = new CarTransporter();
        test.raisePlatform();
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void testGetEnginePower() {
        Car test = new CarTransporter();
        double enginePower = test.getEnginePower();
        double testPower = 100;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void testGetNrDoors() {
        Car test = new CarTransporter();
        int doors = test.getNrDoors();
        assertEquals(2, doors);
    }

    @Test
    public void testGetCurrentSpeed() {
        Car test = new CarTransporter();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void testGetColor() {
        Car test = new CarTransporter();
        Color carColor = test.getColor();
        assertEquals(Color.gray, carColor);
    }

    @Test
    public void testSetColor() {
        Car test = new CarTransporter();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void testStartEngine() {
        Car test = new CarTransporter();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngine() {
        Car test = new CarTransporter();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testIncrementSpeed() {
        Car test = new CarTransporter();
        test.incrementSpeed(10);
        assertEquals(10, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testDecrementSpeed() {
        Car test = new CarTransporter();
        test.decrementSpeed(10);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testBrakeInRange() {
        Car test = new CarTransporter();
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRange() {
        Car test = new CarTransporter();
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRange() {
        Car test = new CarTransporter();
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
        assertEquals(Math.PI/60, testCar.getFacingDirection(), 0.01);
    }

    @Test
    public void canTurnRight() {
        Car testCar = new Scania();
        testCar.turnRight();
        assertEquals(-(Math.PI/60), testCar.getFacingDirection(), 0.01);
    }
}
    