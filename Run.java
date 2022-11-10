
public class Run {
    public static void main(String[] args) {
        Volvo240 myVolvo = new Volvo240();
        myVolvo.startEngine();
        myVolvo.gas(1000);
        myVolvo.move();
    }
}
