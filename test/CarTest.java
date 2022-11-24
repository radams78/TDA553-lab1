import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertThrows;

// import org.junit.Before;
import org.junit.Test;


public class CarTest {
  

  // @Test
  // public void can_not_create_object_from_car(){
  //   Car testCar = new Car();
  //   assertThrows(InstantiationError.class, () -> {
  //   });

  // }

  @Test
  public void can_create_volvo() {
    Car testVolvo = new Volvo240();
    assertEquals(testVolvo, testVolvo);

  }
  @Test
  public void can_create_saab() {
    Car test_saab = new Saab95();
    assertEquals(test_saab, test_saab);

  }
}