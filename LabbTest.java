
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
        
        assertEquals(-0.1, saab.getX(), 0.001);
        assertEquals(-0.1, volvo.getX(), 0.001);
    } 

    @Test
    public void test_turn_car(){
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.turnLeft();
        volvo.turnLeft();

        assertEquals(2, saab.getCurrentDirection(), 0.001);
        assertEquals(2, volvo.getCurrentDirection(), 0.001);

        saab.turnRight();
        volvo.turnRight();

        assertEquals(3, saab.getCurrentDirection());
        assertEquals(3, volvo.getCurrentDirection());
    } 

    @Test 
    public void test_move_car(){

        Car volvo = new Volvo240();

        assertEquals(0, volvo.getX(), 0.001);

        volvo.move();

        assertEquals(-0.1, volvo.getX(), 0.001);
    }


    @Test
    public void test_brake_and_gas() throws Exception {
        
        Car saab = new Saab95();
        Car volvo = new Volvo240();

        saab.startEngine();
        volvo.startEngine();

        assertEquals(0.1, saab.getCurrentSpeed(), 0.001);
        assertEquals(0.1, volvo.getCurrentSpeed(), 0.001);

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

        CarTransporter carTransporter = new CarTransporter();
        Car saab = new Saab95();
        Car volvo = new Volvo240();
        ArrayDeque<Car> cars = new ArrayDeque<>();

        cars.add(volvo);
        cars.add(saab);
        carTransporter.load(volvo);
        carTransporter.load(saab);

        assertEquals(cars, carTransporter.getCars());
    }   
  
}
