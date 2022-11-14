import java.util.Scanner;

public class Run {
    

    public static void main(String[] args) throws Exception {
       new Run().program();
    }

    void program() throws Exception{
        
        Saab95 saab = new Saab95();
        Volvo240 volvo = new Volvo240();

        System.out.println("Saabs x and y: " + saab.x + ", " + saab.y);
        System.out.println("Volvos x and y: " + volvo.x + ", " + volvo.y);

        saab.move();
        volvo.move();

        System.out.println("After moving in x negative way\n");

        System.out.println("Saabs x and y: " + saab.x + ", " + saab.y);
        System.out.println("Volvos x and y: " + volvo.x + ", " + volvo.y);

        saab.turnLeft();
        volvo.turnLeft();

        saab.move();
        volvo.move();

        volvo.brake(-1);

        System.out.println("After turning left and moving\n");

        System.out.println("Saabs x and y: " + saab.x + ", " + saab.y);
        System.out.println("Volvos x and y: " + volvo.x + ", " + volvo.y);

    }

}
