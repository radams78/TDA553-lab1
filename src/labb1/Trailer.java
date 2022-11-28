package labb1;

public abstract class Trailer {
    private int maxLoad;
    private boolean platformExtended;
    

    public Trailer(int maxLoad){
        this.maxLoad = maxLoad;
    }
    
    // Returns true if the platsform is extended 
    public Boolean getPlatformExtended(){
        return platformExtended;
    }

    // Set platromExtended
    public void setPlatformExtended(Boolean state){
        this.platformExtended = state;
    }

    // Returns max load 
    public int getMaxLoad(){
        return maxLoad;
    }

}
