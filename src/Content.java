import java.util.*;     //gör test för alla

public class Content {
    Platform platform;

    // constructor for content
    protected Stack<Car> loadcarslist;
    protected int xPos;
    protected int yPos;

    public Content(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public Stack<Car> getCarStack(Stack<Car> loadcarslist){
        return loadcarslist;
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
                loadcarslist.add(carToLoad);
            }
    }

    public void loadCars(Car carToLoad) {
        if (platform.getPlatformAngle() == platform.maxAngle) {
            findCloseCars(xPos, yPos, carToLoad);
        }
    }


    public void unloadCars() {
        if (platform.getPlatformAngle() == platform.maxAngle) {
            Car carToUnload = loadcarslist.pop();
            carToUnload.setxPos(xPos - 10); // unload next to the transporter // WANT to unload into carshop
            carToUnload.setyPos(yPos);
        }
    }
}
