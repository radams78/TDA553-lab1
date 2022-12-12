package Model;

public class Ramp {
    private State state = State.UP;

    public void raiseRamp() {
        state = State.UP;
    }

    public void lowerRamp() {
        state = State.DOWN;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
