package test;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import src.CarTransporter;
import src.Saab95;
import src.Volvo240;

public class testCarTransporter{

    @Test
    public void raiseRamp_testToSeeIfCarTransporterCanRaiseItsRamp_True(){
        CarTransporter testCarTransporter = new CarTransporter(10, 10);
        testCarTransporter.raiseRamp();
        boolean raisedRamp = testCarTransporter.carPlatform.rampDown;

        assertTrue(raisedRamp == false);
        }

    @Test
    public void lowerRamp_testToSeeIfCarTransporterCanLowerItsRamp_True(){
        CarTransporter testCarTransporter = new CarTransporter(10, 10);
        testCarTransporter.raiseRamp();
        boolean raisedRamp = testCarTransporter.carPlatform.rampDown;
        testCarTransporter.lowerRamp();
        boolean loweredRamp = testCarTransporter.carPlatform.rampDown;

        assertTrue((raisedRamp == false) && (loweredRamp == true));
    }

    @Test
    public void startEngine_testToSeeIfCarTransporterCanStartMovingIfRampIsDown_False(){
        CarTransporter testCarTransporter = new CarTransporter(10, 10);
        testCarTransporter.startEngine();
        
        assertFalse(testCarTransporter.getCurrentSpeed() == 0.1);
    }

    @Test
    public void lowerRamp_testToSeeIfCarTransporterCanLowerItsRampWhileCarTransportIsMoving_False(){
        CarTransporter testCarTransporter = new CarTransporter(10, 10);
        testCarTransporter.raiseRamp();
        testCarTransporter.startEngine();
        testCarTransporter.lowerRamp();

        assertFalse(testCarTransporter.carPlatform.rampDown == true);
    }

    @Test
    public void loadCar_testToSeeIfCarTransporterCanLoadALoadableCar_True(){
        
        CarTransporter testCarTransporter = new CarTransporter(9999, 9999);
        testCarTransporter.lowerRamp();
        Saab95 testSaab95 = new Saab95(testCarTransporter.getX(), testCarTransporter.getY());

        testCarTransporter.loadCarToPlatform(testSaab95);
        int nrOfCarsOnPlatform = testCarTransporter.getNumberOfCarsOnPlatform();
        
        assertEquals(1, nrOfCarsOnPlatform);   
    }

    @Test 
    public void loadCar_testToSeeIfCarTransporterCanLoadUnloadableCar_False(){

        CarTransporter testCarTransporter = new CarTransporter(30, 30);
        testCarTransporter.lowerRamp();
        Saab95 testSaab95 = new Saab95(100, 100);    

        testCarTransporter.loadCarToPlatform(testSaab95);
        int nrOfCarsOnPlatform = testCarTransporter.getNumberOfCarsOnPlatform();
        
        assertFalse(nrOfCarsOnPlatform == 1);    
    }

    @Test
    public void isSpaceLeftOnPlatform_testToSeeIfTransporterPlatformIsFull_False(){
        CarTransporter testCarTransporter = new CarTransporter(10, 10);
        Saab95 carOne = new Saab95(10, 10);
        Saab95 carTwo = new Saab95(11, 11);
        Volvo240 carThree = new Volvo240(12, 12);
        Volvo240 carFour = new Volvo240(13, 13);
        Volvo240 carFive = new Volvo240(14, 14);

        testCarTransporter.lowerRamp();
        testCarTransporter.loadCarToPlatform(carOne);
        testCarTransporter.loadCarToPlatform(carTwo);
        testCarTransporter.loadCarToPlatform(carThree);
        testCarTransporter.loadCarToPlatform(carFour);
        testCarTransporter.loadCarToPlatform(carFive);
        
        assertFalse(testCarTransporter.carPlatform.isSpaceLeftOnPlatform());
    }
    

    
}
