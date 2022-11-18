package set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class Saab95Test {// Done!

    @Test
    public void test_if_saab_subclass_of_Cars(){
        Saab95 saab = new Saab95();
        assertTrue(saab instanceof Cars);
    }
    @Test
    public void test_setTurboOn(){
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        assertTrue(saab.turboOn == true);
    }
    @Test
    public void test_setTurboOff(){
        Saab95 saab = new Saab95();
        saab.setTurboOn();
        saab.setTurboOff();
        assertTrue(saab.turboOn == false);
    }
    // OBS! The methods that are being tested below need to be set to public to run these tests!
    // @Test
    // public void test_speedFactor(){

    //     Saab95 saab = new Saab95();
    //     assertEquals(1.25, saab.speedFactor(), 0);
    //     saab.setTurboOn();
    //     assertEquals(1.625, saab.speedFactor(), 0);
    // }
    // @Test
    // public void test_incrementspeed(){
    //     Saab95 saab = new Saab95(); 
    //     saab.incrementSpeed(1);
    //     assertEquals(1.25, saab.getCurrentSpeed(), 0);
    // }
    // @Test
    // public void test_decrementspeed(){
    //     Saab95 saab = new Saab95(); 
    //     saab.incrementSpeed(1);
    //     saab.decrementSpeed(1);
    //     assertEquals(0, saab.getCurrentSpeed(), 0);
    // }

    @Test
    public void test_gas(){
        Saab95 saab = new Saab95();
        saab.gas(0.1);
        assertEquals(0.125, saab.getCurrentSpeed(), 0);
    }

    @Test
    public void test_if_gas_throws_exception() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Saab95 saab = new Saab95();
                saab.gas(2);
            }
        });
    }
    @Test
    public void test_brake(){
        Saab95 saab = new Saab95();
        saab.gas(0.1);
        saab.brake(0.1);
        assertEquals(0, saab.getCurrentSpeed(), 0);
    }
    @Test
    public void test_if_brake_throws_exception() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Saab95 saab = new Saab95();
                saab.brake(2);
            }
        });
    }
}
