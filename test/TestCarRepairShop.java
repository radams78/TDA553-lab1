package test;

import Model.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class TestCarRepairShop {
    @Test
    public void demoTestMethod() {
        assertTrue(true);
    }    

    CarRepairShop repairShop;
     
    @BeforeEach
    public void reset() {
        repairShop = new CarRepairShop(12);
    }

    @Test
    public void testNewCar() {
        Car car = new Saab95();
        repairShop.newCar(car);
        assertEquals(1, repairShop.getLoadedCars().getAmount());
    }
}