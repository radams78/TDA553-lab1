import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class LabbTest {
    
    @Test
    public void test_move_car_to_the_left(){

        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.move();
        volvo.move();
        
        assertEquals(-1, saab.getX(), 0.001);
        assertEquals(-1, volvo.getX(), 0.001);
    } 

    @Test
    public void test_turn_car_then_move(){
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.turnLeft();
        volvo.turnLeft();

        saab.move();
        volvo.move();

        assertEquals(-1, saab.getY(), 0.001);
        assertEquals(-1, volvo.getY(), 0.001);

    } 

    @Test
    public void test_brake_and_gas() throws Exception {
        
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.startEngine();
        volvo.startEngine();

        assertEquals(1, saab.getCurrentSpeed(), 0.001);
        assertEquals(1, volvo.getCurrentSpeed(), 0.001);

        saab.brake(1);
        volvo.brake(1);

        assertEquals(0, saab.getCurrentSpeed(), 0.001);
        assertEquals(0, volvo.getCurrentSpeed(), 0.001);

       
    }

    @Test
    public void test_illegal_arguments_for_brake_and_gas(){
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        assertThrows(IllegalArgumentException.class, () -> {
            saab.brake(-1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.brake(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            saab.gas(-1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.gas(-1);
        });
    }

  
}
