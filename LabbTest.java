
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayDeque;

import org.junit.Test;

public class LabbTest {
    
    
    @Test
    public void test_move_car_to_the_left(){

        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.move();
        volvo.move();
        
        assertEquals(-1, saab.getX(), 0.001);
        assertEquals(-1, volvo.getX(), 0.001);
    } 

    @Test
    public void test_turn_car_then_move(){
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.turnLeft();
        volvo.turnLeft();

        saab.move();
        volvo.move();

        assertEquals(-1, saab.getY(), 0.001);
        assertEquals(-1, volvo.getY(), 0.001);

    } 

    @Test
    public void test_brake_and_gas() throws Exception {
        
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.startEngine();
        volvo.startEngine();

        assertEquals(1, saab.getCurrentSpeed(), 0.001);
        assertEquals(1, volvo.getCurrentSpeed(), 0.001);

        saab.brake(1);
        volvo.brake(1);

        assertEquals(0, saab.getCurrentSpeed(), 0.001);
        assertEquals(0, volvo.getCurrentSpeed(), 0.001);

       
    }

    @Test
    public void test_illegal_arguments_for_brake_and_gas(){
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        assertThrows(IllegalArgumentException.class, () -> {
            saab.brake(-1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.brake(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            saab.gas(-1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            volvo.gas(-1);
        });
    }

    
    @Test
    public void test_trucks_plattform_functions(){

        Truck scaniaTruck = new Scania();
        Truck carTransporter = new CarTransporter();

        assertEquals(0, scaniaTruck.getPlatformState());
        assertEquals(0, carTransporter.getPlatformState());

        scaniaTruck.platformUp(10);
        carTransporter.platformUp(1);

        assertEquals(10, scaniaTruck.getPlatformState());
        assertEquals(1, carTransporter.getPlatformState());
    }

    @Test
    public void test_load_function(){

        Truck carTransporter = new CarTransporter();
        Car saab = new Saab95();
        Car volvo = new Volvo240();
        ArrayDeque<Car> cars = new ArrayDeque<>();

        cars.add(volvo);
        cars.add(saab);
        carTransporter.load(volvo);
        carTransporter.load(saab);

        carTransporter.load(volvo);

    }   
  
}
