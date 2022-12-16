package controller;

import javax.swing.*;

public class GasSpinner extends JSpinner{
    public GasSpinner() {
        super(new SpinnerNumberModel(0, 0, 100, 1));
    }

    public double getGasAmount() {
        return ((int)getValue() / 100);
    }
}
