package src;
import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTest {
    // Hämtar x-värdet i testVolvo som sattes till x=3 i konstruktorn
    @Test
    public void x_value_should_be_3() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        assertEquals(3, testVolvo.getX(), 3.0);
    }

    // Hämtar y-värdet i testVolvo som sattes till y=7 i konstruktorn
    @Test
    public void y_value_should_be_7() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        assertEquals(7, testVolvo.getY(), 7.0);
    }

    // Hämtar antal dörrar på testVolvo som sattes till 4 i konstruktorn
    @Test
    public void nrDoors_should_be_4() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        assertEquals(4, testVolvo.getNrDoors());
    }

    // Hämtar färgen från testVolvo som sattes till 'Black' i konstruktorn och sedan ändras färgen med metoden setColor till 'Red' - borde ge Color.red som svar
    @Test
    public void color_should_be_red() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.setColor(Color.red);
        assertEquals(Color.red, testVolvo.getColor());
    }

    // Hämtar färgen på testVolvo som sattes till 'Black' i konstruktorn
    @Test
    public void color_should_be_black() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        assertEquals(Color.black, testVolvo.getColor());
    }

    // Startar motorn med startEngine på testVolvo och sedan ökas hastigheten med incrementSpeed som tar in 3 som argument. Borde ge 3.85 som svar
    @Test
    public void currentSpeed_should_be_3_85() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.startEngine();
        testVolvo.incrementSpeed(3);
        assertEquals(3.85, testVolvo.getCurrentSpeed(), 3.85);
    }

    // Ändrar hastigheten till 3.85 sedan rör sig bilen, listan borde bli [3.0, 10.85]
    @Test
    public void after_move_x_should_not_change_and_y_should_be_10_85() {
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.setCurrentSpeed(3.85);
        testVolvo.move();
        ArrayList testList = new ArrayList<>();
        testList.add(testVolvo.getX()); 
        testList.add(testVolvo.getY());
        
        ArrayList trueList = new ArrayList<>();
        trueList.add(3.0); 
        trueList.add(10.85);

        assertEquals(trueList, testList);
    }

    @Test
    public void testSaab_currentSpeed_should_be_unaffected_after_gas(){
        Car testSaab = new Saab95(2, 125, Color.red, "Saab95", 0, 0);
        testSaab.startEngine();
        testSaab.gas(1.1);
        assertEquals(0.1, testSaab.getCurrentSpeed(), 0.1);
    }
    @Test
    public void testSaab_CurrentSpeed_should_be_unaffected_after_brake(){
        Car testSaab = new Saab95(2, 125, Color.red, "Saab95", 2, 5);
        testSaab.startEngine();
        testSaab.brake(-1);
        assertEquals(0.1, testSaab.getCurrentSpeed(), 0.1);

    }
    @Test
    public void testVolvo_currentSpeed_should_be_unaffected_after_gas(){
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.startEngine();
        testVolvo.gas(1.1);
        assertEquals(0.1, testVolvo.getCurrentSpeed(), 0.1);
    }
    @Test
    public void testVolvo_currentSpeed_should_be_unaffected_after_brake(){
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.startEngine();
        testVolvo.brake(-1);
        assertEquals(0.1, testVolvo.getCurrentSpeed(), 0.1);
    }
    
    @Test
    public void test_increment_speed_saab(){
        Car testSaab = new Saab95(2, 125, Color.red, "Saab95", 2, 5);
        testSaab.setCurrentSpeed(testSaab.getEnginePower());
        testSaab.gas(0.5);
        assertEquals(125, testSaab.getCurrentSpeed(), 125);
    }
    @Test
    public void test_decrement_speed_saab(){
        Car testSaab = new Saab95(2, 125, Color.red, "Saab95", 2, 5);
        testSaab.setCurrentSpeed(0);
        testSaab.brake(0.5);
        assertEquals(0, testSaab.getCurrentSpeed(), 0);
    }
    @Test
    public void test_increment_speed_volvo(){
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.setCurrentSpeed(testVolvo.getEnginePower());
        testVolvo.gas(0.5);
        assertEquals(100, testVolvo.getCurrentSpeed(), 0.1);
    }
    @Test
    public void test_decrement_speed_volvo(){
        Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
        testVolvo.setCurrentSpeed(0);
        testVolvo.brake(0.5);
        assertEquals(0, testVolvo.getCurrentSpeed(), 0.1);
    }
}
