package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;


import java.awt.Color;

import org.junit.Test;
import src.*;

public class Saab95Test {
    @Test
    public void testGetEnginePowerSaab(){
        Car test = new Saab95();
        double enginePower = test.getEnginePower();
        double testPower = 125;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void testGetNrDoorsSaab(){
        Car test = new Saab95();
        int doors = test.getNrDoors();
        assertEquals(2, doors);
    }

    @Test
    public void testGetCurrentSpeedSaab(){
        Car test = new Saab95();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void testGetColorSaab(){
        Car test = new Saab95();
        Color carColor = test.getColor();
        assertEquals(Color.red, carColor);
    }

    @Test
    public void testSetColorSaab(){
        Car test = new Saab95();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void testSpeedFactorOn(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.isTurboOn());
    }

    @Test
    public void testSpeedFactorOff(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        testSaab.setTurboOff();
        assertTrue(!testSaab.isTurboOn());
    }

    @Test
    public void testStartEngineSaab(){
        Car test = new Saab95();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngineSaab(){
        Car test = new Saab95();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }
    
    @Test
    public void testsetTurboOff(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        testSaab.setTurboOff();
        assertTrue(!testSaab.isTurboOn());
    }
    
    @Test
    public void testIncrementSpeed(){
        Car test = new Saab95();
        test.incrementSpeed(10);
        assertEquals(12.5, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testDecrementSpeed(){
        Car test = new Saab95();
        test.decrementSpeed(10);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasInRangeWithTurboOff(){
        Car test = new Saab95();
        test.gas(0.5);
        assertEquals(0.625, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testBrakeInRange(){
        Car test = new Saab95();
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRange(){
        Car test = new Saab95();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRange(){
        Car test = new Saab95();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    } 
}
