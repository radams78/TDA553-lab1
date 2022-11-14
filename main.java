import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Car Volvo = new Volvo240();

        while (true){
        Volvo.move();
        System.out.println("X: " + Volvo.getX());
        System.out.println("Y: " + Volvo.getY());
        }
    }
}

class testClass {


}