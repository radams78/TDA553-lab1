public class Application {
    
    public static void main(String[] args) {
        // Instance of this class

        VehicleModel model = VehicleModelFactory.makeDefaultController();
      
        VehicleController cc = new VehicleController(model);
       
        // Start the timer
        cc.start();
    }
}
