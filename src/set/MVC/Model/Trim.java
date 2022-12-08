// Module to hold the class Trim

// --- Packages --- //

package set.MVC.Model;


// --- Imports --- //

// --- Class --- //

 public class Trim {
    
    private Double trimFactor;
    
    // --- Constructor --- //

    public Trim(Double trimFactor){
        this.trimFactor = trimFactor;
    }

    // --- Methods --- //
    
    public Double getTrimFactor(){
        return trimFactor;
    }
}
