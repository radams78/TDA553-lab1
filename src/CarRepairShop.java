public class CarRepairShop {
  Loadable loadedCars;
  private double x;
  private double y;

  public CarRepairShop(double xPos, double yPos) {
    x = xPos;
    y = yPos;
    loadedCars = new Loadable(6);
  }
  

  // public int getAmountOfLoadedCars() {
  // return loadedCars.size();
  // }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void loadCar(Car car) {
    loadedCars.loadCar(car, getX(), getY());
  }

  public void unloadLatestCar() {
    loadedCars.unloadLatestCar(getX(), getY());
  }
}