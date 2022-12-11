// --- Packages --- //

package set;

// --- Imports --- //

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.Volvo240;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;


import java.awt.*;

// ---- Tests ---- //

public class Volvo240Test {    

  private Volvo240 volvo = new Volvo240(2, Color.BLUE, 100, "Volvo");

    @Before
    public void reset_volvo(){
        volvo = new Volvo240(2, Color.BLUE, 100, "Volvo");
    }
    
    @Test
    public void test_if_move_method_moves_correctly_X(){
        volvo.startEngine();
        volvo.gas(1);
        volvo.move();
        assertEquals(volvo.getXPosition(), 1.25, 0.00001);
    
    }

    @Test
    public void test_if_move_method_moves_correctly_y(){
        volvo.gas(0);
        volvo.move();
        assertEquals(volvo.getYPosition(), 0, 0.00001);
    }

    @Test
    public void test_if_speed_increments_correct_when_above_100(){
        volvo.startEngine();
        for(int i = 0; i < 100 ; i++){
            volvo.gas(1);
        }
        assertEquals(volvo.getCurrentSpeed(), volvo.getEnginePower(), 0.00001);
    }

    @Test
    public void test_if_speed_increments_correct_when_below_100(){
        volvo.startEngine();
        for(int i = 0; i < 10 ; i++){
            volvo.gas(1);
        }
        assertEquals(volvo.getCurrentSpeed(), 12.5, 0.00001);
    }

    @Test 
    public void test_if_speed_decrements_correct_when_below_0(){
        volvo.brake(1);
        assertEquals(volvo.getCurrentSpeed(), 0, 0.00001);
    }

    @Test 
    public void test_if_speed_decrements_correct_when_above_0(){
        volvo.startEngine();
        for(int i = 0; i < 80 ; i++){
            volvo.gas(1);
        }
        for(int i = 0; i < 20 ; i++){
            volvo.brake(1);
        }
        assertEquals(75, volvo.getCurrentSpeed(), 0.00001);
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