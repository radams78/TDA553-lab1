package set;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CarTest {
  
  Car test_car = new Volvo240();

  @Before
  public void reset_car(){
    test_car = new Volvo240();
  }
  @Test
  public void gas_increases_speed() {
    test_car.startEngine();
    int speed_before_gas = test_car.currentSpeed;
    
  }
}