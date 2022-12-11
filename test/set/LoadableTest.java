// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.Loadable;
import set.MVC.Model.Saab95;

import static org.junit.Assert.assertEquals;
import java.awt.*;


// --- Tests --- //

public class LoadableTest {
    private Loadable loadable = new Loadable(10);
    private Saab95 saab95 = new Saab95(2, Color.red, 125, "Saab95");

    @Before
    public void reset_transporter(){
        Loadable loadable = new Loadable(10);
        saab95 = new Saab95(2, Color.red, 125, "Saab95");
    }

    @Test
    public void loadable_should_not_be_able_to_load_at_a_distance_greater_or_equal_to_15() {
        loadable.loadCar(saab95, 20, 20);
        assertEquals(loadable.getAmountOfCarsLoaded(), 0);
    }

    @Test
    public void loadable_should_be_able_to_load_at_a_distance_lesser_than_15() {
        loadable.loadCar(saab95, 0, 0);
        assertEquals(loadable.getAmountOfCarsLoaded(), 1);
    }

    @Test
    public void loadable_should_not_be_able_to_load_above_capacity() {
        for (int i = 0; i <= 11; i++) {
            loadable.loadCar(saab95, 0, 0);
        }
        assertEquals(loadable.getAmountOfCarsLoaded(), 10);
        
    }
    
    @Test
    public void loadable_should_not_be_able_to_unload_an_empty_list() {
        loadable.unloadCar();
        assertEquals(loadable.getAmountOfCarsLoaded(), 0);
    }
    
}