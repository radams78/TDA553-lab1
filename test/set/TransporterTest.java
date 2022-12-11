// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;

import set.MVC.Model.Car;
import set.MVC.Model.Transporter;
import set.MVC.Model.Volvo240;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.awt.*;


// --- Tests --- //

public class TransporterTest {
    private Transporter transporter = new Transporter(2, Color.black, 100, "Transporter", 8);
    private Car car = new Volvo240(2, Color.red, 100, "null");

    @Before
    public void reset_transporter(){
        transporter = new Transporter(2, Color.black, 100, "Transporter", 8);
        car = new Volvo240(2, Color.red, 100, "null");
        transporter.startEngine();
    }

    @Test
    public void transporter_should_be_able_to_gas_when_ramp_is_up() {
        transporter.raiseRamp();
        transporter.gas(1);
        assertTrue(transporter.getCurrentSpeed() > 0);
    }

    @Test
    public void transporter_should_not_be_able_to_gas_when_ramp_is_down() {
        transporter.lowerRamp();
        transporter.gas(1);
        assertTrue(transporter.getCurrentSpeed() == 0);
    }

    @Test
    public void transporter_should_not_be_able_to_lower_ramp_while_moving() {
        transporter.gas(1);
        transporter.lowerRamp();
        assertEquals(transporter.getRampPosition(), false);
        
    }

    @Test
    public void carCanNotLoadWhenRampIsUp(){
        transporter.raiseRamp();
        transporter.loadCar(car);
        assertEquals(transporter.getAmountOfCarsLoaded(), 0);
        
        
    }
    @Test
    public void carCanLoadWhenRampIsDown(){
        transporter.lowerRamp();
        transporter.loadCar(car);
        assertEquals(transporter.getAmountOfCarsLoaded(), 1);
        
    }
    @Test
    public void carFollowsTransporterWhenMoving(){
        transporter.lowerRamp();
        transporter.loadCar(car);
        transporter.move();
        assertEquals(transporter.getXPosition(), car.getXPosition(), 0.001);
        
    }
        
}