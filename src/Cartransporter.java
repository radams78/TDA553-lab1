import java.awt.*;

public class Cartransporter extends Flatbed{

    Loadable loadedCars;
    public Cartransporter(){
        super(2,70, Color.yellow, "Cartransporter");
            flatbedFastened = true;
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