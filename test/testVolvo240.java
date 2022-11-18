package test;

import org.junit.Test;

import src.Volvo240;

import static org.junit.Assert.assertTrue;

public class testVolvo240 {
    
    @Test 
    public void gas_testToSeeIfTheSpeedOfTheVolvo240IncreasesAsExpected_True(){
        
        Volvo240 testCar = new Volvo240();
        testCar.startEngine();
        double startSpeed = testCar.getCurrentSpeed();
        testCar.gas(1);
        double newSpeed = testCar.getCurrentSpeed();
        
        assertTrue(startSpeed < newSpeed);
    }

    @Test
    public void brake_testToSeeIfTheSpeedOfTheVolvo240DecreasesAsExpected_True() {

        Volvo240 testCar = new Volvo240();
        testCar.startEngine();;
        testCar.setCurrentSpeed(100);
        double startSpeed = testCar.getCurrentSpeed();

        testCar.brake(1);

        double newSpeed = testCar.getCurrentSpeed();

        assertTrue(startSpeed > newSpeed);

    }
}
