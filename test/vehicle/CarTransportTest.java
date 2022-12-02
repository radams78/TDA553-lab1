package vehicle;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class CarTransportTest {
    @Test
    public void if_flatbedUp_is_false_CarTransprot_should_not_be_able_to_move(){
        CarTransport transport = new CarTransport(4, 100, 0, Color.red, 2);
        transport.lower();
        transport.startEngine();
        transport.gas(1);
        assertEquals(0, transport.getCurrentSpeed(), 0.1);
    }
    @Test
    public void load_is_able_to_load(){
        CarTransport ivecoTurbostar = new CarTransport(4, 100, 0, Color.RED, 10);
        Car saab95 = new Saab95(4, 100, 50, Color.RED);
        ivecoTurbostar.lower();
        ivecoTurbostar.load(saab95);
        assertTrue(saab95.getLoaded());
        }
    
    @Test
    public void load_is_unable_to_load_because_of_distance(){
        CarTransport ivecoTurbostar = new CarTransport(4, 100, 0, Color.RED, 10);
        Car saab95 = new Saab95(4, 100, 50, Color.RED);
        saab95.gas(1);
        saab95.move();
        ivecoTurbostar.lower();
        ivecoTurbostar.load(saab95);
        assertFalse(saab95.getLoaded());
        }
    
    @Test
    public void load_is_unable_to_load_because_flatbed_is_up(){
        CarTransport ivecoTurbostar = new CarTransport(2, 100, 0, Color.RED, 4);
        Car saab95 = new Saab95(4, 100, 0, Color.RED);
        ivecoTurbostar.load(saab95);
        assertFalse(saab95.getLoaded());
        }

    @Test
    public void load_is_able_to_unload(){
        CarTransport ivecoTurbostar = new CarTransport(4, 100, 0, Color.RED, 10);
        Car saab95 = new Saab95(4, 100, 50, Color.RED);
        ivecoTurbostar.lower();
        ivecoTurbostar.load(saab95);
        ivecoTurbostar.unload(saab95);
        assertFalse(saab95.getLoaded());
    }

    @Test
    public void load_is_unable_to_unload_becasue_flatbed_is_up(){
        CarTransport ivecoTurbostar = new CarTransport(4, 100, 0, Color.RED, 10);
        Car saab95 = new Saab95(4, 100, 50, Color.RED);
        ivecoTurbostar.lower();
        ivecoTurbostar.load(saab95);
        ivecoTurbostar.raise();
        ivecoTurbostar.unload(saab95);
        assertTrue(saab95.getLoaded());
    }


    }

