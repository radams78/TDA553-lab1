package com.tda553;

import org.junit.Before;
import org.junit.Test;

import com.tda553.Models.Vehicle;
import com.tda553.VehicleTypes.Cars.Saab95;
import com.tda553.VehicleTypes.Cars.Volvo240;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.List;

public class CarTest
{

    private static List<Vehicle> cars = new ArrayList<>();

    @Before
    public void setUp()
    {
        cars.add(new Volvo240());
        cars.add(new Saab95());
    }


    @Test
    public void StartCars()
    {
        System.out.println(
                "Running test: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        for (Vehicle car : cars)
        {
            car.startEngine();
            car.gas(1);
            car.brake(1);
            car.stopEngine();
        }
    }


    @Test
    public void MoveCars()
    {

        int[] start_position =
        {0, 0};

        for (Vehicle car : cars)
        {
            System.out.println(car.toString());
            assertEquals(start_position[0], car.getPosition().getX());
            assertEquals(start_position[1], car.getPosition().getY());

            car.startEngine();
            car.gas(1);
            car.move();

            assertFalse(car.getPosition().getX() == start_position[0] && car.getPosition().getY() == start_position[1]);
        }


    }
}
