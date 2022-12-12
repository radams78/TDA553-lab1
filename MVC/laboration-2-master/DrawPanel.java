import java.awt.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import Model.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    private ArrayList<Vehicle> sprites;

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
    }
    public void carsToDraw(ArrayList<Vehicle> sprites) {
        this.sprites = sprites;
    }   

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Vehicle car : sprites)
            try {
                BufferedImage image = ImageIO.read(DrawPanel.class.getResourceAsStream(car.getPictureFile()));
                g.drawImage(image, (int) car.getX(), (int) car.getY(), null);
            } catch (IOException e) {
                e.printStackTrace();
            }
       

    }
}
