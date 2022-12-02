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
}
