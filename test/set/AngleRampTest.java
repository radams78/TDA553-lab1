// --- Packages --- //

package set;

// --- Imports --- //

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.AngleRamp;

import static org.junit.Assert.assertEquals;


// --- Tests --- //

public class AngleRampTest {
    
    private AngleRamp angleRamp = new AngleRamp(70);
    
    @Before
    public void reset_ramp(){
        angleRamp = new AngleRamp(70);
    }

    @Test
    public void rampAngle_should_not_exceed_70_degrees() {
        for (int i = 0; i < 20; i++){
            angleRamp.raiseRamp();
        }
        assertEquals(angleRamp.getAngle(), 70, 0.00001);
    }

    @Test
    public void rampAngle_should_not_be_less_than_0_degrees() {
        angleRamp.lowerRamp();
        assertEquals(angleRamp.getAngle(), 0, 0.00001);
    }
}