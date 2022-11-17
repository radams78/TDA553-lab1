package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;

import org.junit.Test;
import src.*;

public class Saab95Test {
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
    public void test(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        testSaab.setTurboOff();
        assertTrue(!testSaab.isTurboOn());
    }

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
    public void testGasInRange(){
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
