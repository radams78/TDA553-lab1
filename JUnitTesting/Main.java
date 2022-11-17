package JUnitTesting;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Volvo240 v = new Volvo240();
        Saab95   s = new Saab95();
        System.out.println(v.getNrDoors());
        System.out.println(s.getNrDoors());
    }
}