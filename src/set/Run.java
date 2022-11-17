package set;

public class Run {
    public static void main(String[] args) {
        Volvo240 volvo = new Volvo240();
        System.out.println("\n" + volvo.toString());
        volvo.incrementSpeed(10);
        System.out.println("\n" + volvo.toString());

        for (int i = 0; i < 10; i++){
            volvo.move();
            System.out.printf("%.2f, %.2f, %f\n", volvo.getX(), volvo.getY(), volvo.getDirection());
            if (i % 2 ==0) volvo.turnLeft();
        }

    }
}
