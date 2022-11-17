import org.junit.Test;

import static org.junit.Assert.*;

public class Junit_test_classTest {

    public void test1() throws IllegalAccessException {
        Junit_test_class tester = new Junit_test_class();
        assertEquals("10 / 5 must be 2",2, tester.test(10,5));
    }
}