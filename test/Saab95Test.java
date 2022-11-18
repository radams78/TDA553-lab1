import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class Saab95Test {
    @Test
    public void setTurboOn_TurboOn_Should_Be_True() {
        Saab95 saab95 = new Saab95(4, 200.0, 100.0, Color.RED);
        saab95.setTurboOn();
        assertTrue(saab95.getTurboOn());
    }

    @Test
    public void setTurboOff_TurboOn_Should_Be_False(){
        Saab95 saab95 = new Saab95(4, 200.0, 100.0, Color.RED);
        saab95.setTurboOff();
        assertFalse(saab95.getTurboOn());
        }

    @Test
    public void speedFactor_Should_Be_20(){
        Saab95 saab95 = new Saab95(4, 2000.0, 100.0, Color.RED);
        assertEquals(20, saab95.speedFactor());
    }

    @Test
    public void incrementSpeed_Should_Be_20(){
        Saab95 saab95 = new Saab95(4, 2000.0, 0, Color.RED);
        saab95.startEngine(); //This line will have no affect on the result => incrementSpeed() works with any oldCurrentSpeed. You can also use setCurrentSpeed() here.
        double oldCurrentSpeed = saab95.getCurrentSpeed();
        saab95.incrementSpeed(2);
        double diffOlSpdNewSpd = saab95.getCurrentSpeed() - oldCurrentSpeed;
        assertEquals(40, diffOlSpdNewSpd);
    }

    @Test
    public void decrementSpeed_Should_Be_Minus_20(){
        Saab95 saab95 = new Saab95(4, 1000.0, 0, Color.BLUE);
        saab95.setCurrentSpeed(100);
        double oldCurrentSpeed = saab95.getCurrentSpeed();
        saab95.decrementSpeed(2);
        double diffOlSpdNewSpd = saab95.getCurrentSpeed() - oldCurrentSpeed;
        assertEquals(-20, diffOlSpdNewSpd);
    } 
}
