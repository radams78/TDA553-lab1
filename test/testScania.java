package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import src.Scania;

public class testScania{

    @Test
    public void raiseGarbagePlatform_testToSeeIfScaniaCanRaiseItsAnglePlatform_True(){
        Scania testScania = new Scania();
        int startAngle = testScania.garbagePlatform.platformAngle;
        testScania.garbagePlatform.raise();
        int newAngle = testScania.garbagePlatform.platformAngle;

        assertTrue(startAngle < newAngle);
    }

    @Test
    public void raiseGarbagePlatform_testToSeeIfScaniaCanRaiseItsAnglePlatformWhileMoving_False(){
        Scania testScania = new Scania();
        testScania.startEngine();
        testScania.raiseGarbagePlatform();

        assertFalse(testScania.garbagePlatform.platformAngle == 0);
    }

    @Test
    public void lowerGarbagePlatform_testToSeeIfScaniaCanLowerItsAnglePlatform_True(){
        Scania testScania = new Scania();
        for(int i = 0; i < 10; i++){
            testScania.garbagePlatform.raise();
        }
        int raisedAngle = testScania.garbagePlatform.platformAngle;

        for (int i = 0; i < 5; i++){
            testScania.garbagePlatform.lower();
        }
        int loweredAngle = testScania.garbagePlatform.platformAngle;

        assertTrue(loweredAngle < raisedAngle);
    }

    @Test
    public void startEngine_testToSeeIfScaniaCanStartEngineIfItsAnglePlatformIsRaised_False(){
        Scania testScania = new Scania();
        testScania.garbagePlatform.raise();
        testScania.startEngine();

        assertFalse(testScania.getCurrentSpeed() != 0.0);
    }


}