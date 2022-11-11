import static org.junit.Assert.assertEquals;

import java.awt.*;

import org.junit.jupiter.api.Test;

public class Car {

    public int cardinal; // Determines direction of the car
    public double x; // X value of the car
    public double y; // Y value of the car
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    @Test
    public void testEngine() {
        startEngine();
        double expectedStartSpeed = 0.1;
        assertEquals(currentSpeed, expectedStartSpeed, 0);
        stopEngine();
        double expectedStopSpeed = 0;
        assertEquals(currentSpeed, expectedStopSpeed, 0);
    }

    @Test
    public void testDoors() {
        int expectedDoors = 5;
        nrDoors = 5;
        assertEquals(getNrDoors(), expectedDoors);
    }

    @Test
    public void testPower() {
        double expectedPower = 480.5;
        enginePower = 480.5;
        assertEquals(getEnginePower(), expectedPower, 0);
    }

    @Test
    public void testSpeed() {
        double expectedSpeed = 285.5;
        currentSpeed = 285.5;
        assertEquals(getCurrentSpeed(), expectedSpeed, 0);
    }

    @Test
    public void testGetColor() {
        Color expectedGetColor = Color.black;
        color = Color.black;
        assertEquals(getColor(), expectedGetColor);
    }

    @Test
    public void testSetColor() {
        Color expectedSetColor = Color.red;
        setColor(Color.red);
        assertEquals(color, expectedSetColor);
    }
}