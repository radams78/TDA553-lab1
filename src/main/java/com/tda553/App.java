package com.tda553;

import com.tda553.VehicleTypes.Cars.*;

public class App
{
    public static void main(String[] args)
    {
        Volvo240 green_volvo = new Volvo240();
        Saab95 red_saab = new Saab95();
        System.out.println("Green volvo: " + green_volvo);
        System.out.println("Red saab: " + red_saab);
    }
}
