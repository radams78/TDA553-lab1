package Lab1;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.jupiter.api.*;
public class ScaniaTest {
    @Test
    public void raising_platform_should_not_be_more_than_maxAngle(){
        Scania scania = new Scania(2, 100, 0, Color.GREEN, "Scania", 0);
        scania.raisePlatform(100);
        assertEquals(scania.maxAngle, scania.getPlatformAngle());

    }
    @Test
    public void lowering_platform_should_not_be_more_than_lowestAngle(){
        Scania scania = new Scania(2, 100, 0, Color.GREEN, "Scania", 0);
        scania.lowerPlatform(100);
        assertEquals(scania.lowestAngle, scania.getPlatformAngle());
    }
}
