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



        
      
        
    }
}
