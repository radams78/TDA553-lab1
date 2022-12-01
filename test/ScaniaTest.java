import static org.junit.Assert.*;


import java.awt.*;

import org.junit.jupiter.api.Test;


public class ScaniaTest {
    @Test
    public void if_flatbed_is_not_0_degrees_Scania_should_not_be_able_to_move(){
        Scania scania = new Scania(4, 100, 0, Color.red);
            scania.getFlatbed().raise();
            scania.gas(1);
            scania.startEngine();
            assertEquals(0, scania.getCurrentSpeed(), 0.1);
    }

    

}
