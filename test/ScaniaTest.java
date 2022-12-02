import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;


public class ScaniaTest {
    @Test
    public void if_flatbed_is_not_0_degrees_Scania_should_not_be_able_to_gas(){
        Scania scania = new Scania(4, 100, 0, Color.red);
            scania.raise();
            scania.gas(1);
            assertEquals(0, scania.getCurrentSpeed(), 0.1);
    }

    @Test
    public void if_flatbed_is_not_0_degrees_Scania_should_not_be_able_to_start_engine(){
        Scania scania = new Scania(4, 100, 0, Color.red);
            scania.raise();
            scania.startEngine();
            assertEquals(0, scania.getCurrentSpeed());
    }

}
