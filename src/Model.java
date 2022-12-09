package src;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Model {

    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    private Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    Controller frame;
    // A list of cars, modify if needed
    ArrayList<Car> cars = new ArrayList<>();

    public Model(ArrayList<Car> cars) {
        this.cars = cars;
    }

    //methods:
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Car car : cars) {
                car.move();
                int x = (int) Math.round(car.getPosition().getXPosition());
                int y = (int) Math.round(car.getPosition().getYPosition());
                frame.drawPanel.moveit(car.getModelName(), x, y);
                // repaint() calls the paintComponent method of the panel
            }
            frame.drawPanel.repaint();
        }
    }

    // Calls the gas method for each car once
    void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Car car : cars
                ) {
            car.gas(gas);
        }
    }
    public void start() {
        timer.start();
    }

    public void update() {

    }
}
