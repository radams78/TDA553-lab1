package Lab1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.jupiter.api.*;

import Lab1.Car.Direction;

public class CarTest {
    @Test
    public void direction_next_test() {
        assertEquals(Direction.LEFT, Direction.DOWN.next());
        assertEquals(Direction.UP, Direction.LEFT.next());
        assertEquals(Direction.RIGHT, Direction.UP.next());
        assertEquals(Direction.DOWN, Direction.RIGHT.next());
    }

    @Test
    public void direction_prev_test() {
        assertEquals(Direction.LEFT, Direction.UP.prev());
        assertEquals(Direction.UP, Direction.RIGHT.prev());
        assertEquals(Direction.RIGHT, Direction.DOWN.prev());
        assertEquals(Direction.DOWN, Direction.LEFT.prev());
    }
}
