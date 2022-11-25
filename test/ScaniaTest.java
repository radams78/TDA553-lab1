package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class ScaniaTest {

    @Test
    public void canRaisePlatform() {
        Scania test = new Scania();
        test.raisePlatform();
        assertEquals(1, test.getPlatformAngle(), 0.01);
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
    public void canGasWhenPlatfromUp(){
        Scania test = new Scania();
        test.gas(0.7);
        assertEquals(0.7,test.getCurrentSpeed(), 0.01);
    }
    
    @Test
    public void cantGasWhenPlatfromUp(){
        Scania test = new Scania();
        test.raisePlatform();
        test.gas(0.7);
        assertEquals(0,test.getCurrentSpeed(), 0.01);
    }

    @Test
    public void throwsErrorWhenGasToLargeWhilePlatformIsUp(){
        Scania test = new Scania();
        test.raisePlatform();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    }
    
    @Test
    public void testGetEnginePower(){
        Car test = new Scania();
        double enginePower = test.getEnginePower();
        double testPower = 100;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void testGetNrDoors(){
        Car test = new Scania();
        int doors = test.getNrDoors();
        assertEquals(2, doors);
    }

    @Test
    public void testGetCurrentSpeed(){
        Car test = new Scania();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void testGetColor(){
        Car test = new Scania();
        Color carColor = test.getColor();
        assertEquals(Color.yellow, carColor);
    }

    @Test
    public void testSetColor(){
        Car test = new Scania();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void testStartEngine(){
        Car test = new Scania();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngine(){
        Car test = new Scania();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }
    
    @Test
    public void testIncrementSpeed(){
        Car test = new Scania();
        test.incrementSpeed(10);
        assertEquals(10, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testDecrementSpeed(){
        Car test = new Scania();
        test.decrementSpeed(10);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testBrakeInRange(){
        Car test = new Scania();
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRange(){
        Car test = new Scania();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRange(){
        Car test = new Scania();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    } 

}
