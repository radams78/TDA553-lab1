package labb1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.awt.*;

public class TruckTest {
    @Test
    public void scania_is_subtype_of_truck() {
        Scania scania = new Scania(Color.yellow, 2, 3, 1, 1);

        assert (scania instanceof Truck);

    }

    @Test
    public void dumper_doesnt_extend_all_the_way() {
        Scania scania = new Scania(Color.yellow, 2, 3, 1, 1);
        scania.extendPlatform();

        System.out.println(scania.getTrailer().getPlatformAngle());

        assert (scania.getTrailer().getPlatformAngle() < 70);
    }

    @Test
    public void car_transporter_loading_throws_error_at_end() {
        CarTransporter trnsp = new CarTransporter(Color.blue, 0, 0, 0, 0, 1);
        trnsp.load(new Saab95(null, 0, 0, 0, 0));
        assertThrows(IllegalStateException.class, () -> {
            trnsp.load(new Saab95(null, 0, 0, 0, 0));
        });
    }
}
