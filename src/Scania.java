import java.awt.*;

public class Scania extends Truck{
    int flatbedAngle;
    final int max_flatbed_angle;
    
    public Scania() {
        super(2,70, Color.orange, "Scania");
        flatbedAngle = 0;
        max_flatbed_angle = 70;
        FlatbedWithAngle flatbed = new Flatbed();
    }
    
    @Override
    public void lowerFlatbed() {
        if (this.getCurrentSpeed() == 0 && flatbedAngle > 0) {
            flatbedAngle -= 1;
            if (flatbedAngle == 0){
                flatbedFastened = true;
            }
        }
    }
    @Override
    public void raiseFlatbed(){
        if (this.getCurrentSpeed() == 0 && flatbedAngle < max_flatbed_angle) {
            flatbedAngle += 1;
            flatbedFastened = false;
        }  
    }

    public int getFlatbedAngle() {
        return flatbedAngle;
    }
        

}