package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import src.Saab95;

public class testHasPosition {

    @Test
    public void setCurrentDirectionRadian_methodIncreasesTheCurrentRadian_True() {
        Saab95 testCar = new Saab95(10, 10);
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 1; i++) {
            testCar.setCurrentDirectionRadian(1);
        }

        double newRadian = testCar.getCurrentDirectionRadian();

        assertTrue(startRadian < newRadian);
        }

    @Test
    public void setCurrentDirectionRadian_methodDecreasesTheCurrentRadian_True() {
        Saab95 testCar = new Saab95(10, 10);
        double startRadian = testCar.getCurrentDirectionRadian();
        for (int i = 0; i < 1; i++) {
            testCar.setCurrentDirectionRadian(-1);
            }

        double newRadian = testCar.getCurrentDirectionRadian();

        assertTrue(startRadian > newRadian);
        }

    @Test
    public void setCurrentDirection_methodUpdatesDXvariableAndDYvariable_False(){
        Saab95 testCar = new Saab95(10, 10);
        double startDX = testCar.currentDX();
        double startDY = testCar.currentDY();

        for (int i = 0; i < 1; i++) {
            testCar.setCurrentDirection(0.1);
            }

        
        assertFalse(startDX == testCar.currentDX());
        assertFalse(startDY == testCar.currentDY());
    }

    @Test
    public void updateCoordinate_methodUpdatesXCoordinateAndYCoordinate_False(){
        Saab95 testCar = new Saab95(10, 10);
        double startX = testCar.getX();
        double startY = testCar.getY();


        for (int i = 0; i < 1; i++) {
            testCar.setCurrentDirectionRadian(1); // Car needs to turn, else cos(PI/2) = 0 and x coordinate wont change
            testCar.setCurrentDirection(0.1);
            }

         testCar.updateCoordinate();

         assertFalse(startX == testCar.getX());
         assertFalse(startY == testCar.getY());
        }
        
}
