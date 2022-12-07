package set;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class CarRepairShopTest{

    @Test
    public void test_if_loadCar_throws_exception(){
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable { 
                Volvo240 volvo240 = new Volvo240();
                CarRepairShop carRepairShop = new CarRepairShop("BertillsShop", 12, 12, 13);
                carRepairShop.loadCar(volvo240);
            }
        });
    }
}