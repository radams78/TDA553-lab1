public class TwoStateFlatbed extends Flatbed{
    private boolean flatbedUp;

    public TwoStateFlatbed() {
        this.flatbedUp = true;
    } //Constructer

    public void raise(){
        flatbedUp = true;
    }

    public void lowered(){
        flatbedUp = false;
    }

    public boolean getFlatbedUp() {
        return flatbedUp;
    }
}
