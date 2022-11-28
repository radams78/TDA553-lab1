package labb1;

//Superclass contract for any movable objects
public interface Movable {
    //Interface that represent ay movable object
    void move(); //moves the object
    void turnLeft(); //turns the object
    void turnRight(); //turns the object

    double getX();//returns x position value
    double getY();//return  y position value
}
