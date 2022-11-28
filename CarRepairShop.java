
public class CarRepairShop{

    private LoadFunktion load;
    private double x;
    private double y;

    public CarRepairShop(double x, double y){

        this.x = x;
        this.y = y;
        this.load = new LoadFunktion(10);
    }   

}