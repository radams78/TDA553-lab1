package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import src.*;

public class Volvo240Test {
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
    public void testGas(){
        Car test = new Volvo240();
        test.gas(10);
        assertEquals(12.5, test.getCurrentSpeed(), 0.1);
    }

    @Test
    public void testBrake(){
        Car test = new Volvo240();
        test.brake(10);
        assertEquals(0, test.getCurrentSpeed(), 0.1);
    }
}
