import org.junit.Test;

public class Junit_test_class {
    @Test
    public double test(int x, int y) throws IllegalAccessException {
        if (y==0) {
            throw new IllegalAccessException("devision by zero");
        }
        return x/y;
    }

}
