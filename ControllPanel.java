
import java.util.List;

import javax.swing.*;

import Buttons.*;

import java.awt.*;

import Model.Truck;
import Model.TurboCar;

import Model.Vehicle;
import Spinners.GasSpinner;

public class ControllPanel extends JPanel{
    
    public ControllPanel(List<Truck> trucks, List<TurboCar> turboCars, 
    List<Vehicle> vehicles, GasSpinner gasSpinner){
        
        setLayout(new GridLayout(2,4));

        add(new GasButton(vehicles, gasSpinner), 0);
        add(new TurboOnButton(turboCars), 1);
        add(new LiftBedButton(trucks), 2);
        add(new BrakeButton(vehicles, gasSpinner), 3);
        add(new TurboOffButton(turboCars), 4);
        add(new LowerBedButton(trucks), 5);
        setPreferredSize(new Dimension((400)+4, 200));
        
        setBackground(Color.CYAN);
    }
}
