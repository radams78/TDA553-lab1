/*Carshop should be able to load cars and hold max X cars
Cars can only be loaded if they are reasonably close to the workshop.
When a car is unloaded, it should then end up reasonably close to the workshop. */


//NEEDS: position, Load(recieve cars from CarTransporter)- and Unload(Unload next to shop)- function

import java.awt.*;
import java.util.ArrayList;

public class CarShop  {
    private double x; //X position for carshop
    private double y; //Y position for carshop
    private double radius; //Raduius for in what distance the cars can go to this shop
    private int carAmount; // How many cars that can max be in shop
    private ArrayList<Car> carsInShop;

    public CarShop(double x, double y, double radius, int carAmount){
        
        this.x = x; //Position
        this.y = y; //Position
        this.radius = radius; //check if cars are reasonably close 
        this.carAmount = carAmount; //Max cars allowed
    }
    
    private boolean howManyCarsInShop(){ //när vi skapar LOAD, kolla "howManyCarsInShop" först, beroende på den kan vi loada eller ej

        if(carsInShop.size() >= carAmount){
            return false;
        }else{
            return true;
        }
    }
    

    
    public void unloadCars(CarTransporter carTransporter){
        carTransporter.unloadCars();
    }
    
}






