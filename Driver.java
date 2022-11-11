public class Driver {

    
    Saab95 car2 = new Saab95();

public static void main(String[] args) { // weird java
    new Driver().goCar1(); 
}

public void goCar1() {
    Car car1 = new Volvo240();
    move(car1);
    System.out.println(car1.color);
    System.out.println(car1.modelName);
    System.out.println(car1.currentSpeed);
    System.out.println(car1.speedFactor());
}

public void move(Car car1){
    new Movable().incrementSpeed(1, car1);
}

public void turnLeft(){

}

public void turnRight(){

}

}