import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;


public class CarTest {
    @Test
    public void enginePower_setter_should_set_double() {
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setEnginePower(150);
        assertEquals(150, car.getEnginePower(), 5);
      }

      @Test
      public void CurrentSpeed_setter_should_set_double(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setCurrentSpeed(150);
        assertEquals(150, car.getCurrentSpeed(), 5);
      }

      @Test
      public void dx_setter_should_set(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setCurrentSpeed(10);
        car.setDx();
        assertEquals(10, car.getDx(), 0.1);
      }

      @Test
      public void dy_setter_should_set(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setCurrentSpeed(10);
        for (int i = 0; i < 45; i++) {
          car.turnRight();
        }
        car.setDy();
        assertEquals(-7.1, car.getDy(), 0.1);
      }

      @Test
      public void changing_the_position_according_to_the_speed(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setCurrentSpeed(10);
        for (int i = 0; i < 60; i++) {
          car.turnLeft();
        }
        car.setDy();
        car.setDx();
        car.move();
        assertEquals(8.7, car.getY(), 0.1);
        assertEquals(5, car.getX(), 0.1);
      }

      @Test
      public void turning_right_works_over_360_degrees(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        for (int i = 0; i < 390; i++) {
          car.turnRight();
        }
        assertEquals(-30, car.getDirection(), 0);
      }

      @Test
      public void turning_left_works_over_360_degrees(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        for (int i = 0; i < 390; i++) {
          car.turnLeft();
        }
        assertEquals(30, car.getDirection(), 0);
      }

      @Test
      public void should_not_incrementSpeed_because_gas_is_greater_than_1() {
        Car car = new Volvo240(4, 500.0, 0.0, Color.BLUE);
        car.setCurrentSpeed(100);
        double oldCurrentSpeed = car.getCurrentSpeed();
        car.gas(2);
        assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
      }

      @Test
      public void should_not_incrementSpeed_because_gas_is_less_than_0() {
        Car car = new Volvo240(4, 500.0, 0.0, Color.BLUE);
        car.setCurrentSpeed(100);
        double oldCurrentSpeed = car.getCurrentSpeed();
        car.gas(-0.2);
        assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
      }

      @Test
      public void should_not_decrementSpeed_because_brake_is_greater_than_1(){
          Car car = new Volvo240(4, 1000.0, 0, Color.BLUE);
          car.setCurrentSpeed(100);
          double oldCurrentSpeed = car.getCurrentSpeed();
          car.brake(2);
          assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
      }

      @Test
      public void should_not_decrementSpeed_because_brake_is_less_than_0() {
        Car car = new Volvo240(4, 500.0, 0.0, Color.BLUE);
        car.setCurrentSpeed(100);
        double oldCurrentSpeed = car.getCurrentSpeed();
        car.brake(-0.2);
        assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
      }

      @Test
      public void currentSpeed_should_not_be_negative(){
        Car car = new Volvo240(4, 1000.0, 0, Color.BLUE);
        car.decrementSpeed(1000);
        assertTrue(car.getCurrentSpeed() >= 0);
      }
}
