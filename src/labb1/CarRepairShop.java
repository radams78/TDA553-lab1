package labb1;

public class CarRepairShop {
    private Loadable loadable;
    private String name;
    public CarRepairShop(double x, double y, int max_capacity, String name){
        this.loadable = new Loadable(max_capacity, x, y);
        this.name = name; 
    }

    public void load(Car car){
        loadable.load(car);
    }   


    //Todo fix this
    public Movable unload(Car car){
        return loadable.unload(car);
    }

    public String getName(){
        return name;
    }
}
