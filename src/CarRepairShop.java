public class CarRepairShop{
    Loadable loadedCars;
    public CarRepairShop(){
            int x = x;
            int y = y;
            loadedCars = new Loadable(6);
            
        }
    // public int getAmountOfLoadedCars() {
    //     return loadedCars.size();
    // }

    public void loadCar(Car car){
       loadedCars.loadCar(car, this);
    }

    public void unloadLatestCar(){
      loadedCars.unloadLatestCar(this);
    }
}