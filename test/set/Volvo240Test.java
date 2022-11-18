package set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class Volvo240Test {// Done!
    
    @Test
    public void test_if_volvo_subclass_of_Cars(){
        Volvo240 volvo = new Volvo240();
        assertTrue(volvo instanceof Cars);
    }
    // OBS! These methods need to be set to public before tested!
    // @Test
    // public void test_speedFactor(){

    //     Volvo240 volvo = new Volvo240();
    //     assertEquals(1.25, volvo.speedFactor(), 0);
    // }

    // @Test
    // public void test_volvo_incrementspeed(){
    //     Volvo240 volvo = new Volvo240(); 
    //     volvo.incrementSpeed(1);
    //     assertEquals(1.25, volvo.getCurrentSpeed(), 0);
    // }
    // @Test
    // public void test_if_Volvo240_incrementspeed_throws_exception() {
         
    //     assertThrows(IllegalArgumentException.class, new Executable() {
             
    //         @Override
    //         public void execute() throws Throwable {
    //             Volvo240 volvo = new Volvo240();
    //             volvo.incrementSpeed(-1);
    //         }
    //     });
    // }
    // @Test
    // public void test_volvo_decrementspeed(){
    //     Volvo240 volvo = new Volvo240(); 
    //     volvo.incrementSpeed(1);
    //     volvo.decrementSpeed(1);
    //     assertEquals(0, volvo.getCurrentSpeed(), 0);
    // }
    // @Test
    // public void test_if_Volvo240_decrementspeed_throws_exception() {
         
    //     assertThrows(IllegalArgumentException.class, new Executable() {
             
    //         @Override
    //         public void execute() throws Throwable {
    //             Volvo240 volvo = new Volvo240();
    //             volvo.decrementSpeed(-1);
    //         }
    //     });
    // }
    @Test
    public void test_gas(){
        Volvo240 volvo = new Volvo240();
        volvo.gas(0.1);
        assertEquals(0.125, volvo.getCurrentSpeed(), 0);
    }
    @Test
    public void test_if_Volvo240_gas_throws_exception() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Volvo240 volvo = new Volvo240();
                volvo.gas(2);
            }
        });
    }
    @Test
    public void test_brake(){
        Volvo240 volvo = new Volvo240();
        volvo.gas(0.1);
        volvo.brake(0.1);
        assertEquals(0, volvo.getCurrentSpeed(), 0);
    }
    @Test
    public void test_if_Volvo240_brake_throws_exception() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Volvo240 volvo = new Volvo240();
                volvo.brake(2);
            }
        });
    }
}
