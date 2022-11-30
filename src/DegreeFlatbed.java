

public class DegreeFlatbed extends Flatbed{
    private int flatbedAngle;

    public DegreeFlatbed() {
        this.flatbedAngle = 0;
    }

    public void raise(){
        flatbedAngle = Math.min(flatbedAngle += 1, 70);
    }

    public void lowered(){
        flatbedAngle = Math.max(flatbedAngle -= 1, 0);
    }

    public int getFlatbedAngle() {
        return flatbedAngle;
    }

}
