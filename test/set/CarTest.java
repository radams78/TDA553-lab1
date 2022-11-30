/* 

package set;
import org.junit.Before;
import org.junit.Test;
import set.Car;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.*;
import java.nio.channels.Pipe;

public class CarTest {
    private Volvo240 volvo = new Volvo240(2, Color.BLUE, 100, "Volvo");
    @Before
    public void reset_car(){
        volvo = new Volvo240(2, Color.BLUE, 100, "Volvo");
    }
    
    @Test
    public void test_if_move_method_moves_correctly_X(){
        volvo.gas(1);
        volvo.move();
        assertEquals(volvo.getXPosition(), 12.5, 0.00001);
    
    }

    // Testing the change in the y-
    @Test
    public void test_if_move_method_moves_correctly_y(){
        volvo.incrementSpeed(10);
        volvo.move();
        assertEquals(volvo.getYPosition(), 0, 0.00001);
    
    }

    @Test
    public void test_if_speed_increments_correct_when_above_100(){
        volvo.incrementSpeed(100);
        assertEquals(volvo.getCurrentSpeed(), volvo.getEnginePower(), 0.00001);
    }

    @Test
    public void test_if_speed_increments_correct_when_below_100(){
        volvo.incrementSpeed(10);
        assertEquals(volvo.getCurrentSpeed(), 12.5, 0.00001);
    }

    @Test 
    public void test_if_speed_decrements_correct_when_below_0(){
        volvo.decrementSpeed(199);
        assertEquals(volvo.getCurrentSpeed(), 0, 0.00001);
    }

    @Test 
    public void test_if_speed_decrements_correct_when_above_0(){
        volvo.setCurrentSpeed(100);
        volvo.decrementSpeed(10);
        assertEquals(volvo.getCurrentSpeed(), 87.5, 0.00001);
    }
    
    @Test
    public void set_speed_should_throw_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
        volvo.setCurrentSpeed(125);
    });
    }
    @Test
    public void too_high_gas_should_throw_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.gas(10);
        });
    }
    public void negative_gas_should_throw_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.gas(-1);
        });
    }
    @Test
    public void negative_brake_should_throw_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.brake(-1);
        });
    }
    @Test
    public void too_high_brake_should_throw_exception() {
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.brake(2);
        });
    }

    @Test 
    public void enginePower_should_not_be_negative(){
        assertThrows(IllegalArgumentException.class, () -> {
            volvo = new Volvo240(0, Color.orange, -100, "wadswdasd");
        });
    }
    @Test 
    public void nrDoors_should_not_be_negative(){
        assertThrows(IllegalArgumentException.class, () -> {
            volvo = new Volvo240(-10, Color.orange, 10, "wadswdasd");
        });
    }
}


*/