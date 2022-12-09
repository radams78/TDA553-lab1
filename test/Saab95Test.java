package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class Saab95Test {

    @Test
    public void testGasInRangeWithTurboOff() {
        Car test = new Saab95(0,0);
        test.gas(0.5);
        assertEquals(0.625, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testBrakeInRange() {
        Car test = new Saab95(0,0);
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRange() {
        Car test = new Saab95(0,0);
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRange() {
        Car test = new Saab95(0,0);
        assertThrows(IllegalArgumentException.class, () -> {
            test.brake(10);
        });
    }

    @Test
    public void canMove() {
        Car testCar = new Saab95(0,0);
        testCar.gas(1);
        testCar.move();
        assertEquals(1.25, testCar.getXPosition(), 0.01);
    }

    @Test
    public void canTurnLeft() {
        Car testCar = new Saab95(0,0);
        testCar.turnLeft();
        assertEquals(Math.PI / 60, testCar.getFacingDirection(), 0.01);
    }

    @Test
    public void canTurnRight() {
        Car testCar = new Saab95(0,0);
        testCar.turnRight();
        assertEquals(-(Math.PI / 60), testCar.getFacingDirection(), 0.01);
    }
}
