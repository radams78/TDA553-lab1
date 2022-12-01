

public class CarRepairShop implements CarLoadable{

    private CarLoad load;
    private double x;
    private double y;

    public CarRepairShop(double x, double y){

        this.x = x;
        this.y = y;
        this.load = new CarLoad(10);
    }

    @Override
    public void load(Car c) {
        load.load(getX(), getY(), c);
    }
    

    @Override
    public void unload() {
        load.unload(getX(), getY());
        
    }   

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}