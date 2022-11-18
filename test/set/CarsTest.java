package set;

import java.awt.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;


public class CarsTest { // Done!

    @Test
    public void test_if_superclass(){

        Volvo240 volvo = new Volvo240();
        assertTrue(volvo instanceof Cars);
        Saab95 saab = new Saab95();
        assertTrue(saab instanceof Cars);
    }
    @Test
    public void test_getNrDoors(){
        Volvo240 volvo = new Volvo240();
        assertEquals(4, volvo.getNrDoors());
    }
    @Test
    public void test_getEnginePower(){
        Volvo240 volvo = new Volvo240();
        assertEquals(100, volvo.getEnginePower(), 0);

    }
    @Test
    public void test_getCurrentSpeed(){
        Volvo240 volvo = new Volvo240();
        volvo.gas(0.1);
        assertEquals(0.125, volvo.getCurrentSpeed(), 0);
    }
    @Test
    public void test_setCurrentSpeed(){
        Volvo240 volvo = new Volvo240();
        volvo.setCurrentSpeed(1);
        assertEquals(1, volvo.getCurrentSpeed(), 0);
    }
    @Test
    public void test_getX(){
        Volvo240 volvo = new Volvo240();
        volvo.gas(0.1); // Since 0 is the standardvalue of an int I want to change the value of x first.
        volvo.move();
        assertEquals(0.125, volvo.getX(), 0);
    }
    @Test
    public void test_getY(){
        Volvo240 volvo = new Volvo240();
        volvo.turnLeft();
        volvo.gas(0.1); // Since 0 is the standardvalue of an int I want to change the value of y first.
        volvo.move();
        assertEquals(0.125, volvo.getY(), 0);
    }
    @Test
    public void test_getModelName(){
        Volvo240 volvo = new Volvo240();
        assertEquals("Volvo240", volvo.getModelName());
    }

    @Test
    public void test_getDirection_and_setDirection(){
        Volvo240 volvo = new Volvo240();
        volvo.setDirection(45);
        assertEquals(45, volvo.getDirection(), 0);
    }
    @Test
    public void test_getColor(){
        Volvo240 volvo = new Volvo240();
        assertEquals(Color.black, volvo.getColor());
    }
    @Test
    public void test_setColor(){
        Volvo240 volvo = new Volvo240();
        volvo.setColor(Color.blue);
        assertEquals(Color.blue, volvo.getColor());
    }
    // OBS! The incrementSpeed() method in the subclass Volvo240 needs to be public to run these tests!
    // @Test 
    // public void test_startEngine(){

    //     Volvo240 volvo = new Volvo240();
    //     volvo.incrementSpeed(1);
    //     volvo.startEngine();
    //     assertEquals(0.1, volvo.getCurrentSpeed(), 0);
    // }
    // @Test
    // public void test_stopEngine(){

    //     Volvo240 volvo = new Volvo240();
    //     volvo.incrementSpeed(1);
    //     volvo.stopEngine();
    //     assertEquals(0, volvo.getCurrentSpeed(), 0);
    // }
    // @Test
    // public void test_move_method(){
    //     Volvo240 volvo = new Volvo240();
    //     volvo.incrementSpeed(1);
    //     volvo.move();
    //     assertTrue(volvo.getX() == 1.25);
    // }
    @Test
    public void test_turns_to_left(){

        Volvo240 volvo = new Volvo240();
        volvo.turnLeft();
        assertEquals(90, volvo.getDirection(), 0);

    }
    @Test
    public void test_turns_to_right(){

        Volvo240 volvo = new Volvo240();
        volvo.turnRight();
        assertEquals(-90, volvo.getDirection(), 0);
        
    }
}
