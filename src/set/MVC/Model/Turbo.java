
// Module to hold the class turbo

// --- Packages --- //

package set.MVC.Model;

// --- Imports --- //

// --- Class --- //

 public class Turbo {
    
    private boolean turbo;
    
    // --- Constructor --- //
    
    public Turbo() {
        turbo = false;
    }

    // --- Methods --- //

    // Methods that get values
    public boolean getTurbo() {
        return turbo;
    }

    // Methods that set values
    public void setTurboOn() {
        turbo = true;
    }    

    public void setTurboOff() {
        turbo = false;
    }
}