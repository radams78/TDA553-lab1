package test;

import org.junit.Test;

import src.Saab95;

import static org.junit.Assert.assertTrue;

public class testSaab95 {
    
    @Test 
    public void gas_testToSeeIfTheSpeedOfTheTheSaab95IncreasesAsExpected_True(){
        Saab95 testCar = new Saab95();
        testCar.startEngine();
        double startSpeed = testCar.getCurrentSpeed();
        testCar.gas(1);
        double newSpeed = testCar.getCurrentSpeed();
        
        assertTrue(startSpeed < newSpeed);
    }

    @Test
    public void brake_testToSeeIfTheSpeedOfTheVolvo240DecreasesAsExpected_True() {

        Saab95 testCar = new Saab95();
        testCar.startEngine();;
        testCar.setCurrentSpeed(100);
        double startSpeed = testCar.getCurrentSpeed();

        testCar.brake(1);

        double newSpeed = testCar.getCurrentSpeed();

        assertTrue(startSpeed > newSpeed);
    }

}
