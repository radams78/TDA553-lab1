public class FlatbedWithAngle {
    int      flatbedAngle = 0;
    int      max_flatbed_angle = 70;



    public void lowerFlatbed(TruckWithFlatbed other) {
        if (other.getCurrentSpeed() == 0 && flatbedAngle > 0) {
            flatbedAngle -= 1;
            if (flatbedAngle == 0){
                other.flatbedFastened = true;
            }
        }
    }

    public void raiseFlatbed(TruckWithFlatbed other){
        if (other.getCurrentSpeed() == 0 && flatbedAngle < max_flatbed_angle) {
            flatbedAngle += 1;
            other.flatbedFastened = false;
        }  
    }

    public int getFlatbedAngle() {
        return flatbedAngle;
    }


}



