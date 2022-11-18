// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;
import set.Saab95;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.*;


// --- Tests --- //

public class Saab95Test {

    // Test for speed factor without turbo
    @Test
    public void speed_factor_should_increase_without_turbo() {
        Saab95 saab95 = new Saab95(2, Color.red, 125, "Saab95");
        assertTrue(saab95.getEnginePower() * 0.01 * 1 == saab95.speedFactor());
    }
    // Test for speed factor with turbo
    @Test
    public void speed_factor_should_increase_with_turbo() {
        Saab95 saab95 = new Saab95(2, Color.red, 125, "Saab95");
        saab95.setTurboOn();
        assertTrue(saab95.getEnginePower() * 0.01 * 1.3 == saab95.speedFactor());
    }

}