package labb1;

//Cars will be able to inherit this class so that it has-a turbo
public class Turbo {

    private boolean turboOn;

    public Turbo(boolean turboOn) {
        this.turboOn = turboOn;
    }

    /**
     * Sets the boolean turboOn to true
     */
    public void setTurboOn() {
        this.turboOn = true;
    }

    /**
     * Sets the boolean turboOn to false
     */
    public void setTurboOff() {
        this.turboOn = false;
    }// setTurboOff()
}
