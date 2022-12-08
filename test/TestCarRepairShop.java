package test;

import src.State;
import src.CarRepairShop;
import src.Saab95;

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
        repairShop = new CarRepairShop();
    }

    @Test
    public void testNewCar() {
        Car car = new Saab95()
        repairShop.add(car)
        assertEquals(1, repairShop.getLoadedCars().getAmount())
}
