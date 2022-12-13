
import javax.swing.JPanel;

import javax.swing.*;
import Spinners.GasSpinner;

import java.awt.*;


public class GasPanel extends JPanel{
    
    public GasPanel(GasSpinner gasSpinner){

        setLayout(new BorderLayout());
        add(new JLabel("Amount of gas"), BorderLayout.PAGE_START);
        add(gasSpinner, BorderLayout.PAGE_END);
    }
}
