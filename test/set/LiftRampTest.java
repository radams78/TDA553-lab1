// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.LiftRamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.*;


// --- Tests --- //

public class LiftRampTest {

    private LiftRamp liftRamp = new LiftRamp();
    
    @Before
    public void reset_ramp(){
        liftRamp = new LiftRamp();
    }   

    @Test
    public void rampPositionDown_should_be_false_after_raiseRamp() {
        liftRamp.raiseRamp();
        assertTrue(liftRamp.getRampPositionDown() == false);
    }

    @Test
    public void rampPositionDown_should_be_true_after_lowerRamp() {
        liftRamp.lowerRamp();
        assertTrue(liftRamp.getRampPositionDown() == true);
    }

}

