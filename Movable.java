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

}
