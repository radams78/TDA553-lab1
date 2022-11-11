public class main {
    public static void main(String[] args){

        Car volvo = new Volvo240();
        Car saab = new Saab95();

        System.out.println(volvo.getEnginePower());
        System.out.println(saab.getCurrentSpeed());
        volvo.gas(2);
        saab.gas(4);
        System.out.println(volvo.getCurrentSpeed());
        System.out.println(saab.getCurrentSpeed());

    
    }
}
