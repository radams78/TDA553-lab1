package com.tda553;

import org.junit.Before;
import org.junit.Test;

import com.tda553.Vehicles.Saab95;
import com.tda553.Vehicles.Volvo240;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import java.util.Arrays;
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
            assertArrayEquals(start_position, car.getPosition());

            car.startEngine();
            car.gas(1);
            car.move();

            assertFalse(Arrays.equals(car.getPosition(), start_position));

        }


    }
}
