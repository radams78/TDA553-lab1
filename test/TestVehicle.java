package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import Model.Direction;
import Model.*;

public class TestVehicle {
    

    Vehicle vehicle;

    @BeforeEach
    public void reset() {
        vehicle = new Volvo240();
    }

    @Test   
    public void testMove(){
        vehicle.setCurrentSpeed(5);
        vehicle.move();
        assertEquals(5, vehicle.getX());
    }

    @Test   
    public void gas() {
        vehicle.gas(1);
        
    }
    
    @Test
    public void brake(){
        vehicle.brake()
    }

        
}