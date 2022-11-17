package test;


import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class CarTest {
    @Test
    public void testGetNrDoorsVolvo(){
        Car test = new Volvo240();
        int doors = test.getNrDoors();
        assertEquals(4, doors);
    }
    
    @Test
    public void testGetNrDoorsSaab(){
        Car test = new Saab95();
        int doors = test.getNrDoors();
        assertEquals(2, doors);
    }

    @Test
    public void testGetEnginePowerVolvo(){
        Car test = new Volvo240();
        double enginePower = test.getEnginePower();
        double testPower = 100;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void testGetEnginePowerSaab(){
        Car test = new Saab95();
        double enginePower = test.getEnginePower();
        double testPower = 125;
        assertEquals(testPower, enginePower, 0.01);
    }


    @Test
    public void testGetCurrentSpeedVolvo(){
        Car test = new Volvo240();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void testGetCurrentSpeedSaab(){
        Car test = new Saab95();
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
    public void testGetColorSaab(){
        Car test = new Saab95();
        Color carColor = test.getColor();
        assertEquals(Color.red, carColor);
    }

    @Test
    public void testSetColorVolvo(){
        Car test = new Volvo240();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void testSetColorSaab(){
        Car test = new Saab95();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void testStartEngineVolvo(){
        Car test = new Volvo240();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStartEngineSaab(){
        Car test = new Saab95();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngineVolvo(){
        Car test = new Volvo240();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testStopEngineSaab(){
        Car test = new Saab95();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }
}
