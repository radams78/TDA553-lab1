package test;
import static java.lang.Math.*;

import org.junit.Test;

import src.Saab95;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCar {

    @Test 
    public void TurnLeft_increaseTheCurrentRadian_True(){
        Saab95 testCar = new Saab95();
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 30; i++){
            testCar.turnLeft();
        }

        double newRadian = testCar.getCurrentDirectionRadian();


        assertTrue(startRadian < newRadian);

        

    }
    
    
}
