package vehicle;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.awt.*;

public class Volvo240Test {

    @Test
    public void speedFactor_Should_Be_10(){
        Volvo240 volvo240 = new Volvo240(4, 1000.0, 100.0, Color.BLUE);
        assertEquals(12.5, volvo240.speedFactor(), 0.05);
    }

    
}

