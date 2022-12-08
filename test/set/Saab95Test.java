// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.Saab95;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.awt.*;


// --- Tests --- //

public class Saab95Test {

    Saab95 saab95 = new Saab95(2, Color.red, 125, "Saab95");

    // We reset the values of var between each test
    @Before
    public void reset_saab95() {
        saab95 = new Saab95(2, Color.red, 125, "Saab95");
    }


    // Tests for startEngine
    @Test
    public void car_should_be_able_to_gas_while_engine_is_started() {
        saab95.startEngine();
        saab95.gas(1);
        assertTrue(saab95.getCurrentSpeed() != 0);
    }

    // Tests for stopEngine
    @Test
    public void car_should_not_be_able_to_increase_speed_while_engine_is_stopped() {
        saab95.stopEngine();
        saab95.gas(1);
        assertEquals(saab95.getCurrentSpeed(), 0, 0.00001);

    }

    // Tests for gas
    @Test
    public void gas_should_not_increase_speed_if_given_an_argument_of_zero() {
        saab95.startEngine();
        saab95.gas(0);
        assertEquals(saab95.getCurrentSpeed(),0,0.00001);
    }
    
    @Test
    public void gas_should_never_increase_speed_above_engine_power() {
        saab95.startEngine();
        for (int i = 0; i < 100; i++){
            saab95.gas(1);
        }
        assertEquals(saab95.getCurrentSpeed(), saab95.getEnginePower(), 0.00001);
    }

    @Test
    public void gas_should_throw_exception_if_given_argument_above_1() {
        saab95.startEngine();
        assertThrows(IllegalArgumentException.class, () -> {
        saab95.gas(2);
        });
    }

    @Test
    public void gas_should_throw_exception_if_given_argument_below_0() {
        saab95.startEngine();
        assertThrows(IllegalArgumentException.class, () -> {
        saab95.gas(-2);
        });
    }

    // Tests for brake
    @Test
    public void brake_should_not_decrease_speed_if_given_an_argument_of_zero() {
        saab95.startEngine();
        saab95.gas(1);
        double current_speed_1 = saab95.getCurrentSpeed();
        saab95.brake(0);
        double current_speed_2 = saab95.getCurrentSpeed();
        assertEquals(current_speed_1, current_speed_2, 0.00001);
    }
    
    @Test
    public void brake_should_never_decrease_speed_below_0() {
        for (int i = 0; i < 50; i++){
            saab95.brake(1);
        }
        assertEquals(saab95.getCurrentSpeed(), 0, 0.00001);
    }

    @Test
    public void brake_should_throw_exception_if_given_argument_above_1() {
        saab95.startEngine();
        assertThrows(IllegalArgumentException.class, () -> {
        saab95.brake(2);
        });
    }

    @Test
    public void brake_should_throw_exception_if_given_argument_below_0() {
        saab95.startEngine();
        assertThrows(IllegalArgumentException.class, () -> {
        saab95.brake(-2);
        });
    }


    // Tests for turnRight and turnLeft
    @Test
    public void test_if_turn_right_turns_right(){
        saab95.turnRight();
        assertEquals(saab95.getDirection(), 20, 0.0001);
    }

    @Test
    public void test_if_turn_left_turns_left(){
        saab95.turnLeft();
        assertEquals(saab95.getDirection(), -20.0, 0.000001);
    }

    // Tests for setTurboOn and setTurboOff
    @Test
    public void turbo_should_make_for_higher_speed_increase() {
        saab95.startEngine();
        saab95.setTurboOn();
        saab95.gas(1);
        Saab95 saab95_2 = new Saab95(2, Color.red, 125, "Saab95");
        saab95_2.setTurboOff();
        saab95_2.gas(1);
        assertTrue(saab95.getCurrentSpeed() > saab95_2.getCurrentSpeed());
    }  

}