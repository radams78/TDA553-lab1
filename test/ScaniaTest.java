package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertThrows;

import org.junit.Test;
import src.*;

public class ScaniaTest {

    @Test
    public void canRaisePlatform() {
        Scania test = new Scania();
        test.raisePlatform();
        assertEquals(1, test.getPlatformAngle(), 0.01);
    }
    
    @Test
    public void cantRaisePast70() {
        Scania test = new Scania();
        for (int i = 0; i < 80; i++) {
            test.raisePlatform();
        }
        assertEquals(70, test.getPlatformAngle(), 0.01);
    }
    
}
