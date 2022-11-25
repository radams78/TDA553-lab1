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
    public void incrementSpeed_Difference_Should_Be_25(){
        Volvo240 volvo240 = new Volvo240(4, 1000.0, 0, Color.BLUE);
        volvo240.startEngine(); //This line will have no affect on the result => incrementSpeed() works with any oldCurrentSpeed. You can also use setCurrentSpeed() here.
        double oldCurrentSpeed = volvo240.getCurrentSpeed();
        volvo240.incrementSpeed(2);
        double diffOlSpdNewSpd = volvo240.getCurrentSpeed() - oldCurrentSpeed;
        assertEquals(25, diffOlSpdNewSpd);
    } 

    @Test
    public void decrementSpeed_Difference_Should_Be_Minus_25(){
        Volvo240 volvo240 = new Volvo240(4, 1000.0, 0, Color.BLUE);
        volvo240.setCurrentSpeed(100);
        double oldCurrentSpeed = volvo240.getCurrentSpeed();
        volvo240.decrementSpeed(2);
        double diffOlSpdNewSpd = volvo240.getCurrentSpeed() - oldCurrentSpeed;
        assertEquals(-25, diffOlSpdNewSpd);
    } 
}

