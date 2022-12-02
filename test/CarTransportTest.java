import static org.junit.Assert.*;

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
    }

