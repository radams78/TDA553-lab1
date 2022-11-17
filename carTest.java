import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

public class carTest {
    
    @Test
    public void testCar(){
        Car myCar = new Car("VolvoXC60", Color.white, 200, 1);
        Volvo240 myVolvo240 = new Volvo240();
        assertEquals("VolvoXC60", myCar.getModelName());
        assertEquals(1, myCar.getNrDoors());
        System.out.println(myCar.getModelName());
        System.out.println(myCar.getNrDoors());
    }

    @Test
    public void carRuns() {
        Car myCar = new Car("Volvo240", Color.black, 100, 4);
            myCar.gas(0.5);
            assertEquals();

        }

    }
}
