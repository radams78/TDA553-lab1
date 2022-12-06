
public class Main {
    public static void main(String[]args){
        Car volvo = new Volvo240();

        while(true){
        volvo.move();
        System.out.println("X: " + volvo.getX());
        System.out.println("Y: " + volvo.getY());
        }
    }
}

class testClass {


}