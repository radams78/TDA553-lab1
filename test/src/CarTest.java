package src;
import java.awt.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CarTest {
    
    @Test
    public void should_get_3() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        assertEquals(testVolvo.getX(), 3, 3.0);
    }

    @Test
    public void should_get_7() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        assertEquals(testVolvo.getY(), 7, 7.0);
    }

}
