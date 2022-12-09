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
        Volvo240 testCar = new Volvo240(0,0);
        CarTransporter testCarTransporter = new CarTransporter(0,0);
        testCarTransporter.loadCar(testCar);
        assertEquals(true, testCarTransporter.isCarInLoad(testCar));
    }

    @Test
    public void canUnloadCar() {
        Volvo240 testCar = new Volvo240(0,0);
        CarTransporter testCarTransporter = new CarTransporter(0,0);
        testCarTransporter.loadCar(testCar);
        testCarTransporter.unloadCar(testCar);
        ;
        assertEquals(false, testCarTransporter.isCarInLoad(testCar));
    }

    @Test
    public void cantLoadCarTooFarAway() {
        Volvo240 testCar = new Volvo240(0,0);
        CarTransporter testCarTransporter = new CarTransporter(0,0);
        testCar.gas(1);
        for (int i = 0; i < 50; i++) {
            testCar.move();
        }
        assertThrows(IllegalArgumentException.class, () -> {
            testCarTransporter.loadCar(testCar);
        });
    }

    @Test
    public void doesntLowerWhenCallingRaiseWhenPlatformIsUp() {
        CarTransporter test = new CarTransporter(0,0);
        for (int i = 0; i < 80; i++) {
            test.raisePlatform();
            test.raisePlatform();
        }
        assertEquals(true, test.isPlatformUp());
    }

    @Test
    public void doesntRaiseWhenCallingLowerWhenPlatformIsDown() {
        CarTransporter test = new CarTransporter(0,0);
        for (int i = 0; i < 80; i++) {
            test.lowerPlatform();
            test.lowerPlatform();
        }
        assertEquals(true, !test.isPlatformUp());
    }

    @Test
    public void canGasWhenPlatformUp() {
        CarTransporter test = new CarTransporter(0,0);
        test.raisePlatform();
        test.gas(0.7);
        assertEquals(0.7, test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void cantGasWhenPlatfromDown() {
        CarTransporter test = new CarTransporter(0,0);
        test.lowerPlatform();
        test.gas(0.7);
        assertEquals(0, test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void throwsErrorWhenGasToLargeWhilePlatformIsUp() {
        CarTransporter test = new CarTransporter(0,0);
        test.raisePlatform();
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

   

    @Test
    public void testBrakeInRange() {
        Car test = new CarTransporter(0,0);
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRangeThrowsException() {
        Car test = new CarTransporter(0,0);
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRangeThrowsException() {
        Car test = new CarTransporter(0,0);
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void canMove() {
        Car testCar = new CarTransporter(0,0);
        testCar.gas(1);
        testCar.move();
        assertEquals(1.00, testCar.getXPosition(), 0.01);
    }

    @Test
    public void canTurnLeft() {
        Car testCar = new CarTransporter(0,0);
        testCar.turnLeft();
        assertEquals(Math.PI/60, testCar.getFacingDirection(), 0.01);
    }

    @Test
    public void canTurnRight() {
        Car testCar = new CarTransporter(0,0);
        testCar.turnRight();
        assertEquals(-(Math.PI/60), testCar.getFacingDirection(), 0.01);
    }
}
