
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;


public class Volvo240Test {
Car test_car = new Volvo240();

  @Before
  public void reset_car(){
    test_car = new Volvo240();
  }
  @Test
  public void gas_increases_speed() {
    test_car.startEngine();
    double speed_before_gas = test_car.getCurrentSpeed();
    test_car.gas(1);
    double speed_after_gas = test_car.getCurrentSpeed();

    assertEquals(true, speed_after_gas > speed_before_gas);
  }
  @Test
  public void brake_decreases_speed(){
    test_car.startEngine();

    double speed_before_brake = 1;
    test_car.incrementSpeed(1);
    test_car.brake(1);
    double speed_after_brake = test_car.getCurrentSpeed();
    assertEquals(true, speed_after_brake < speed_before_brake);
  }
  @Test
  public void gas_with_argument_smaller_than_interval_should_throw_error(){
    test_car.startEngine();
    assertThrows(IllegalArgumentException.class, () -> {
        test_car.gas(-1);
    });
  }
    @Test
  public void gas_with_argument_bigger_than_interval_should_throw_error(){
    test_car.startEngine();
    assertThrows(IllegalArgumentException.class, () -> {
        test_car.gas(3);
    });
  }
  @Test
  public void car_can_turn_right_and_move_different_directions_when_engine_on(){
    test_car.turnRight();
    test_car.startEngine();
    test_car.incrementSpeed(1);
    test_car.move();

    assertEquals(true, test_car.getY() < test_car.getX());
  }
  @Test
  public void car_can_turn_left_and_move_different_directions_when_engine_on(){
    test_car.turnLeft();
    test_car.startEngine();
    test_car.incrementSpeed(1);
    test_car.move();

    assertEquals(true, test_car.getY() > test_car.getX());
  }
  @Test
  public void car_can_not_move_if_engine_is_off(){
    test_car.incrementSpeed(1);
    test_car.move();
    assertEquals(true, test_car.getY() == test_car.getX());
  }
  @Test
  public void car_can_move_if_engine_is_on(){
    test_car.startEngine();
    test_car.incrementSpeed(1);
    test_car.move();
    assertEquals(true, test_car.getY() != test_car.getX());
  }
  @Test
  public void car_can_spin_by_moving_right_4_times(){
    int start_index = test_car.getIndex();
    test_car.startEngine();
    for(int i = 0; i<4; i++){
        test_car.turnRight();
    }
    assertEquals(true, test_car.getIndex() == start_index);
  }
    @Test
    public void car_can_spin_by_moving_left_4_times(){
    int start_index = test_car.getIndex();
    test_car.startEngine();
    for(int i = 0; i<4; i++){
        test_car.turnLeft();
    }
    assertEquals(true, test_car.getIndex() == start_index);
  }
    @Test
    public void currentSpeed_does_not_surpass_enginePower(){
      test_car.setCurrentSpeed(test_car.getEnginePower());
      double speed_before_gas = test_car.getCurrentSpeed();
      test_car.gas(1);
      double speed_after_gas = test_car.getCurrentSpeed();
      assertEquals(true, speed_before_gas == speed_after_gas);
    }
    @Test
    public void currentSpeed_does_not_go_below_zero(){
      test_car.setCurrentSpeed(0);
      double speed_before_brake = test_car.getCurrentSpeed();
      test_car.brake(1);
      double speed_after_brake = test_car.getCurrentSpeed();
      assertEquals(true, speed_before_brake == speed_after_brake);
}
    @Test
    public void speedfactor_gives_expected_speed_from_1_movement_increment(){
      double expected_output = 1.25;
      test_car.incrementSpeed(1);
      assertEquals(true, expected_output == test_car.getCurrentSpeed());
    }

}