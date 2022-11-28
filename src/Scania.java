import java.awt.*;

public class Scania extends TruckWithFlatbed {
    int flatbedAngle;
    final int max_flatbed_angle;
    FlatbedWithAngle scaniaFlatbed;
    
    public Scania() {
        super(2,70, Color.orange, "Scania");
        flatbedAngle = 0;
        max_flatbed_angle = 70;
        scaniaFlatbed = new FlatbedWithAngle();
    }

    public void lowerFlatbed() {
        scaniaFlatbed.lowerFlatbed(this);
    }

    public void raiseFlatbed() {
        scaniaFlatbed.raiseFlatbed(this);
    }
}