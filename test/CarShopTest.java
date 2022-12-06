import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CarShopTest {
    @Test
    public void calc_distance_test() {
        CarShop carShop = new CarShop(10, 10, 15.0, 2, 15, 15);

        Car car = new Saab95();

        assertTrue("Should be in distance", carShop.isInDistance(car));
    }

    @Test
    public void how_many_cars_in_shop() {
        CarShop carShop = new CarShop(10, 10, 15.0, 2, 15, 15);
        Car car = new Saab95();

        carShop.loadCar(car);

        int expectedCarsInShop = 1;
        int actualCarsInShop = carShop.carsCurrentlyInShop();

        assertEquals(expectedCarsInShop, actualCarsInShop); // Testar LOAD

        Car actual = carShop.unloadCar();

        expectedCarsInShop = 0;
        actualCarsInShop = carShop.carsCurrentlyInShop();

        assertEquals(expectedCarsInShop, actualCarsInShop); // Testar UNLOAD

        assertEquals(car, actual); // Test: LOAD then UNLOAD, check if its the same car

    }
}
