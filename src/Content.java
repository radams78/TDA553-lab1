import java.util.*;     //gör test för alla

public class Content {
    Platform platform;

    // constructor for content
    protected Stack<Car> loadedCars;
    protected int xPos;
    protected int yPos;
    private int carAmount;

    public Content(int xPos, int yPos, int carAmount) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.carAmount = carAmount;
    }

    public void SetCaramount(Stack<Car> loadedCars){
        carAmount = loadedCars.size();
    }
    public int GetCaramount(Stack<Car> loadedCars){
        return carAmount;
    }

    public Stack<Car> getCarStack(Stack<Car> loadedCars){
        return loadedCars;
    }

    private boolean Carxposisclose(Car car, int xPos) { // check nearby cars in x
        if (car.getxPos() < (xPos + 20) & car.getxPos() > (xPos - 20)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean Caryposisclose(Car car, int yPos) { // check nearby cars in y
        if (car.getyPos() < (yPos + 20) & car.getyPos() > (yPos - 20)) {
            return true;
        } else {
            return false;
        }
    }

    public void findCloseCars(int xPos, int yPos, Car carToLoad) {
        if (Carxposisclose(carToLoad, yPos) & Caryposisclose(carToLoad, yPos)) {
                loadedCars.add(carToLoad);
            }
    }

    public void loadCars(Car carToLoad) {
        if (platform.getPlatformAngle() == platform.maxAngle) {
            findCloseCars(xPos, yPos, carToLoad);
        }
    }


    public void unloadCars() {
        if (platform.getPlatformAngle() == platform.maxAngle) {
            Car carToUnload = loadedCars.pop();
            carToUnload.setxPos(xPos - 10); // unload next to the transporter // WANT to unload into carshop
            carToUnload.setyPos(yPos);
        }
    }
}
