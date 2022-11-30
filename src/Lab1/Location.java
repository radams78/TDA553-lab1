package Lab1;

import Lab1.vehicles.Car;

public interface Location {
    double getPosX();

    double getPosY();

    void moveCarHere(Car car);

}
