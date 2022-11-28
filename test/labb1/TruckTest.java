package labb1;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.awt.*;

public class TruckTest {
    @Test
    public void scania_is_subtype_of_truck(){
        Scania scania = new Scania(Color.yellow, 2, 3, 1, 1, 300);

        assert(scania instanceof Truck);

    }
}
