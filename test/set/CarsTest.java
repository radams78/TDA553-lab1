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
    @Test
    public void check_speed_of_cars(){

        Volvo240 volvo = new Volvo240(); //Doesn't need to test both bc they're under cars, same method
        volvo.incrementSpeed(10);
        assertEquals(12.5, volvo.getCurrentSpeed(), 0);
    }
    @Test
    public void check_move_method(){

        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        volvo.move();
        assertTrue(volvo.getX() == 12.5);
    }
    @Test
    public void check_stopEngine(){

        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(1000);
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed(), 0);
    }
    @Test
    public void check_turns_to_left(){

        Volvo240 volvo = new Volvo240();
        volvo.turnLeft();
        assertEquals(90, volvo.getDirection(), 0);

    }
    @Test
    public void check_turns_to_right(){

        Volvo240 volvo = new Volvo240();
        volvo.turnRight();
        assertEquals(-90, volvo.getDirection(), 0);
        
    }
}
