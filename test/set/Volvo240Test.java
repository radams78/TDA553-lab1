package set;
import org.junit.Before;
import org.junit.Test;
import set.Volvo240;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.*;
import java.nio.channels.Pipe;

public class Volvo240Test {    
    private Volvo240 volvo = new Volvo240(2, Color.BLUE, 100, "Volvo");

    @Before
    public void reset_volvo(){
        volvo = new Volvo240(2, Color.BLUE, 100, "Volvo");
    }

    
}