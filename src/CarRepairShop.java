public class CarRepairShop implements Load{
    private int maxNrOfCars;
    private int currentNrOfCars;
    
    public CarRepairShop(int maxNrOfCars, int currentNrOfCars){
        this.maxNrOfCars = Math.max(maxNrOfCars, 0);
        this.currentNrOfCars = Math.max(currentNrOfCars, 0);
    }
    
    public int getCurrentNrOfCars() {
        return currentNrOfCars;
    }

    public void setCurrentNrOfCars(int currentNrOfCars) {
        this.currentNrOfCars = currentNrOfCars;
    }

    public int getMaxNrOfCars(){
        return maxNrOfCars;
    }

    @Override
    public void load() {
        
        
    }
}
