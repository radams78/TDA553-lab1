
public class CarRepairShop{

    private CarLoad load;
    private double x;
    private double y;

    public CarRepairShop(double x, double y){

        this.x = x;
        this.y = y;
        this.load = new CarLoad(10);
    }   

}