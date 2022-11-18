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

    @Test
    public void incrementSpeed_Should_Be_25(){
        Volvo240 volvo240 = new Volvo240(4, 1000.0, 100.0, Color.BLUE);
        double oldCurrentSpeed = volvo240.getCurrentSpeed();
        volvo240.incrementSpeed(2);
        double diffOlSpdNewSpd = volvo240.getCurrentSpeed() - oldCurrentSpeed;
        assertEquals(25, diffOlSpdNewSpd);
    } 

    @Test
    public void decrementSpeed_Should_Be_20(){
        Volvo240 volvo240 = new Volvo240(4, 1000.0, 100.0, Color.BLUE);
        double oldCurrentSpeed = volvo240.getCurrentSpeed();
        volvo240.decrementSpeed(1);
        double diffOlSpdNewSpd = volvo240.getCurrentSpeed() - oldCurrentSpeed;
        assertEquals(0, diffOlSpdNewSpd);
    } 
}

