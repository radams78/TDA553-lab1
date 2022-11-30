public class CarRepairShop implements Load{
    private int maxNumberOfCars;
    private int currentNumberOfCars;

    public CarRepairShop(int maxNumberOfCars, int currentNrOfCars){
        this.maxNumberOfCars = Math.max(maxNumberOfCars, 1);
        this.currentNumberOfCars = 0;
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
        this.loadACar();
        
    }

    private void loadACar() {
        //TODO implement method that loads a car into CarRepairShop
    }
}
