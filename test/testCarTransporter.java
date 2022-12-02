package test;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import src.CarTransporter;
import src.Saab95;

public class testCarTransporter{

    @Test
    public void raiseRamp_testToSeeIfCarTransporterCanRaiseItsRamp_True(){
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.raiseRamp();
        boolean raisedRamp = testCarTransporter.carPlatform.rampDown;

        assertTrue(raisedRamp == false);
        }

    @Test
    public void lowerRamp_testToSeeIfCarTransporterCanLowerItsRamp_True(){
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.raiseRamp();
        boolean raisedRamp = testCarTransporter.carPlatform.rampDown;
        testCarTransporter.lowerRamp();
        boolean loweredRamp = testCarTransporter.carPlatform.rampDown;

        assertTrue((raisedRamp == false) && (loweredRamp == true));
    }

    @Test
    public void startEngine_testToSeeIfCarTransporterCanStartMovingIfRampIsDown_False(){
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.startEngine();
        
        assertFalse(testCarTransporter.getCurrentSpeed() == 0.1);
    }

    @Test
    public void lowerRamp_testToSeeIfCarTransporterCanLowerItsRampWhileCarTransportIsMoving_False(){
        CarTransporter testCarTransporter = new CarTransporter();
        testCarTransporter.raiseRamp();
        testCarTransporter.startEngine();
        testCarTransporter.lowerRamp();

        assertFalse(testCarTransporter.carPlatform.rampDown == true);
    }

    @Test
    public void loadCar_testToSeeIfCarTransporterCanLoadALoadableCar_True(){
        
        CarTransporter testCarTransporter = new CarTransporter();
        Saab95 testSaab95 = new Saab95();

        testCarTransporter.loadCarToPlatform(testSaab95);
        
        assertEquals(1, testCarTransporter.getNumberOfCarsOnPlatform());
        
    }
}
