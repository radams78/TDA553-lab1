public class Cars {

    public int nrDoors;
    public Color color;  
    public double enginePower; 
    public String modelName; 

public Cars(int nrDoors, Color color, double enginePower, string modelName){
    this.nrDoors = nrDoors;
    this.color = color;
    this.enginePower = enginePower
    this.modelName = modelName

}
    
public int getNrDoors(){
    return nrDoors;
}
public double getEnginePower(){
    return enginePower;
}

public double getCurrentSpeed(){
    return currentSpeed;
}

public Color getColor(){
    return color;
}

public void setColor(Color clr){
    color = clr;
}

public void startEngine(){
   
}

public void stopEngine(){
    
}

public abstract double speedFactor();

public abstract void incrementSpeed();
    





}
