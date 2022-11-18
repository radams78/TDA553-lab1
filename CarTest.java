

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CarTest {
  @Test //testar start direction
  public void move_in_all_direction_test() {
    Car car1 = new Volvo240();
    Direction expectedDirection1 = Direction.NORTH;
    Direction actualDirection1 = car1.cardirection();

    assertEquals(expectedDirection1, actualDirection1);

    Car car2 = new Saab95();
    Direction expectedDirection2 = Direction.NORTH;
    Direction actualDirection2 = car2.cardirection();

    assertEquals(expectedDirection2, actualDirection2);
  
    //ARSet emptySet = new ARSet();
    //assertEquals(0, emptySet.size());
  }

  @Test
  public void turn_left_test(){
    Car car1 = new Volvo240();
    Direction expectedDirection1 = Direction.WEST;
    car1.turnLeft();
    Direction actualDirection1 = car1.cardirection();

    assertEquals(expectedDirection1, actualDirection1);

  }
}