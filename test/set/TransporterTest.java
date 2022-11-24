// --- Packages --- //

package set;


// --- Imports --- ///

import org.junit.Before;
import org.junit.Test;
import set.Transporter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.*;


// --- Tests --- //

public class TransporterTest {
    private Transporter transporter = new Transporter(2, Color.black, 100, "Transporter");
    
    @Before
    public void reset_transporter(){
        transporter = new Transporter(2, Color.black, 100, "Transporter");
    }

    @Test
    public void transporter_should_only_gas_when_ramp_is_up() {

    }
}