import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class TestCars
{

    private static List<Car> cars = new ArrayList<>();


    @BeforeAll
    public static void setUp() {
        cars.add( new Volvo240() );
        cars.add( new Saab95() );
    }
    

    @Test
    @DisplayName("Start and stop engine")
    public void testStartCars()
    {
        for (Car car : cars)
        {
            car.startEngine();
            car.gas(1);
            car.brake(1);
            car.stopEngine();
        }
    }


    @Test
    @DisplayName("Move the cars")
    public void testMoveCars()
    {
        int[] start_position = { 0, 0};
        for (Car car : cars)
        {
            assertEquals(car.getPosition(), start_position);
            
            car.startEngine();
            car.gas(1);
            car.move();

            assertNotEquals(car.getPosition(), start_position);

            System.out.println(car.getPosition()[0] + " " + car.getPosition()[1]);
        }

        
    }

}
