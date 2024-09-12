package test;
import static java.lang.Math.*;

import org.junit.Test;

import src.Saab95;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testCar {


    // Test if Vehicle turns left
    @Test 
    public void turnLeft_increaseTheCurrentRadian_True(){
        Saab95 testVehicle = new Saab95(10, 10);
        double startRadian = testVehicle.getCurrentDirectionRadian();
        for (int i = 0; i < 1; i++){
            testVehicle.turnLeft();
        }

        double newRadian = testVehicle.getCurrentDirectionRadian();


        assertTrue(startRadian < newRadian);   

    }

    // Test if Vehicle turns left with the right amount
    @Test 
    public void turnLeft_theCurrentRadianIncreasesWithExpectedAmountOfSteps_Equal(){
        Saab95 testVehicle = new Saab95(10, 10);
        double startRadian = testVehicle.getCurrentDirectionRadian();
        for (int i = 0; i < 30; i++){
            testVehicle.turnLeft();
        }

        double newRadian = testVehicle.getCurrentDirectionRadian() - 30*(PI/180);


        assertEquals(startRadian, newRadian, 0.000000000000001);

        

    }

    // Test if the Vehicle turns right
    @Test 
    public void turnRight_decreaseTheCurrentRadian_True(){
        Saab95 testVehicle = new Saab95(10, 10);
        double startRadian = testVehicle.getCurrentDirectionRadian();
        for (int i = 0; i < 1; i++){
            testVehicle.turnRight();
        }

        double newRadian = testVehicle.getCurrentDirectionRadian();


        assertTrue(startRadian > newRadian);   

    }

    // Test if the Vehicle turns right with the right amount
    @Test 
    public void turnRight_theCurrentRadianDecreasesWithExpectedAmountOfSteps_Equal(){
        Saab95 testVehicle = new Saab95(10, 10);
        double startRadian = testVehicle.getCurrentDirectionRadian();
        for (int i = 0; i < 30; i++){
            testVehicle.turnRight();
        }

        double newRadian = testVehicle.getCurrentDirectionRadian() + 30*(PI/180);


        assertEquals(startRadian, newRadian, 0.000000000000001);
    }
     
    // Test if the Vehicle turns and moves
    @Test
    public void move_moveTheVehicleToToSeeIfTheVehicleActuallyMoves_NotEqual() {
        Saab95 testVehicle = new Saab95(10, 10);
        double testX = testVehicle.getX();
        double testY = testVehicle.getY();
        testVehicle.startEngine();
        testVehicle.turnLeft(); // If the Vehicle doesn't turn the y-coordinate is incremented by 0 by default
        testVehicle.setCurrentDirection(testVehicle.getCurrentSpeed()); // 
        testVehicle.move();
        
        assertFalse(testX == testVehicle.getX());
        assertFalse(testY == testVehicle.getY());
    }
}
