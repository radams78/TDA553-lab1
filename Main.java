import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.*;
import org.junit.Test;
import org.junit.Assert.*;
public class Main {
    public static void main(String[] args) {

    
    }
    @Test
    public void test_gas_and_break(){
        Saab95 type1=new Saab95(2, 125, 0, Color.RED, "Saab95", 0, 0, false, false);
        Volvo240 v70=new Volvo240(4, 100, 0, Color.black, "Volvo204", 0, 0, false, false);
        type1.startEngine();
        v70.startEngine();
        type1.gas(1.1);
        assertEquals(0.1, type1.getCurrentSpeed());
        v70.brake(-1);
        assertEquals(0.1, v70.getCurrentSpeed());
    }
    @Test
    public void test_decrement_speed_when_speed_is_0_and_increment_speed_when_maxed(){
        Saab95 type1=new Saab95(2, 125, 0, Color.RED, "Saab95", 0, 0, false, false);
        Volvo240 v70=new Volvo240(4, 100, 0, Color.black, "Volvo204", 0, 0, false, false);
        type1.setCurrentSpeed(type1.getEnginePower());
        type1.gas(0.5);
        v70.setCurrentSpeed(v70.getEnginePower());
        v70.gas(0.5);
        assertEquals(125, type1.getCurrentSpeed());
        assertEquals(100, v70.getCurrentSpeed());
        type1.setCurrentSpeed(0);
        type1.brake(0.5);
        v70.setCurrentSpeed(0);
        v70.brake(0.5);
        assertEquals(0, type1.getCurrentSpeed());
        assertEquals(0, v70.getCurrentSpeed());

    }
}
