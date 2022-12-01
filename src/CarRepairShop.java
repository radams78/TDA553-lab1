public class CarRepairShop implements Load{
    private int maxNumberOfCars;
    private int currentNumberOfCars;
    private double x;
    private double y;

    public CarRepairShop(int maxNumberOfCars, int currentNrOfCars, double x, double y){
        this.maxNumberOfCars = Math.max(maxNumberOfCars, 1);
        this.currentNumberOfCars = 0;
        this.x = x;
        this.y = y;
    }
    
    public int getCurrentNumberOfCars() {
        return currentNumberOfCars;
    }

    public void setCurrentNumberOfCars(int currentNumberOfCars) {
        this.currentNumberOfCars = currentNumberOfCars;
    }

    public int getMaxNumberOfCars(){
        return maxNumberOfCars;
    }

    @Override
    public void load(Car car) { //You can only load cars.
        if ((currentNumberOfCars < maxNumberOfCars) && (distanceToCar(car) < 1)){
            currentNumberOfCars += 1;
            car.setLoaded(true);
        }
    }

    private double distanceToCar(Car car) {
        double distance;
        double xDifference = car.getX() - x;
        double yDifference = car.getY() - y;
        distance = Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
        return distance;
    }

    @Override
    public void unload(Car car) { //You can only load cars.
        if (currentNumberOfCars > 0){
            currentNumberOfCars -= 1;
            car.setLoaded(false);
        }
    }

}
