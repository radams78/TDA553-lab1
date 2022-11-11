public class Driver {

    
    Saab95 car2 = new Saab95();

public static void main(String[] args) { // Required to run the program
    new Driver().goCar1(); 
    new Driver().goCar2(); 
}

public void goCar1() {
    Car car1 = new Volvo240();
    move(car1);
    System.out.println(car1.color);
    System.out.println(car1.modelName);
    System.out.println(car1.currentSpeed);
    System.out.println(car1.speedFactor());
}

public void goCar2() {
    Car car2 = new Saab95();
    move(car2);
    System.out.println(car2.color);
    System.out.println(car2.modelName);
    System.out.println(car2.currentSpeed);
    System.out.println(car2.speedFactor());
}

public void move(Car theCar){
    new Movable().incrementSpeed(1, theCar);
}

public void turnLeft(){

}

public void turnRight(){

}

}