package Spinners;

import javax.swing.*;


public class GasSpinner extends JSpinner {
    
    private int gasAmount;
    
    public GasSpinner(){
        super(new SpinnerNumberModel(0,0,100,1));
        addChangeListener(e -> {
            gasAmount = (int) ((JSpinner)e.getSource()).getValue();
        });
    }

    public int getGasValue(){
        return gasAmount;
    }
}
