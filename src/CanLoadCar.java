package src;

public abstract class CanLoadCar {

    public int xCoordinate;
    public int yCoordinate;
    
    public abstract void loadCar(Vehicle car);

    public abstract void unloadCar(); 

    public abstract void loadableVehiclesInCloseVicinity();

    public int unloadXCoordinate(){
        return this.xCoordinate + 5;
    }

    public int unloadYCoordinate(){
        return this.yCoordinate + 5;
    }
}
