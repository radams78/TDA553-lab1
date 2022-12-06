public class FlatbedWithAngle {
    private int flatbedAngle = 0;
    private final int max_flatbed_angle = 70;


    public int getMax_flatbed_angle() {
        return max_flatbed_angle;
    }

    public void setFlatbedAngle(int flatbedAngle) {
        this.flatbedAngle = flatbedAngle;
    }

    public void lowerFlatbed(TruckWithFlatbed other) {
        if (other.getCurrentSpeed() == 0 && getFlatbedAngle() > 0) {
            decreaseFlatbedAngle();
            if (getFlatbedAngle() == 0){
                other.setFlatbedFastened(true);
            }
        }
    }

    public void raiseFlatbed(TruckWithFlatbed other){
        if (other.getCurrentSpeed() == 0 && getFlatbedAngle() < getMax_flatbed_angle()) {
            increaseFlatbedAngle();
            other.setFlatbedFastened(false);
        }  
    }

    public void decreaseFlatbedAngle(){
        if (getFlatbedAngle() > 0){
            this.setFlatbedAngle(getFlatbedAngle() - 1);  
        }
    }

    public void increaseFlatbedAngle(){
        if (getFlatbedAngle() < getMax_flatbed_angle()){
            this.setFlatbedAngle(getFlatbedAngle() + 1);  
        }
    }

    public int getFlatbedAngle() {
        return flatbedAngle;
    }


}



