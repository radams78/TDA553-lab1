package labb1;

/**
 * Superclass contract for any movable object
 */
public interface Movable {

    /**
     * Moves the object
     */
    void move();

    /**
     * Turns the object to the left
     */
    void turnLeft();

    /**
     * Turns the object to the right
     */
    void turnRight();

    /**
     * Get the object's x value
     */
    double getX();

    /**
     * Get the object's y value
     */
    double getY();
}
