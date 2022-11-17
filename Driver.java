public class Driver {
    Car car1;
    Car car2;
public static void main(String[] args) { // Required to run the program
    Car car1 = new Volvo240(); 
    Car car2 = new Saab95();
    while (true){
        new Movable().move(car1);
        new Movable().move(car2);
        System.out.printf("The location of the Volvo is x: %d, Y: %d", car1.getX(), car1.getY());
        System.out.printf("The location of the Volvo is x: %d, Y: %d", car2.getX(), car2.getY());
    }

}

// public void goCar1() {
//     Car car1 = new Volvo240();
//     new Movable().move(car1);
//     System.out.println(car1.color);
//     System.out.println(car1.modelName);
//     System.out.println(car1.currentSpeed);
//     System.out.println(car1.speedFactor());
// }

// public void goCar2() {
//     Car car2 = new Saab95();
//     new Movable().move(car2);
//     System.out.println(car2.color);
//     System.out.println(car2.modelName);
//     System.out.println(car2.currentSpeed);
//     System.out.println(car2.speedFactor());
// }
}