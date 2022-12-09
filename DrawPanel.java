import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

import Model.Vehicle;



// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    ArrayList<Point> vehiclePoints = new ArrayList<>();
    ArrayList<BufferedImage> images = new ArrayList<>();

    void moveit(int index, int x, int y){
       vehiclePoints.set(index, new Point(x, y));
       
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y, ArrayList<Vehicle> vehicles) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);

        int yPoint = 0;

        for (Vehicle vehicle : vehicles) {
  
            vehiclePoints.add(new Point(0, yPoint));
            vehicle.setY((double) yPoint);
            yPoint += 100;

            try {
                images.add(ImageIO.read(DrawPanel.class.getResourceAsStream("pics/" + vehicle.getModelName() + ".jpg")));
            } catch (IOException e) {   
                e.printStackTrace();
            }
        }
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (BufferedImage image : images) {
            int index = images.indexOf(image);
            Point point = vehiclePoints.get(index);
            g.drawImage(image, point.x, point.y, null);

        }
         // see javadoc for more info on the parameters

    }
}