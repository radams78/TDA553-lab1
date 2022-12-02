package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import src.Scania;

public class testScania{

    @Test
    public void raiseGarbagePlatform_testToSeeIfScaniaCanRaiseItsAnglePlatform_True(){
        Scania testScania = new Scania(10, 10);
        int startAngle = testScania.garbagePlatform.platformAngle;
        testScania.raisePlatform();
        int newAngle = testScania.garbagePlatform.platformAngle;

        assertTrue(startAngle < newAngle);
    }

    @Test
    public void raiseGarbagePlatform_testToSeeIfScaniaCanRaiseItsAnglePlatformWhileMoving_False(){
        Scania testScania = new Scania(10, 10);
        testScania.startEngine();
        for(int i = 0; i < 10; i++) {testScania.raisePlatform();
        }

        assertFalse(testScania.garbagePlatform.platformAngle != 0);
    }

    @Test
    public void lowerGarbagePlatform_testToSeeIfScaniaCanLowerItsAnglePlatform_True(){
        Scania testScania = new Scania(10, 10);
        for(int i = 0; i < 10; i++){
            testScania.raisePlatform();
        }
        int raisedAngle = testScania.garbagePlatform.platformAngle;

        for (int i = 0; i < 5; i++){
            testScania.lowerPlatform();
        }
        int loweredAngle = testScania.garbagePlatform.platformAngle;

        assertTrue(loweredAngle < raisedAngle);
    }

    @Test
    public void startEngine_testToSeeIfScaniaCanStartEngineIfItsAnglePlatformIsRaised_False(){
        Scania testScania = new Scania(10, 10);
        testScania.raisePlatform();
        testScania.startEngine();

        assertFalse(testScania.getCurrentSpeed() != 0.0);
    }


}