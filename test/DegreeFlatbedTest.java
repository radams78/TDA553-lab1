import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DegreeFlatbedTest {
    @Test
    public void flatbed_angle_should_be_one() {
        DegreeFlatbed flatbed = new DegreeFlatbed();
        flatbed.raise();
        assertEquals(1, flatbed.getFlatbedAngle());
    }

    @Test
    public void flatbed_angle_should_not_go_below_zero() {
        DegreeFlatbed flatbed = new DegreeFlatbed();
        flatbed.lower();
        assertEquals(0, flatbed.getFlatbedAngle());
    }

    @Test
    public void flatbed_angle_should_be_19() {
        DegreeFlatbed flatbed = new DegreeFlatbed();
        for (int i = 0; i < 20; i++) {
            flatbed.raise();
        }
        flatbed.lower();
        assertEquals(19, flatbed.getFlatbedAngle());
    }
    }
        
