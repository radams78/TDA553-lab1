import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class CarRepairShopTest {
    CarRepairShop carRepairShop;
    Car carToBeLoaded;
    @Before
    public void resetCarRepairShop(){
    carRepairShop = new CarRepairShop(0,0);
    carToBeLoaded = new Saab95();
    
    }
    
    @Test
    public void can_load_car_when_load_is_empty_and_is_in_range(){
     carRepairShop.loadCar(carToBeLoaded);
    assertTrue(carRepairShop.loadedCars.getAmountOfLoadedCars() == 1);
    }

    @Test
    public void can_not_load_car_when_load_is_full_and_is_in_range(){
      for(int i = 0; i<6; i++){
        
        carRepairShop.loadCar(carToBeLoaded);
      }
    carRepairShop.loadCar(carToBeLoaded);
    assertTrue(carRepairShop.loadedCars.getAmountOfLoadedCars() == 6);
    }

    @Test
    public void can_not_load_car_when_load_is_empty_and_is_not_in_range_20(){
     carToBeLoaded.setY(20);
     carRepairShop.loadCar(carToBeLoaded);
    assertTrue(carRepairShop.loadedCars.getAmountOfLoadedCars() == 0);
    }

}
