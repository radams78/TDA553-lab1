// import static java.lang.System.out;

public class Movable {
    public double currentSpeed;

    // private void go() { // method that actully does something callaed from java main
    //     int a = car1.nrDoors;
    //     System.out.println(a + car2.nrDoors);
    // }

    public void incrementSpeed(double amount, Car currentCar){
	    currentSpeed = Math.min(currentCar.getCurrentSpeed() + currentCar.speedFactor() * amount, currentCar.enginePower);
    }

    public void decrementSpeed(double amount, Volvo240 currentCar){
        currentSpeed = Math.max(currentCar.getCurrentSpeed() - currentCar.speedFactor() * amount, 0);
    }

    // TODO fix this method according to lab pm
    public void gas(double amount, Volvo240 currentCar){
        incrementSpeed(amount, currentCar);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount, Volvo240 currentCar){
        decrementSpeed(amount, currentCar);

    }
    
    public void move(Car car){
        //Straight forward is 0
        if(car.getDirection() == 0) {
            car.setDy(car.getY() + (int)car.getCurrentSpeed());
        }
        //"Right way from the start" is 1
        else if(car.getDirection() == 1) {
            car.setDx(car.getX() + (int)car.getCurrentSpeed());
        }
        //Back the way we came is 2 
        else if(car.getDirection() == 2) {
            car.setDy(car.getY() - (int)car.getCurrentSpeed());
        }
        //"Left" way from the starting point is 3
        else if(car.getDirection() == 1) {
            car.setDx(car.getX() - (int)car.getCurrentSpeed());
        }
    }

    public void turnLeft(Car car){
        if (car.getDirection() == 0) 
            car.setDirection(3);
        else 
            car.setDirection(car.getDirection() - 1); 
    }
    
    public void turnRight(Car car){
        if (car.getDirection() == 3) {
            car.setDirection(0);
        }
        else {
            car.setDirection(car.getDirection() + 1);
        }
    }
        

}