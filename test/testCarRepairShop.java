package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.CarRepairShop;
import src.Saab95;

public class testCarRepairShop {
    
    @Test
    public void loadCar_testToSeeIfRepairShopCanLoadCar_True(){
        CarRepairShop testRepairShop = new CarRepairShop(5, 10, 10);
        Saab95 testSaab = new Saab95(10, 10);
        
        testRepairShop.loadCar(testSaab);
        assertEquals(1, testRepairShop.getNumberOfCarsInReapairShop());
    }
}
