// import static java.lang.System.out;

public class Movable {
    Volvo240 car1 = new Volvo240();
    Saab95 car2 = new Saab95();
    


    public static void main(String[] args) { // weird java
        new Movable().go(); }
    

    private void go() { // method that actully does something callaed from java main
        int a = car1.nrDoors;
        System.out.println(a + car2.nrDoors);
    }
}
