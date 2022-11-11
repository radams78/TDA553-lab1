import java.lang.System;
import java.awt.*;
public class Test{
    public static void main(String[] args){
        Saab95 saab = new Saab95(Color.red);
        Volvo240 volvo = new Volvo240(Color.black);

        System.out.println("Saab" + saab.getNrDoors());
        System.out.println("Volvo" + volvo.getNrDoors());

        testMove();
    }

    public static void testMove(){
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