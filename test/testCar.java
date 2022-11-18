package test;
import static java.lang.Math.*;

import org.junit.Test;

import src.Saab95;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class testCar {


    // Test if car turns left
    @Test 
    public void turnLeft_increaseTheCurrentRadian_True(){
        Saab95 testCar = new Saab95();
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 1; i++){
            testCar.turnLeft();
        }

        double newRadian = testCar.getCurrentDirectionRadian();


        assertTrue(startRadian < newRadian);   

    }

    // Test if car turns left with the right amount
    @Test 
    public void turnLeft_theCurrentRadianIncreasesWithExpectedAmountOfSteps_Equal(){
        Saab95 testCar = new Saab95();
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 30; i++){
            testCar.turnLeft();
        }

        double newRadian = testCar.getCurrentDirectionRadian() - 30*(PI/180);


        assertEquals(startRadian, newRadian, 0.000000000000001);

        

    }

    // Test if the car turns right
    @Test 
    public void turnRight_decreaseTheCurrentRadian_True(){
        Saab95 testCar = new Saab95();
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 1; i++){
            testCar.turnRight();
        }

        double newRadian = testCar.getCurrentDirectionRadian();


        assertTrue(startRadian > newRadian);   

    }

    // Test if the car turns right with the right amount
    @Test 
    public void turnRight_theCurrentRadianDecreasesWithExpectedAmountOfSteps_Equal(){
        Saab95 testCar = new Saab95();
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 30; i++){
            testCar.turnRight();
        }

        double newRadian = testCar.getCurrentDirectionRadian() + 30*(PI/180);


        assertEquals(startRadian, newRadian, 0.000000000000001);
    }
     
    // Test if the car turns and moves
    @Test
    public void move_moveTheCarToToSeeIfTheCarActuallyMoves_NotEqual() {
        Saab95 testCar = new Saab95();
        double testX = testCar.getX();
        double testY = testCar.getY();
        testCar.startEngine();
        testCar.turnLeft(); // If the car doesn't turn the y-coordinate is incremented by 0 by default
        testCar.setCurrentDirection(testCar.getCurrentSpeed()); // 
        testCar.move();
        
        assertFalse(testX == testCar.getX());
        assertFalse(testY == testCar.getY());
    }
}
