package Lab1.vehicles;

import java.awt.*;
import java.util.Random;

public abstract class Car extends Vehicle implements ILoadable {

    protected Car(int nrDoors, double enginePower, double currentSpeed, Color color, String modelName) {
        super(nrDoors, enginePower, currentSpeed, color, modelName);
    }

    public void load(ICanLoad loaderObject) {
        stopEngine();
        moveToCoords(loaderObject.getPosX(), loaderObject.getPosY());
        loaderObject.load(this);
    }

    public void unload(ICanLoad loaderObject) {
        Random randomizer = new Random();
        moveToCoords(loaderObject.getPosX() + randomizer.nextDouble(-2, 2),
                loaderObject.getPosY() + randomizer.nextDouble(-2, 2));
        loaderObject.unload(this);
    }

    private void moveToCoords(double x, double y) {
        this.posX = x;
        this.posY = y;
    }
}
