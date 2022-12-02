

public class DegreeFlatbed implements Flatbed{
    private int flatbedAngle;

    public DegreeFlatbed() {
        this.flatbedAngle = 0;
    }

    public void raise(){
        flatbedAngle = Math.min(flatbedAngle += 1, 70);
    }

    public void lower(){
        flatbedAngle = Math.max(flatbedAngle -= 1, 0);
    }

    public int getFlatbedAngle() {
        return flatbedAngle;
    }

}
