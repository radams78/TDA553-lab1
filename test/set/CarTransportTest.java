package set;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

public class CarTransportTest{
    
    @Test
    public void test_change_platform() {
        CarTransport carTransport = new CarTransport();
        carTransport.changePlatform();
        assertEquals(-45, carTransport.getPlatformAngle(), 0); 
    }
    
    @Test
    public void test_if_changePlatform_throws_exception(){
        assertThrows(IllegalArgumentException.class, new Executable() {

            @Override
            public void execute() throws Throwable {
                CarTransport carTransport = new CarTransport();
                carTransport.gas(0.1);
                carTransport.changePlatform();

            }
        });
    } 

    @Test
    public void test_loadCars(){
        CarTransport carTransport = new CarTransport();
        Volvo240 volvo240 = new Volvo240();
        carTransport.changePlatform();
        carTransport.loadCar(volvo240);
        carTransport.changePlatform();
        carTransport.gas(0.1);
        carTransport.move();
        assertFalse(volvo240.getX() == 0);
    }    
}