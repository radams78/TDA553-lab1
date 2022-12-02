import java.awt.Color;
import java.util.ArrayList;

public class CarTransporter extends Truck{
    private ArrayList<Car> loadcarslist;

    int transporterx =getxPos();
    int transportery =getyPos();

    public CarTransporter() {
        super(2, 110, 0, Color.BLUE, "car transporter", 0, 0, Direction.NORTH);
    }
    


@Override
public double openPlatform(){       //platform is not in the superclass, cant override
    return platform.platformAngle = 70;                          //can we move the open and close func to Truck?
}

@Override
public double closePlatform(){       //platform is not in the superclass, cant override
    return platform.platformAngle = 0;                          //can we move the open and close func to Truck?
}



private boolean Carxposisclose(Car car, int transporterx){  //check nearby cars in x
    if(car.getxPos() < (transporterx+20) & car.getxPos() > (transporterx-20)){
        return true;
    }else{
        return false;
    }
}

private boolean Caryposisclose(Car car, int transportery){  //check nearby cars in y
    if(car.getyPos() < (transportery+20) & car.getyPos() > (transportery-20)){
        return true;
    }else{
        return false;
    }
}

public void findCloseCars(int transporterx, int transportery){

    loadcarslist = new ArrayList<Car>();        //make a list of nearby cars
    
    for (Car car : Main.cars){
        if(Carxposisclose(car, transportery) & Caryposisclose(car, transportery)){
            loadcarslist.add(car);
        }
    }
}

//do we need a loadCars function?

public void unloadCars(Car car){
    if(platform.platformAngle == 70){
        car.setxPos(transporterx-10);   //unload next to the transporter
        car.setyPos(transportery);
    }
}

}
