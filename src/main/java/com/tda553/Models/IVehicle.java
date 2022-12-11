package com.tda553.Models;
import java.awt.Color;

public interface IVehicle extends IMovable
{
    int getNrDoors();
    
    double getEnginePower();
  
    double getCurrentSpeed();
 
    Color getColor();

    void setColor(Color clr);

    void startEngine();

    void stopEngine();
    
    void gas(double amount);

    void brake(double amount);

    abstract double speedFactor();
}
