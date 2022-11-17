package test;


import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class CarTest {
    @Test
    public void test_getNrDoorsVolvo(){
        Car test = new Volvo240();
        int doors = test.getNrDoors();
        assertEquals(4, doors);
    }
    
    @Test
    public void test_getNrDoorsSaab(){
        Car test = new Saab95();
        int doors = test.getNrDoors();
        assertEquals(2, doors);
    }

    @Test
    public void test_getEnginePowerVolvo(){
        Car test = new Volvo240();
        double enginePower = test.getEnginePower();
        double testPower = 100;
        assertEquals(testPower, enginePower, 0.01);
    }

    @Test
    public void test_getEnginePowerSaab(){
        Car test = new Saab95();
        double enginePower = test.getEnginePower();
        double testPower = 125;
        assertEquals(testPower, enginePower, 0.01);
    }


    @Test
    public void test_getCurrentSpeedVolvo(){
        Car test = new Volvo240();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void test_getCurrentSpeedSaab(){
        Car test = new Saab95();
        double CurSped = test.getCurrentSpeed();
        double testPower = 0;
        assertEquals(testPower, CurSped, 1);
    }

    @Test
    public void test_getColorVolvo(){
        Car test = new Volvo240();
        Color carColor = test.getColor();
        assertEquals(Color.black, carColor);
    }

    @Test
    public void test_getColorSaab(){
        Car test = new Saab95();
        Color carColor = test.getColor();
        assertEquals(Color.red, carColor);
    }

    @Test
    public void test_setColorVolvo(){
        Car test = new Volvo240();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void test_setColorSaab(){
        Car test = new Saab95();
        test.setColor(Color.GREEN);
        assertEquals(Color.GREEN, test.getColor());
    }

    @Test
    public void test_startEngineVolvo(){
        Car test = new Volvo240();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void test_startEngineSaab(){
        Car test = new Saab95();
        test.startEngine();
        assertEquals(0.1, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void test_stopEngineVolvo(){
        Car test = new Volvo240();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void test_stopEngineSaab(){
        Car test = new Saab95();
        test.stopEngine();
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }
}
