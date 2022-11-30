public class CarRepairShop implements Load{
    private int maxNumberOfCars;
    private int currentNumberOfCars;
    private double x;
    private double y;

    public CarRepairShop(int maxNumberOfCars, int currentNrOfCars){
        this.maxNumberOfCars = Math.max(maxNumberOfCars, 1);
        this.currentNumberOfCars = 0;
        this.x = 0;
        this.y = 0;
    }

    public void setColor(Color color) {
        this.color = color; //Problem inför imorgon.
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
    public void load() {
        if ((currentNumberOfCars < maxNumberOfCars) && (true)){
            this.loadCar();
            currentNumberOfCars += 1;
        }
    }

    private void loadCar() {
        //TODO implement method that loads a car into CarRepairShop
    }
}
