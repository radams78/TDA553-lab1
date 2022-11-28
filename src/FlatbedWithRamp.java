import java.awt.*;

public class FlatbedWithRamp {
    boolean flatbedFastened;

    public FlatbedWithRamp() {
        flatbedFastened = true;
    }

    public void setFlatbedFastened(boolean status) {
            flatbedFastened = status;
    }

    public void lowerFlatbed() {
        if (this.getCurrentSpeed() == 0) {
            flatbedFastened = true;
        }

    }

    public void raiseFlatbed() {
        if (this.getCurrentSpeed() == 0) {
            flatbedFastened = false;
        }

    }
}
