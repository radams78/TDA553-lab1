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

      public void CurrentSpeed_setter_should_set_double(){
        Car car = new Saab95(4, 100.0, 0.0, Color.RED);
      }
}
