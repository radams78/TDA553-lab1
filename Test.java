import java.lang.System;
import java.awt.*;
public class Test{
    public static void main(String[] args){
        double [] saabDir = {1,1};
        double [] volvoDir = {0,0};
        Saab95 saab = new Saab95(Color.red, 2, 3, saabDir);
        Volvo240 volvo = new Volvo240(Color.black, 4, 80, volvoDir);

        System.out.println("Saab" + saab.getNrDoors());
        System.out.println("Volvo" + volvo.getNrDoors());

        testMove(saab, volvo);
    }

    public static void testMove(Car saab, Car volvo){
        saab.gas(0.4);
        volvo.gas(0.3);
        for (int i = 0; i < 6000; i++){
            saab.move();
            volvo.move();

        }
            saab.turnLeft();
            volvo.turnRight();

        for (int i = 0; i < 6000; i++ ){
            saab.move();
            volvo.move();
        }
    }
}