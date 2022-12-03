package set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class ScaniaTest {


    @Test
    public void test_getPlatformAngle(){
        Scania scania = new Scania();
        assertEquals(0, scania.getPlatformAngle(), 0);

    }

    @Test
    public void test_raisePlatform(){
        Scania scania = new Scania();
        scania.raisePlatform(20);
        assertEquals(20, scania.getPlatformAngle(), 0);
    }
    @Test
    public void test_if_raisePlatform_throws_exception(){
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.gas(0.1);
                scania.raisePlatform(20);
            }
        });
    }

    @Test
    public void test_lowerPlatform(){
        Scania scania = new Scania();
        scania.raisePlatform(20);
        scania.lowerPlatform(10);
        assertEquals(10, scania.getPlatformAngle(), 0);
    }
    @Test
    public void test_if_lowerPlatform_throws_exception(){
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.lowerPlatform(10);
            }
        });
    }


    
    // @Test
    // public void test_incrementspeed(){
    //     Scania scania = new Scania(); 
    //     scania.incrementSpeed(1);
    //     assertEquals(1.25, scania.getCurrentSpeed(), 0);
    // }
    // @Test
    // public void test_decrementspeed(){
    //     Scania scania = new Scania(); 
    //     scania.incrementSpeed(1);
    //     scania.decrementSpeed(1);
    //     assertEquals(0, scania.getCurrentSpeed(), 0);
    // }

    @Test
    public void test_gas(){
        Scania scania = new Scania();
        scania.gas(0.1);
        assertEquals(0.125, scania.getCurrentSpeed(), 0);
    }

    @Test
    public void test_if_gas_throws_exception() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.gas(2);
            }
        });
    }
    @Test
    public void test_if_gas_throws_exception_due_to_platform() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.raisePlatform(20);
                scania.gas(0.1);
            }
        });
    }
    @Test
    public void test_brake(){
        Scania scania = new Scania();
        scania.gas(0.1);
        scania.brake(0.1);
        assertEquals(0, scania.getCurrentSpeed(), 0);
    }

    @Test
    public void test_if_brake_throws_exception() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.brake(2);
            }
        });
    }
    @Test
    public void test_if_brake_throws_exception_due_to_platform() {
         
        assertThrows(IllegalArgumentException.class, new Executable() {
             
            @Override
            public void execute() throws Throwable {
                Scania scania = new Scania();
                scania.raisePlatform(20);
                scania.brake(0.1);
            }
        });
    }
}