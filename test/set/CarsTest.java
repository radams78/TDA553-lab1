package set;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;


public class CarsTest {
    @Test
    public void testing_if_instance_of_superclass(){

        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();
        assertTrue(volvo instanceof Cars);
        assertTrue(saab instanceof Cars);
    }
    public void check_speed_of_cars(){

        Volvo240 volvo = new Volvo240(); //Doesn't need to test both bc they're under cars, same method
        volvo.incrementSpeed(10);
        assertEquals(12.5, volvo.getX());

    }

    public void check_move_method(){

        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        volvo.move();
    }

}
