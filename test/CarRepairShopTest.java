import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class CarRepairShopTest{
    @Test
    public void maxNumberOfCars_should_not_be_below_1(){
        CarRepairShop carRepairShop = new CarRepairShop(-50, 0);
        assertEquals(1, carRepairShop.getMaxNumberOfCars());
    }

    @Test 
    public void currentNumberOfCars_should_be_incremented_by_1(){
        CarRepairShop carRepairShop = new CarRepairShop(5, 0);
        carRepairShop.load();
        assertEquals(1, carRepairShop.getCurrentNumberOfCars());
}
}