public abstract class Plattform {
    
    public int plattformState;

    abstract void plattformUp(int state);

    abstract void plattfromDown(int state);

    abstract void setPlattformState(int plattformState);

    public int getPlattformState() {
        return plattformState;
    }
}
