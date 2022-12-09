import Model.CarTransporter;
import Model.Saab95;
import Model.Scania;
import Model.Volvo240;

public class VehicleFactory {
    public static Volvo240 makeVolvo(){
        return new Volvo240();
    }

    public static Saab95 makeSaab95(){
        return new Saab95();
    }

    public static Scania makeScania(){
        return new Scania();
    }

    public static CarTransporter makCarTransporter(){
        return new CarTransporter();
    }
}
