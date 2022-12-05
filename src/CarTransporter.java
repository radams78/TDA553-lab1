import java.awt.Color;
import java.util.ArrayList;


public class CarTransporter extends Truck {
    private ArrayList<Car> loadcarslist;

    int transporterx = getxPos();// should get pos from Truck?
    int transportery = getyPos();

    public CarTransporter() {
        super(2, 110, 0, Color.BLUE, "car transporter", 0, 0, Direction.NORTH);
    }

    // det ska vara max och min i platform;

    @Override
    public void openPlatform() {
        platform.setPlatformAngle(platform.maxAngle); // can we move the open and close func to Truck?
    }

    @Override
    public void closePlatform() { // platform is not in the superclass, cant override
        platform.setPlatformAngle(platform.minAngle); // can we move the open and close func to Truck?
    }

    private boolean Carxposisclose(Car car, int transporterx) { // check nearby cars in x
        if (car.getxPos() < (transporterx + 20) & car.getxPos() > (transporterx - 20)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean Caryposisclose(Car car, int transportery) { // check nearby cars in y
        if (car.getyPos() < (transportery + 20) & car.getyPos() > (transportery - 20)) {
            return true;
        } else {
            return false;
        }
    }

    public void findCloseCars(int transporterx, int transportery) {

        loadcarslist = new ArrayList<Car>(); // make a list of nearby cars

        for (Car car : Main.cars) {
            if (Carxposisclose(car, transportery) & Caryposisclose(car, transportery)) {
                loadcarslist.add(car);
            }
        }
    }

    public void loadCars() {
        content.loadCars;
        platform.openPlatform();
        if (platform.getPlatformAngle() == platform.maxAngle) {
                //TODO FIX THIS Hälsningar Anna
                for (Car car : loadcarslist) { // unload = yeet from list
                car.setxPos(transporterx); // unload next to the transporter // WANT to unload into carshop
                car.setyPos(transportery);
                }
    public void unloadCars() {
        content.unloadCars;
        if (platform.getPlatformAngle() == platform.maxAngle) {
            for (Car car : loadcarslist) { // unload = yeet from list
                car.setxPos(transporterx - 10); // unload next to the transporter // WANT to unload into carshop
                car.setyPos(transportery);
            }
        }
    }

}
