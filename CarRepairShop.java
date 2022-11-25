

public class CarRepairShop{

    private Car[] cars;
    private double x;
    private double y;

    public CarRepairShop(int capacity, double x, double y){

        this.x = x;
        this.y = y;
        this.cars = new Car[capacity];
    }   

}