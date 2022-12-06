public class CarWorkshop {
    private double radius; // Raduius to check if cars are reasonably close
    private int carAmount; // How many cars that can max be in shop
    private int xPos;
    private int yPos;

    public CarWorkshop(int xPos, int yPos, int radius) {
        this.xPos = xPos; 
        this.yPos = yPos; 
        this.radius = radius; 
    }
    
    Content contents = new Content(xPos,yPos, carAmount);
}
