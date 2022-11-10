import java.io.Console;

public class TestCars
{
    public static void main(String[] args)
    {
        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();

        volvo.startEngine();
        volvo.gas(1);
        volvo.move();
        System.out.println(volvo.getPosition()[0] + " " + volvo.getPosition()[1]);

        volvo.turnLeft();
        volvo.move();
        System.out.println(volvo.getPosition()[0] + " " + volvo.getPosition()[1]);

        volvo.turnLeft();
        volvo.move();
        System.out.println(volvo.getPosition()[0] + " " + volvo.getPosition()[1]);



    }
}
