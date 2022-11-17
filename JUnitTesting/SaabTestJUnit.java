package JUnitTesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.*;

public class SaabTestJUnit {
  @Test
  public void isCurrentSpeedZero() {
    Saab95 saab = new Saab95();
    assertEquals(0.0, saab.getCurrentSpeed(), 0);
  }

  @Test
  public void doesDirectionWork() {
    Saab95 saab = new Saab95();
    saab.turnLeft();
    assertEquals(3.0, saab.getDirection(), 0);
  }

  @Test
  public void isEqualFourDoors() {
    Saab95 saab = new Saab95();
    assertEquals(2.0, saab.getNrDoors(), 0);
  }

  @Test
  public void isColorRed() {
    Saab95 saab = new Saab95();
    assertEquals(Color.red, saab.getColor());
  }

  @Test
  public void moveUpTwoSteps() {
    Saab95 saab = new Saab95();
    saab.startEngine();
    saab.move();
    saab.move();
    assertEquals(9.8, saab.getYCord(), 0);
  }

  @Test
  public void testingBrake() {
    Saab95 saab = new Saab95();
    saab.brake(1);
    assertEquals(0, saab.getCurrentSpeed(), 0);
  }
}