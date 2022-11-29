import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class CarTest {
  @Test
  public void enginePower_setter_should_set_double() {
    Car car = new Saab95(4, 150.0, 0.0, Color.RED);
    assertEquals(150, car.getEnginePower());
  }

  @Test
  public void enginePower_should_not_be_negative() {
    Car car = new Saab95(4, -150.0, 0.0, Color.RED);
    assertEquals(0, car.getEnginePower());
  }

  @Test
  public void CurrentSpeed_setter_should_set_double() {
    Car car = new Saab95(4, 100.0, 0.0, Color.RED);
    assertEquals(0, car.getCurrentSpeed());
  }

  @Test
  public void CurrentSpeed_should_not_be_negative() {
    Car car = new Saab95(4, -150.0, 0.0, Color.RED);
    assertEquals(0, car.getCurrentSpeed());
  }

      @Test
      public void move_should_calculate_dx(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.gas(1);
        car.move();
        assertEquals(1, car.getDx());
      }

      @Test
      public void move_should_calculate_dy(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.gas(1);
        for (int i = 0; i < 45; i++) {
          car.turnRight();
        }
        car.move();
        assertEquals(-0.71, car.getDy(), 0.1);
      }

      @Test
      public void changing_the_position_according_to_the_speed(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.gas(1);
        for (int i = 0; i < 60; i++) {
          car.turnLeft();
        }
        car.move();
        assertEquals(0.87, car.getY(), 0.1);
        assertEquals(0.5, car.getX(), 0.1);
      }

  @Test
  public void turning_right_works_over_360_degrees() {
    Car car = new Saab95(4, 100.0, 0.0, Color.RED);
    for (int i = 0; i < 390; i++) {
      car.turnRight();
    }
    assertEquals(-30, car.getDirection());
  }

  @Test
  public void turning_left_works_over_360_degrees() {
    Car car = new Saab95(4, 100.0, 0.0, Color.RED);
    for (int i = 0; i < 390; i++) {
      car.turnLeft();
    }
    assertEquals(30, car.getDirection());
  }

  @Test
  public void should_not_incrementSpeed_because_gas_is_greater_than_1() {
    Car car = new Volvo240(4, 500.0, 0.0, Color.BLUE);
    double oldCurrentSpeed = car.getCurrentSpeed();
    car.gas(2);
    assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
  }

  @Test
  public void should_not_incrementSpeed_because_gas_is_less_than_0() {
    Car car = new Volvo240(4, 500.0, 0.0, Color.BLUE);
    double oldCurrentSpeed = car.getCurrentSpeed();
    car.gas(-0.2);
    assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
  }

  @Test
  public void should_not_decrementSpeed_because_brake_is_greater_than_1() {
    Car car = new Volvo240(4, 1000.0, 0, Color.BLUE);
    double oldCurrentSpeed = car.getCurrentSpeed();
    car.brake(2);
    assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
  }

  @Test
  public void should_not_decrementSpeed_because_brake_is_less_than_0() {
    Car car = new Volvo240(4, 500.0, 0.0, Color.BLUE);
    double oldCurrentSpeed = car.getCurrentSpeed();
    car.brake(-0.2);
    assertEquals(car.getCurrentSpeed(), oldCurrentSpeed);
  }

  @Test
  public void currentSpeed_should_not_be_negative() {
    Car car = new Volvo240(4, 1000.0, 0, Color.BLUE);
    car.brake(1);
    assertTrue(car.getCurrentSpeed() >= 0);
  }

  @Test
  public void incrementSpeed_Should_Be_20() {
    Saab95 saab95 = new Saab95(4, 2000.0, 0, Color.RED);
    saab95.startEngine(); // This line will have no affect on the result => incrementSpeed() works with
                          // any oldCurrentSpeed. You can also use setCurrentSpeed() here.
    double oldCurrentSpeed = saab95.getCurrentSpeed();
    saab95.gas(1);
    double differenceOldSpeedNewSpeed = saab95.getCurrentSpeed() - oldCurrentSpeed;
    assertEquals(20, differenceOldSpeedNewSpeed);
  }

  @Test
  public void decrementSpeed_Should_Be_Minus_one() {
    Saab95 saab95 = new Saab95(4, 100.0, 0, Color.BLUE);
    saab95.gas(1);
    double oldCurrentSpeed = saab95.getCurrentSpeed();
    saab95.brake(1);
    double differenceOldSpeedNewSpeed = saab95.getCurrentSpeed() - oldCurrentSpeed;
    assertEquals(-1, differenceOldSpeedNewSpeed);
  }
}
