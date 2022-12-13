package Buttons;

import java.util.List;

import javax.swing.JButton;

import Model.TurboCar;



public class TurboOffButton extends JButton {

    public TurboOffButton(List<TurboCar> turboCars) {
        super("Saab Turbo off");
        addActionListener(e -> {
            for (TurboCar turboCar : turboCars) {
                turboCar.setTurboOff();

            }
        });

    }

   
}
