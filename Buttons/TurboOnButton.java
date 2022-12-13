package Buttons;

import java.util.List;

import javax.swing.JButton;

import Model.TurboCar;


public class TurboOnButton extends JButton {

    public TurboOnButton(List<TurboCar> turboCars) {
        super("Saab Turbo on");
        addActionListener(e -> {
            for (TurboCar turboCar : turboCars) {
                turboCar.setTurboOn();
            }
        });
    }

    
}
    

