package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class Volvo240Test {
    @Test
    public void testGetEnginePowerVolvo(){
        Car test = new Volvo240();
        double enginePower = test.getEnginePower();
        double testPower = 100;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void testGetNrDoorsVolvo(){
        Car test = new Volvo240();
        int doors = test.getNrDoors();
        assertEquals(4, doors);
    }

    @Test
    public void testGetCurrentSpeedVolvo(){
        Car test = new Volvo240();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void testGetColorVolvo(){
        Car test = new Volvo240();
        Color carColor = test.getColor();
        assertEquals(Color.black, carColor);
    }

    @Test
    public void testSetColorVolvo(){
        Car test = new Volvo240();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void testStopEngineVolvo(){
        Car test = new Volvo240();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStartEngineVolvo(){
        Car test = new Volvo240();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testIncrementSpeed(){
        Car test = new Volvo240();
        test.incrementSpeed(10);
        assertEquals(12.5, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testDecrementSpeed(){
        Car test = new Volvo240();
        test.decrementSpeed(10);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasInRange(){
        Car test = new Volvo240();
        test.gas(0.5);
        assertEquals(0.625, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testBrakeInRange(){
        Car test = new Volvo240();
        test.brake(1);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testGasOutOfRange(){
        Car test = new Volvo240();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    }

    @Test
    public void testBrakeOutOfRange(){
        Car test = new Volvo240();
        assertThrows(IllegalArgumentException.class, ()->{
            test.brake(10);
        });
    }
}
