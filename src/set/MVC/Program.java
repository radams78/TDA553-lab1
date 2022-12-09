package set.MVC;

import set.MVC.Model.ModelHead;

public class Program {
    
    public static void main(String[] args) {

        ModelHead model = new ModelHead();
        model.createStandardModel();
        CarController view = new CarController("car game", model);

        model.addToObservers(view);
        model.addToObservers(view.drawPanel);
        model.run();



        
        /*// Instance of this class
        private Timer timer = new Timer(delay, new ActionListener());
        
        ModelHead modelhead = new ModelHead();
        CarController controller = new CarController(modelhead);
    
        CarView frame = new CarView("CarSim 1.0", controller);
        
        

        modelhead.createVolvo();
        modelhead.createSaab();
        modelhead.createScania();

        ArrayList<Vehicles> vehicles = modelhead.getVehicleList();
        vehicles.get(0).setCoordinates(0, 50);
        vehicles.get(1).setCoordinates(100, 150);  // For clarity
        vehicles.get(2).setCoordinates(0, 100);


        // Start a new view and send a reference of self
        

        // Start the timer
        controller.timer.start();
         */



        // 


        
    }
}
