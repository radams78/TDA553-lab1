import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoStateFlatbedTest {
    @Test
    public void flatbedUp_should_be_true() {
        TwoStateFlatbed flatbed = new TwoStateFlatbed();
        flatbed.raise();
        assertTrue(flatbed.getFlatbedUp());
    }

    @Test
    public void flatbedUp_should_be_false() {
        TwoStateFlatbed flatbed = new TwoStateFlatbed();
        flatbed.lower();
        assertTrue(flatbed.getFlatbedUp());
    }
}
