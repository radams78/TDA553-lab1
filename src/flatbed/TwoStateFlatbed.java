package flatbed;
public class TwoStateFlatbed implements Flatbed{
    private boolean flatbedUp;

    public TwoStateFlatbed() {
        this.flatbedUp = true;
    } //Constructur

    public void raise(){
        flatbedUp = true;
    }

    public void lower(){
        flatbedUp = false;
    }

    public boolean getFlatbedUp() {
        return flatbedUp;
    }
}
