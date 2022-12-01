package src;

import java.util.Set;

public class Ramp {
    private State state = State.DOWN;

    public void raiseRamp() {
        state = State.UP;
    }

    public void lowerRamp() {
        state = State.DOWN;
    }

    public State getState() {
        return state;
    }
}
