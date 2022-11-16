package labb1;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.*;

public class CarTest {
    @Test
    public void saab95_has_two_doors(){
        double [] saabDir = {1,1};
        
        Saab95 saab = new Saab95(Color.red, 2, 3, saabDir);

        assertEquals(2, saab.getNrDoors());
    }
    
    @Test
    public void saab95_has_125_engine(){
        double [] saabDir = {1,1};
        
        Saab95 saab = new Saab95(Color.red, 2, 3, saabDir);

        assertEquals(125, saab.getEnginePower(), 0);
    }

    @Test
    public void saab95_gasing_increases_speed_by_amount_times_direction_times_speedFactor(){
        double [] saabDir = {1,1};
        
        Saab95 saab = new Saab95(Color.red, 2, 3, saabDir);

        saab.gas(0.1);

        assertEquals( 0.1*saab.speedFactor(), saab.getCurrentSpeedX(), 0); assertEquals(0.1*saab.speedFactor(), saab.getCurrentSpeedY(), 0); 

    }

    @Test
    public void car_moves_when_moving(){
        double [] saabDir = {1,1};
        
        Saab95 saab = new Saab95(Color.red, 2, 3, saabDir);

        saab.gas(0.1);

        double prevX = saab.getX();
        double prevY = saab.getY();

        saab.move();

        assert(saab.getX()> prevX && saab.getY()> prevY);
    }

    @Test
    public void car_speed_doesnt_get_negative_when_breaking(){
        double [] saabDir = {1,1};
        
        Saab95 saab = new Saab95(Color.red, 2, 3, saabDir);

        saab.brake(saab.getCurrentSpeedX() + 5);

        assert(saab.getCurrentSpeedX()>=0); assert(saab.getCurrentSpeedY() >= 0);
    }
}


