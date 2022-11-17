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
        assertEquals(10, car.getDx(), 0.1);
      }

      @Test
      public void dy_setter_should_set(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
        car.setCurrentSpeed(10);
        for (int i = 0; i < 45; i++) {
          car.turnLeft();
        }
        car.setDy();
        assertEquals(7.1, car.getDy(), 0.1);
      }


}
