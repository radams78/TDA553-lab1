package src;
import java.awt.*;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CarTest {

    // Skapar testbilar som används i testen
    Car testVolvo = new Volvo240(4, 100, Color.black, "Volvo240", 3, 7);
    Car saab = new Saab95(2, 125, Color.red, "Saab95", 2, 5);
    
    // Testar de gemensamma metoderna i Car

    // Hämtar x-värdet i testVolvo som sattes till x=3 i konstruktorn
    @Test
    public void should_get_3() {
        assertEquals(testVolvo.getX(), 3, 3.0);
    }

    // Hämtar y-värdet i testVolvo som sattes till y=7 i konstruktorn
    @Test
    public void should_get_7() {
        assertEquals(testVolvo.getY(), 7, 7.0);
    }

    // Hämtar antal dörrar på testVolvo som sattes till 4 i konstruktorn
    @Test
    public void should_get_4_doors() {
        assertEquals(testVolvo.getNrDoors(), 4);
    }

    // Hämtar färgen på testVolvo som sattes till 'Black' i konstruktorn
    @Test
    public void color_should_be_black() {
        assertEquals(testVolvo.getColor(), Color.black);
    }

    // Hämtar färgen från testVolvo som sattes till 'Black' i konstruktorn och sedan ändras färgen med metoden setColor till 'Red' - borde ge Color.red som svar
    @Test
    public void color_should_be_red() {
        testVolvo.setColor(Color.red);
        assertEquals(testVolvo.getColor(), Color.red);
    }

    // Startar motorn med startEngine på testVolvo och sedan ökas hastigheten med incrementSpeed som tar in 3 som argument. Borde ge 3.85 som svar
    @Test
    public void current_speed_should_be_3_85() {
        testVolvo.startEngine();
        testVolvo.incrementSpeed(3);
        assertEquals(testVolvo.getCurrentSpeed(), 3.85, 3.85);
    }

    // Ändrar hastigheten till 3.85 sedan rör sig bilen, listan borde bli [3.0, 10.85]
    @Test
    public void after_move_x_should_not_change_and_y_should_be_10_85() {
        testVolvo.setCurrentSpeed(3.85);
        testVolvo.move();
        ArrayList testList = new ArrayList<>();
        testList.add(testVolvo.getX()); 
        testList.add(testVolvo.getY());
        
        ArrayList trueList = new ArrayList<>();
        trueList.add(3.0); 
        trueList.add(10.85);

        assertEquals(testList, trueList);
    }
}
