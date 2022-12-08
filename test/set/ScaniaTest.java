// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.Scania;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.awt.*;


// --- Tests --- //

public class ScaniaTest {
    private Scania scania = new Scania(2, Color.black, 100, "Scania",70);
    

    @Before
    public void reset_scania(){
        scania = new Scania(2, Color.black, 100, "Scania",70);
        scania.startEngine();
    }

    @Test
    public void scania_should_not_be_able_to_gas_when_ramp_is_up() {
        scania.raiseRamp();
        
        scania.gas(1);
        assertTrue(scania.getCurrentSpeed() == 0);
    }

    @Test
    public void scania_should_be_able_to_gas_when_ramp_is_down() {
        scania.lowerRamp();
        scania.gas(1);
        assertTrue(scania.getCurrentSpeed() > 0);
    }

    @Test
    public void scania_should_not_be_able_to_raise_ramp_while_moving() {
        scania.gas(1);
        scania.raiseRamp();
        assertEquals(scania.getRampPosition(), 0, 0.00001);
    }
}