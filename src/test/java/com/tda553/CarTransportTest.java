package com.tda553;
import com.tda553.Vehicles.CarTransport;
import org.junit.Test;

public class CarTransportTest {

    CarTransport euro_truck = new CarTransport();

    @Test(expected = IllegalArgumentException.class)
    public void  PlatformAngleTest() {
        // Raise the platform more that the maximum angle
        euro_truck.raisePlatform(2);
        euro_truck.lowerPlatform(-2);
    }

    @Test(expected = IllegalStateException.class)
    public void CanChangeAngleIfOnlyStatoionary() {
        // Raise the platform more that the maximum angle
        euro_truck.startEngine();
        euro_truck.gas(1);
        euro_truck.move();
        euro_truck.raisePlatform(1);
        euro_truck.lowerPlatform(1);
        euro_truck.brake(1);
        euro_truck.stopEngine();
    }




}
