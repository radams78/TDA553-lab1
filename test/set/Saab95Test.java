package set;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class Saab95Test {// Done!
    @Test
    public void test_if_saab_subclass_of_Car() {
        Saab95 saab = new Saab95();
        assertTrue(saab instanceof Car);
    }
}
