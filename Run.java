public class Run {
    public static void main(String[] args) {
        Volvo240 volvo = new Volvo240();
        System.out.println("\n" + volvo.toString());
        Saab95 saab = new Saab95();
        System.out.println("\n" + saab.toString());
        volvo.incrementSpeed(10);
        for (int i = 0; i < 10; i++){
            volvo.move();
            System.out.printf("%.2f, %.2f\n", volvo.getX(), volvo.getY());
            // volvo.turnLeft();
        }

    }
}
