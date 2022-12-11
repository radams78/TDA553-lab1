package set.MVC.Model;
import java.awt.Color;
public class CarFactory {
    public CarFactory(){

    }

    public Scania createScania(int nrDoors, Color color, int enginePower, String modelName, int maxAngle, int xPosition, int yPosition){
        Scania scania = new Scania(nrDoors, color, enginePower, modelName, maxAngle);
        scania.setCoordinates(xPosition, yPosition);
        return scania;
    }
    public Volvo240 createVolvo(int nrDoors, Color color, int enginePower, String modelName, int xPosition, int yPosition){
       Volvo240 volvo = new Volvo240(nrDoors, color, enginePower, modelName);
       volvo.setCoordinates(xPosition, yPosition);
        return volvo;
    }
    public Saab95 createSaab(int nrDoors, Color color, int enginePower, String modelName, int xPosition, int yPosition){
        Saab95 saab = new Saab95(nrDoors, color, enginePower, modelName);
        saab.setCoordinates(xPosition, yPosition);
        return saab;
    }
}
