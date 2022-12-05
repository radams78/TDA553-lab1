import java.util.*;     //gör test för alla

public class Content {
    private Stack<Car> loadcarslist;
    Platform platform;

    // constructor for content
    protected int xPos;
    protected int yPos;

    public Content(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

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

    public void move(){
        for (Car car : loadcarslist) {
            car.setxPos(xPos);
            car.setyPos(yPos);
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
