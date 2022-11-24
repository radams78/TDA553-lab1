public class Scania {
    
    //------------------------------------- Variables ----------------------------------------//
    private int platformAngle = 0;
    
    private final int MAXPLATFORMANGLE = 70;

    //------------------------------------- Constructor ----------------------------------------//

    public Scania(){


    }

     //------------------------------------- Getters ----------------------------------------//

    public int getPlatformAngle() {
        return this.platformAngle;
    }

    //------------------------------------- Misc platformAngle ----------------------------------------//

    public void lowerPlatform(int n) {
    if(n<0) { // Vi vill bara ta in positiva heltal, annars blir det minus minus och då blir det plus, alltså den ökar istället för minskar! 
        System.out.println("Error! Ange ett positivt heltal");
    }
    else if(this.getPlatformAngle() - n >= 0) { // Kollar om vi kan sänka n mycket utan att hamna under 0 
        this.platformAngle -= n; // om det går att sänka n mycket, gör det! 
    }
    else { // Annars skicka felmeddelande 
        System.out.println("Du kan inte sänka så mycket! Du kan sänka max" + this.getPlatformAngle());
    }
    }

    public void raisePlatform(int n) {
    if(this.getCurrentSpeed() > 0) { // The platform must not be raised if the truck is in motion
        System.out.println("Stanna fordonet INNAN du försöker flytta plattformen!");
    }
    else if(n<0) {
        System.out.println("Error! Kan bara öka med ett positivt tal!");
    }
    else if(this.getPlatformAngle() + n >= 0) { // Kollar om vi kan öka n mycket utan att hamna över 70 
        this.platformAngle -= n; // om det går att öka n mycket, gör det! 
    }
    else { // Annars skicka felmeddelande 
        System.out.println("Du kan inte öka så mycket! Du kan öka max" + (MAXPLATFORMANGLE-this.getPlatformAngle()));
    }
    }

    public void

}
