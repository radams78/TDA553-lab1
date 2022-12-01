package Lab1.vehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.Test;

public class CarTransporterTest {
    @Test
    public void carTransporter_doesnt_drive_while_allow_driving_is_false() {
        CarTransporter carTransporter = new CarTransporter(1, 1d, 1d, Color.BLACK," ", 4);
        carTransporter.trailer.lowerRamp(0);
        assertEquals(0d, carTransporter.speedFactor(), 0.00000001);
    }
}
