package test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
        try{
            test.brake(10);
        } catch {
            
        }
        assertThrows(IllegalArgumentException.class, ()->{});
    }

    @Test
    public void testBrakeOutOfRange(){
        Car test = new Volvo240();
        test.brake(10);
        assertThrows(IllegalArgumentException.class, ()->{});
    }
}
