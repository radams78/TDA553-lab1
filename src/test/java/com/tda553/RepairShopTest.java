package com.tda553;

import org.junit.Test;

import com.tda553.Models.RepairShop;
import com.tda553.VehicleTypes.Cars.Volvo240;

public class RepairShopTest {
    RepairShop gbg_repair = new RepairShop(0, 0);

    Volvo240 volvo = new Volvo240();

    @Test
    public void loadVehicleTest() {
        gbg_repair.loadVehicle(this.volvo);
    }

    @Test
    public void unloadVehicleTest() {
        this.loadVehicleTest();
        gbg_repair.unloadVehicle(this.volvo);
    }

    @Test( expected = IllegalStateException.class)
    public void loadDistantVehicleTest() {
        volvo.setPosition(10, 10);
        gbg_repair.loadVehicle(this.volvo);
    }

}
