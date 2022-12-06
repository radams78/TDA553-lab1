/*Carshop should be able to load cars and hold max X cars
Cars can only be loaded if they are reasonably close to the workshop.
When a car is unloaded, it should then end up reasonably close to the workshop. */

//NEEDS: position, Load(recieve cars from CarTransporter)- and Unload(Unload next to shop)- function

import java.awt.*;
import java.util.ArrayList;

public class CarShop {
    private int x; // X position for carshop
    private int y; // Y position for carshop
    private double radius; // Raduius to check if cars are reasonably close
    private int carAmount; // How many cars that can max be in shop
    private ArrayList<Car> carsInShop; //List if how many cars are in the shop

    public CarShop(int x, int y, double radius, int carAmount) {

        this.x = x; 
        this.y = y; 
        this.radius = radius; 
        this.carAmount = carAmount; 
    }

    public int getxPos() {
        return x;
    }

    public int getyPos() {
        return y;
    }
   
    public double getRadius(){ //FIX RADIUS STUFF,needs function for calculating distance between car and CarShop
        return radius;
    }

    public void carAmount(){
        carAmount = 2;
    }


    private boolean howManyCarsInShop() { 
        if (carsInShop.size() >= carAmount) {
            return false;
        } else {
            return true;
        }
    }

    public void loadCars(Car car){
        
        if(howManyCarsInShop() == true){
            carsInShop.add(car);

            //add radius stuff
        }
    }

    public void unloadCars(Car car) {
        //add radius stuff
    }

    
}


