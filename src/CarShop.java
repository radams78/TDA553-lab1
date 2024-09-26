import java.util.LinkedList;

public class CarShop {
    private int x; // X position for carshop
    private int y; // Y position for carshop
    private double radius; // Radius to check if cars are reasonably close
    private final int carAmount; // How many cars that can max be in shop
    private LinkedList<Car> carsInShop; // List if how many cars are in the shop
    private int unloadAreaX; // x position for unloading area, dont want to unload the cars on top of each other
    private int unloadAreaY; // y position for unloading area

    public CarShop(int x, int y, double radius, int carAmount, int unloadAreaX, int unloadAreaY) {

        this.x = x;
        this.y = y;
        this.radius = radius;
        this.carAmount = carAmount;
        this.unloadAreaX = unloadAreaX;
        this.unloadAreaY = unloadAreaY;
        this.carsInShop = new LinkedList<>(); // LinkedList allow us to use PUSH and POP

    }

    public int getxPos() {
        return x;
    }

    public int getyPos() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    private double calcDistance(Car car) {
        int xDif = Math.abs(car.getxPos() - this.x); // Using Pythagoras to get DISTANCE from CarShop to car
        int yDif = Math.abs(car.getyPos() - this.y);

        double distance = Math.sqrt((yDif ^ 2) + (xDif ^ 2));

        return distance;

    }

    public boolean isInDistance(Car car) {
        return calcDistance(car) <= this.radius;

    }

    public int getCarAmount() {
        return carAmount;
    }

    private boolean isCarShopFull() {
        return carsInShop.size() >= carAmount;
    }

    public int carsCurrentlyInShop() {
        return carsInShop.size();
    }

    public void loadCar(Car car) {
        // if carshop is not full and car is in reasonable distance, then we CAN load
        // car
        if (!isCarShopFull() && isInDistance(car)) {
            car.xPos = this.x;
            car.yPos = this.y;
            carsInShop.push(car); // choose to use LIFO(last in first out) principle, hence push

        }
    }

    public Car unloadCar() {
        Car car = carsInShop.pop(); // choose to use LIFO(last in first out) principle, hence pop
        car.xPos = unloadAreaX;
        car.yPos = unloadAreaY;

        return car;

    }

}
