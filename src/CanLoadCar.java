package src;

public abstract class CanLoadCar {
    public int xCoordinate;
    public int yCoordinate;
    
    public CanLoadCar(int x, int y){
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public abstract void loadCar(Vehicle car);

    public abstract void unloadCar(); 

    public Boolean loadableVehicleInCloseVicinity(Vehicle car) {
       double deltaX = Math.max(this.xCoordinate, car.getX()) - Math.min(this.xCoordinate, car.getX());
       double deltaY = Math.max(this.yCoordinate, car.getY()) - Math.min(this.yCoordinate, car.getY());
       if(deltaX < 10 && deltaY < 10){
            return true;
       }
        else {
            return false;
        }
    }


    public int unloadXCoordinate(){
        return this.xCoordinate + 5;  
    }

    public int unloadYCoordinate(){
        return this.yCoordinate + 5;
    }
}
