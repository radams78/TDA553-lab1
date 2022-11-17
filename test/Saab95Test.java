package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.Color;

import org.junit.Test;
import src.*;

public class Saab95Test {
    @Test
    public void testSpeedFactorOn(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        assertTrue(testSaab.isTurboOn());
    }

    @Test
    public void testSpeedFactorOff(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        testSaab.setTurboOff();
        assertTrue(!testSaab.isTurboOn());
    }
    
    @Test
    public void test(){
        Saab95 testSaab = new Saab95();
        testSaab.setTurboOn();
        testSaab.setTurboOff();
        assertTrue(!testSaab.isTurboOn());
    }
    
}
