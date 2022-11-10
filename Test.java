import java.lang.System;
public class Test{
    public static void main(String[] args){
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        System.out.println("Saab" + saab.getNrDoors());
        System.out.println("Volvo" + volvo.getNrDoors());
    }
}
