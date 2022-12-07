import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.util.HashMap;

import labb1.CarsModel;
import labb1.Vehicle;

import java.util.ArrayList;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel implements Observer {

    CarsModel model;

    public DrawPanel(CarsModel model, int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
        this.model = model;
    }

    // Just a single image, TODO: Generalize
    ArrayList<BufferedImage> images = new ArrayList<BufferedImage>();
    // To keep track of a singel cars position

    ArrayList<Point> points = new ArrayList<Point>();

    @Override
    public void update() {
        addDrawPoints();
        repaint();

    }

    private void bindImages(Vehicle vehicle, Point point) {
        AssetHandler.bindPointToNamedImage(vehicle.getModelName(), point);
    }

    // TODO: Make this genereal for all cars
    private void addDrawPoints() {
        for (Vehicle vehicle : model.getVehicles()) {

            int x = (int) Math.round(vehicle.getX());
            int y = (int) Math.round(vehicle.getY());
            Point point = new Point(x, y);
            points.add(point);
            bindImages(vehicle, point);
        }
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        int i = 0;
        super.paintComponent(g);
        for (Point pt : points) {
            g.drawImage(AssetHandler.getAssetFromPoint(pt), pt.x, pt.y, null);
            i++;
        }
        points.clear();// see javadoc for more info on the parameters
    }
}
