import static org.junit.Assert.*;

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
        assertEquals(10, car.getDx(), 5);
      }

      @Test
      public void dy_setter_should_set(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setCurrentSpeed(10);
        car.setDy();
        car.turnLeft();
        assertEquals(10, car.getDy(), 5);
      }
}
