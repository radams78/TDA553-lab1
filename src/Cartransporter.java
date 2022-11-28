import java.awt.*;

public class Cartransporter extends TruckWithFlatbed{
    Loadable loadedCars;
    FlatbedWithRamp cartransporterFlatbed;

    public Cartransporter(){
        super(2,70, Color.yellow, "Cartransporter");
            flatbedFastened = true;
            loadedCars = new Loadable(6);
            cartransporterFlatbed = new FlatbedWithRamp();
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

    public void lowerFlatbed() {
        cartransporterFlatbed.raiseFlatbed(this);
    }

    public void raiseFlatbed() {
       cartransporterFlatbed.raiseFlatbed(this);
    }

}