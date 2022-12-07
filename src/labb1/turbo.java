package labb1;

//Cars will be able to inherit this class so that it has-a turbo
public class Turbo {

    private boolean turboOn;
    private boolean hasTurbo;

    public Turbo(boolean hasTurbo) {
        this.hasTurbo = hasTurbo;
    }

    /**
     * Sets the boolean turboOn to true
     */
    public abstract void setTurboOn() {
        this.turboOn = true;
    }

    /**
     * Sets the boolean turboOn to false
     */
    public abstract void setTurboOff() {
        this.turboOn = false;
    }// setTurboOff()
}
