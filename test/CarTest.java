import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
  @Test
  public void turn_right_test(){
    Car car1 = new Volvo240();
    Direction expectedDirection1 = Direction.EAST;
    car1.turnRight();
    Direction actualDirection1 = car1.cardirection();

    assertEquals(expectedDirection1, actualDirection1);
  }

  @Test
  public void incrementspeedTestVolvo() throws Exception{
    Car car1 = new Volvo240();
    double expectedspeedvolvo = 100 * 0.01 * 1.25;
    car1.gas(1);
    double actualspeedvolvo = car1.getCurrentSpeed();

    assertEquals(expectedspeedvolvo, actualspeedvolvo, 0.0001);
  }

  @Test
  public void decrementspeedTestVolvo() throws Exception{
    Car car1 = new Volvo240();
    double expectedspeedvolvo = 0;
    car1.brake(1);
    double actualspeedvolvo = car1.getCurrentSpeed();

    assertEquals(expectedspeedvolvo, actualspeedvolvo, 0.0001);
  }

  @Test
  public void incrementspeedTestSaab() throws Exception{
    Saab95 car2 = new Saab95();
    double expectedspeedsaab = car2.speedFactor();
    car2.gas(1);
    double actualspeedsaab = car2.getCurrentSpeed();

    assertEquals(expectedspeedsaab, actualspeedsaab, 0.0001);
  }

  @Test
  public void decrementspeedTestSaab() throws Exception{
    Saab95 car2 = new Saab95();
    double expectedspeedsaab = -1.25; // ska vara 0, eller?
    car2.brake(1);
    double actualspeedsaab = car2.getCurrentSpeed();

    assertEquals(expectedspeedsaab, actualspeedsaab, 0.0001);
  }
  @Test
  public void gasbigamountTest() throws Exception{
    Car car1 = new Volvo240();
    assertThrows(Exception.class,()-> car1.gas(2));
  }

  @Test
  public void gassmallamountTest() throws Exception{
    Car car2 = new Saab95();
    assertThrows(Exception.class,()-> car2.gas(-1));
  }

  @Test
  public void gasrightamountTest() throws Exception{
    Car car1 = new Volvo240();
    assertDoesNotThrow(()->car1.gas(0.5));
  }
@Test
  public void compareSpeedafterGas() throws Exception{
    Car car1 = new Volvo240();
    double speedbeforegas = car1.getCurrentSpeed();
    car1.gas(1);
    double speedaftergas = car1.getCurrentSpeed();
    assertNotEquals(speedbeforegas, speedaftergas);
  }
  @Test
  public void compareSpeedafterBrake() throws Exception{
    Car car2 = new Saab95();
    double speedbeforebreak = car2.getCurrentSpeed();
    car2.brake(1);
    double speedafterbreak = car2.getCurrentSpeed();
    assertNotEquals(speedbeforebreak, speedafterbreak);
  }
@Test
  public void currentSpeedrightamount(){
    Saab95 car2 = new Saab95();
    double cure
  }

}