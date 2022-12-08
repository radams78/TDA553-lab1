package set.MVC.Model;
import java.awt.Color;
public class CarFactory {
    public CarFactory(){

    }

    public Scania createScania(int nrDoors, Color color, int enginePower, String modelName, int maxAngle){
        return new Scania(nrDoors, color, enginePower, modelName, maxAngle);
    }
    public Volvo240 createVolvo(int nrDoors, Color color, int enginePower, String modelName){
        return new Volvo240(nrDoors, color, enginePower, modelName);
    }
    public Saab95 createSaab(int nrDoors, Color color, int enginePower, String modelName){
        return new Saab95(nrDoors, color, enginePower, modelName);
    }
}
